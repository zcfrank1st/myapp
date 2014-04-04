(ns myapp.models.schema
  (:require [myapp.models.db :refer (wcar*)])
  (:require [taoensso.carmine :as car]))


(defn get
  [x]
  (wcar*
    (car/get x)))

(defn set
  [x y]
  (wcar*
    (car/set x y)))
