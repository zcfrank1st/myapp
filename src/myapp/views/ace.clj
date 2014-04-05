(ns myapp.views.ace
  (:use hiccup.core)
  (:use hiccup.page))


(defn ace-page
  []
  (html5
   [:head
    [:title "DP Interview"]
    (include-css "/css/bootstrap.min.css"
                 "/css/font-awesome.min.css"
                 "/css/ace.min.css"
                 "/css/ace-rtl.min.css"
                 "/css/ace-skins.min.css")
    (include-js  "/js/ace-extra.min.js"
                 "http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"
                 "/js/bootstrap.min.js"
                 "/js/typeahead-bs2.min.js"
                 "/js/ace-elements.min.js"
                 "/js/ace.min.js")]
   [:body
    [:div.navbar.navbar-default {:id "navbar"}
     [:div.navbar-container {:id "navbar-container"}
      [:div.navbar-header.pull-left
       [:a.navbar-brand {:href "#"}
        [:small
         [:i.icon-book]
         " DP Interview"]]]

      [:div.navbar-header.pull-right {:role "navigation"}
       [:ul.nav.ace-nav
        [:li.green
         [:a.dropdown-toggle {:data-toggle "dropdown" :href="#"}
          [:img.nav-user-photo {:src "/img/1.jpg" :atl ""}]
          [:i.icon-caret-down]]
         [:ul.user-menu.pull-right.dropdown-menu.dropdown-yellow.dropdown-caret.dropdown-close
          [:li
           [:a {:href "#"}
            [:i.icon-off]
            "注销"]]]]]]]]

    [:div.main-container {:id "main-container"}
     [:div.sidebar {:id "sidebar"}
      [:ul.nav.nav-list
       [:li.active
        [:a {:href "#"}
         [:i.icon-dashboard]
         [:span.menu-text "面试记录"]]]]]]

     [:div.main-content
      [:div.page-content
       [:div.page-header
        [:h1 "面试记录 "
         [:small
          [:i.icon-double-angle-right]
          " 记录下点评的每场面试"]]]
       [:div.row
        [:div.col-xs-12
         ;;具体表格实现
         ]]]]]))
