$(document).ready(function(){
  $("#b").click(function(){
    $.ajax({
      url: '/add/' + 3,
      type: 'get'
    })
    .done(function(){
    })
    .fail(function(){
    });
  });

});
