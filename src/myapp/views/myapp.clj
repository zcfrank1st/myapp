(ns myapp.views.myapp
  (:use hiccup.core)
  (:use hiccup.page)
  (:require [myapp.util :as util]))


;;index page
(defn index-page
  []
  (html5
   [:head
    [:title "index"]
    (include-css "/css/markdown-alt.css")]
   [:body
    (util/md->html "/md/intro.md")]))
