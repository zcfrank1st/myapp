(ns myapp.views.ace
  (:use hiccup.core)
  (:use hiccup.page))


(defn ace-page
  []
  (html5
   [:head
    [:title "DP Data Monitor"]
    (include-css "/css/bootstrap.min.css"
                 "/css/font-awesome.min.css"
                 "/css/ace.min.css"
                 "/css/ace-rtl.min.css"
                 "/css/ace-skins.min.css"
                 "/css/bootstrap-responsive.min.css"
                 "/css/tablecloth.css"
                 "/css/prettify.css")

    (include-js  "http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"
                 "/js/bootstrap.min.js"
                 "/js/jquery.metadata.js"
                 "/js/jquery.tablesorter.min.js"
                 "/js/jquery.tablecloth.js"
                 "/js/typeahead-bs2.min.js"
                 "/js/ace-extra.min.js"
                 "/js/ace-elements.min.js"
                 "/js/ace.min.js"
                 "/js/raphael.js"
                 "/js/chinamapPath.js"
                 "/my.js")]
   [:body
    [:div.navbar.navbar-default {:id "navbar"}
     [:div.navbar-container {:id "navbar-container"}
      [:div.navbar-header.pull-left
       [:a.navbar-brand {:href "#"}
        [:small
         " DP Data Monitor"]]]]]

    [:div.main-container {:id "main-container"}
     [:div.sidebar {:id "sidebar"}
      [:ul.nav.nav-list
       [:li.active
        [:a {:href "#"}
         [:i.icon-dashboard]
         [:span.menu-text "点评数据监控"]]]]
      [:div.sidebar-collapse {:id "sidebar-collapse"}
       [:i.icon-double-angle-left {:data-icon1 "icon-double-angle-left" :data-icon2 "icon-double-angle-right"}]]]]

     [:div.main-content
      [:div.page-content
       [:div.page-header
        [:h1 "点评数据监控 "
         [:small
          [:i.icon-double-angle-right]
          " 监控点评的全国数据流"]]]
       [:div.row
        [:div.col-xs-12
         [:br]
         [:div#map {:class "center"}]
        ]]]]]))
