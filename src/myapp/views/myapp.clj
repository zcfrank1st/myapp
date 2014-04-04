(ns myapp.views.myapp
  (:use hiccup.core)
  (:use hiccup.page))


;;index page
(defn index-page
  []
  (html5
    [:head
      [:title "Page Picker ?!"]
      (include-css "/css/bootstrap.min.css")
      (include-js "/js/jquery.min.js" "/js/my.js")]
    [:body
      ;#navbar
      [:div.navbar.navbar-fixed-top.navbar-inverse
        [:div.navbar-inner
          [:div.container
            ]]]
      [:br]
      [:br]
      [:br]
      ;#title
      [:div.container
        [:div.hero-unit
          [:blockquote [:h1 "Page Picker ?!"]
            [:small "可以随机打开喜欢网站的小玩意"]]]]

      ;#content
      [:div.container
        [:div#cloud  ]]


      ;#add word
      [:div.container
          [:div.input-group.col-md-2
            [:span.input-group-addon "标签"]
            [:input.form-control {:id "lab" :type "text" :placeholder "关键词"} ]]
          [:br]
          [:div.input-group.col-md-3
            [:span.input-group-addon "地址"]
            [:input.form-control {:id "uri" :type "text" :placeholder "网址"} ]]
          [:br]
          [:button.btn.btn-info {:id "b"} "添加！"] "&nbsp;&nbsp;&nbsp;&nbsp;"
          [:input.btn.btn-info {:type "reset" :value "清空！"}]]]
     ))
