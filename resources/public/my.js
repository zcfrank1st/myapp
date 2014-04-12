$(document).ready(function () {
    // 地图展现
    var R = Raphael("map", 600, 500);
    //调用绘制地图方法
    paintMap(R);

    var textAttr = {
        "fill": "#000",
        "font-size": "12px",
        "cursor": "pointer"
    };


    for (var state in china) {
        (function (st, state) {
            //获取当前图形的中心坐标
            var xx = st.getBBox().x + (st.getBBox().width / 2);
            var yy = st.getBBox().y + (st.getBBox().height / 2);

            //***修改部分地图文字偏移坐标
            switch (china[state]['name']) {
                case "江苏":
                    xx += 5;
                    yy -= 10;
                    break;
                case "河北":
                    xx -= 10;
                    yy += 20;
                    break;
                case "天津":
                    xx += 10;
                    yy += 10;
                    break;
                case "上海":
                    xx += 10;
                    break;
                case "广东":
                    yy -= 10;
                    break;
                case "澳门":
                    yy += 10;
                    break;
                case "香港":
                    xx += 20;
                    yy += 5;
                    break;
                case "甘肃":
                    xx -= 40;
                    yy -= 30;
                    break;
                case "陕西":
                    xx += 5;
                    yy += 10;
                    break;
                case "内蒙古":
                    xx -= 15;
                    yy += 65;
                    break;
                default:
            }
            //写入文字
            china[state]['text'] = R.text(xx, yy, china[state]['name']).attr(textAttr);
        })(china[state]['path'], state);
    }

    var requestDataAndRefresh = function () {
        $.ajax({
            url: '/jsondata',
            type: 'GET',
            async: false
        })
            .done(function (data) {
                //获取json串
                var contents = JSON.parse(data);

                for (var state in china) {
                    for (var i = 0; i < contents.length; i++) {
                        if (contents[i].place == state) {
                            if (contents[i].total > 999) {
                                //绿色
                                china[state]['path'].animate({fill: "#00ff00", stroke: "#eee"}, 2000);
                            } else if (contents[i].total > 500 && contents[i].total <= 999) {
                                //蓝色
                                china[state]['path'].animate({fill: Raphael.color("blue"), stroke: "#eee"}, 2000);
                            } else if (contents[i].total <= 500 && contents[i].total > 100) {
                                // 橘黄色
                                china[state]['path'].animate({fill: Raphael.color("orange"), stroke: "#eee"}, 2000);
                            } else {
                                // 红色
                                china[state]['path'].animate({fill: Raphael.color("red"), stroke: "#eee"}, 2000);
                            }
                        }
                    }
                }
            })
            .fail(function () {

            });


    }

    var cleanMap = function () {
        for (var state in china) {
            china[state]['path'].animate({fill: "#97d6f5", stroke: "#eee"}, 1000);
        }
    }

    var total = function () {
        requestDataAndRefresh();
        cleanMap();
    }

    total();
    setInterval(total, 5000);
});
