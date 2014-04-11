(ns myapp.routes.home
  (:use compojure.core
        ring.util.response)
  (:require [myapp.views.myapp :as myapp]
            [myapp.views.ace :as ace]
            [myapp.util :as util]
            [myapp.models.schema :as db]
            [myapp.behaviors.datagen :as datagen]))


(defroutes home-routes
           (GET "/" [] (myapp/index-page))
           (GET "/demo" [] (ace/ace-page))
           (GET "/testing" [] (ace/ace-page))
           ;behaviors
           ;; 使用restful方式
           ;(GET "/add/:params" [params] (db/rdbset "foo" params))
           ;(GET "/gain/:params" [params] (db/rdbget "foo"))

           (GET "/jsondata" [] (response (datagen/get-data)))
           )
