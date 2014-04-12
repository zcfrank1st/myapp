(ns myapp.views.ace
  (:use hiccup.core)
  (:use hiccup.page))


(defn ace-page
  []
  (html5
    [:head
     [:title "DP Data Monitor"]
     (include-css "/css/bootstrap.min.css"
                  "/css/bootstrap-responsive.min.css"
                  "/css/font-awesome.min.css"
                  "/css/ace.min.css"
                  "/css/ace-rtl.min.css"
                  "/css/ace-skins.min.css"
                  )

     (include-js "http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"
                 "/js/bootstrap.min.js"
                 "/js/jquery.metadata.js"
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
      [:div.main-container-inner
       [:a.menu-toggler {:id "menu-toggler" :href "#"}
        [:span.menu-text]]
       [:div.sidebar {:id "sidebar"}
        [:ul.nav.nav-list
         [:li.active
          [:a {:href "#"}
           [:i.icon-dashboard]
           [:span.menu-text "PV监控"]]]
         [:li
          [:a {:href "#"}
           [:i.icon-dashboard]
           [:span.menu-text "UV监控"]]]
         [:li
          [:a {:href "#"}
           [:i.icon-dashboard]
           [:span.menu-text "团购下单量监控"]]]
         [:li
          [:a {:href "#"}
           [:i.icon-dashboard]
           [:span.menu-text "预约预订量监控"]]]
         [:li
          [:a {:href "#"}
           [:i.icon-dashboard]
           [:span.menu-text "..."]]]]
        [:div.sidebar-collapse {:id "sidebar-collapse"}
         [:i.icon-double-angle-left {:data-icon1 "icon-double-angle-left" :data-icon2 "icon-double-angle-right"}]]]

      [:div.main-content
       [:div.page-content
        [:div.page-header
         [:h1 "PV监控 "
          [:small
           [:i.icon-double-angle-right]
           " 点评网全国PV数据监控"]]]
        [:div.row
         [:div]
          [:div#map {:class "center"}]]]]]]]))
