(ns myapp.models.schema
  (:require [myapp.models.db :refer (wcar*)])
  (:require [taoensso.carmine :as car]))


(defn rdbget
  [x]
  (wcar*
    (car/get x)))

(defn rdbset
  [x y]
  (wcar*
    (car/set x y)))

;;采用什么数据格式进行存储，待定
