(ns myapp.views.myapp
  (:use hiccup.core)
  (:use hiccup.page)
  (:require [myapp.util :as util]))


;;index page
(defn index-page
  []
  (util/md->html "/md/intro.md"))
