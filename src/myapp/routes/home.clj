(ns myapp.routes.home
  (:use compojure.core)
  (:require [myapp.views.myapp :as myapp]
            [myapp.util :as util]
            [myapp.models.schema :as db]))


;可以做任何处理
(defroutes home-routes
  (GET "/" [] (myapp/index-page))
  (GET "/index" [] (myapp/index-page))

  (GET "/add/:params" [params] (db/set "foo" params)))
