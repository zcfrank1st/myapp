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
                 "/css/ace-skins.min.css"
                 "/css/bootstrap-responsive.css"
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

                 "/my.js")]
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
           [:a {:href "http://localhost:3000"}
            [:i.icon-off]
            "注销"]]]]]]]]

    [:div.main-container {:id "main-container"}
     [:div.sidebar {:id "sidebar"}
      [:ul.nav.nav-list
       [:li.active
        [:a {:href "#"}
         [:i.icon-dashboard]
         [:span.menu-text "面试记录"]]]]
      [:div.sidebar-collapse {:id "sidebar-collapse"}
       [:i.icon-double-angle-left {:data-icon1 "icon-double-angle-left" :data-icon2 "icon-double-angle-right"}]]]]

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
         [:table
          [:thead
           [:tr
            [:th "编号"]
            [:th "姓名"]
            [:th "年龄"]
            [:th "性别"]
            [:th "学历"]
            [:th "曾工作公司及时间"]
            [:th "面试时间"]
            [:th "面试问题"]
            [:th "状态"]]]
          [:tbody
           ]]]]
       [:div.row
        [:div.col-xs-12
         [:a.btn.btn-info.btn-xs
          {:id "add" :href "#modal-form-add" :role "button" :data-toggle "modal"}
          [:i.icon-asterisk]
          "增加"]
         "&nbsp;&nbsp;"
         [:a.btn.btn-info.btn-xs
          {:id "edit" :href "#modal-form-edit" :role "button" :data-toggle "modal"}
          [:i.icon-pencil]"修改"]
         "&nbsp;&nbsp;"
         [:a.btn.btn-danger.btn-xs
          {:id "del" :href "#modal-form-del" :role "button" :data-toggle "modal"}
          [:i.icon-trash]"删除"]]]

       [:div.modal.fade {:id "modal-form-add" :tabindex "-1"}
        [:div.modal-dialog
         [:div.modal-content
          [:div.modal-header.no-padding
           [:div.table-header
            [:button.close
             {:type "button" :data-dismiss "modal" :aria-hidden "true"}
             [:span.white "&times;"]]
            " 面试记录增加"]]
          [:div.modal-body.no-padding
           ]
          [:div.modal-footer.no-margin-top
           [:button.btn.btn-xs.btn-info.pull-left {:id "add-ok"}
            [:i.icon-ok]
            "确认"]
           [:button.btn.btn-xs.btn-info.pull-left {:id "add-remove" :data-dismiss "modal"}
            [:i.icon-remove]
            "取消"]]]]]

       [:div.modal.fade {:id "modal-form-edit" :tabindex "-1"}
        [:div.modal-dialog
         [:div.modal-content
          [:div.modal-header.no-padding
           [:div.table-header
            [:button.close
             {:type "button" :data-dismiss "modal" :aria-hidden "true"}
             [:span.white "&times;"]]
            " 面试记录修改"]]
          [:div.modal-body.no-padding
           ]
          [:div.modal-footer.no-margin-top
           [:button.btn.btn-xs.btn-info.pull-left {:id "edit-ok"}
            [:i.icon-ok]
            "确认"]
           [:button.btn.btn-xs.btn-info.pull-left {:id "edit-remove" :data-dismiss "modal"}
            [:i.icon-remove]
            "取消"]]]]]

       [:div.modal.fade {:id "modal-form-del" :tabindex "-1"}
        [:div.modal-dialog
         [:div.modal-content
          [:div.modal-header.no-padding
           [:div.table-header
            [:button.close
             {:type "button" :data-dismiss "modal" :aria-hidden "true"}
             [:span.white "&times;"]]
            " 是否删除选中项？"]]

          [:div.modal-footer.no-margin-top
           [:button.btn.btn-xs.btn-info.pull-left {:id "del-ok"}
            [:i.icon-ok]
            "确认"]
           [:button.btn.btn-xs.btn-info.pull-left {:id "del-remove" :data-dismiss "modal"}
            [:i.icon-remove]
            "取消"]]]]]]]]))
