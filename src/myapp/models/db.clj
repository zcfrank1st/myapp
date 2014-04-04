(ns myapp.models.db
  (:require [taoensso.carmine :as car :refer (wcar)]))


(def server-conn
  {:pool {}
   :spec {}})

(defmacro wcar*
  [& body]
  `(car/wcar server-conn ~@body))
