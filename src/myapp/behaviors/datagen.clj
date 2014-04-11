(ns myapp.behaviors.datagen
  (require [clojure.data.json :as json]))

(defn get-data
  []
  ;生成json串,数值随机
  ;;可以接入业务进行展示
  (json/write-str [
                    {:place "aomen", :total (rand-int 2000)},
                    {:place "hk", :total (rand-int 2000)},
                    {:place "taiwan", :total (rand-int 2000)},
                    {:place "guangdong", :total (rand-int 2000)},
                    {:place "gx", :total (rand-int 2000)},
                    {:place "hainan", :total (rand-int 2000)},
                    {:place "yunnan", :total (rand-int 2000)},
                    {:place "fujian", :total (rand-int 2000)},
                    {:place "jiangxi", :total (rand-int 2000)},
                    {:place "hunan", :total (rand-int 2000)},
                    {:place "guizhou", :total (rand-int 2000)},
                    {:place "zhejiang", :total (rand-int 2000)},
                    {:place "anhui", :total (rand-int 2000)},
                    {:place "shanghai", :total (rand-int 2000)},
                    {:place "jiangsu", :total (rand-int 2000)},
                    {:place "hubei", :total (rand-int 2000)},
                    {:place "xizang", :total (rand-int 2000)},
                    {:place "qinghai", :total (rand-int 2000)},
                    {:place "gansu", :total (rand-int 2000)},
                    {:place "xinjiang", :total (rand-int 2000)},
                    {:place "shanxi", :total (rand-int 2000)},
                    {:place "henan", :total (rand-int 2000)},
                    {:place "shanxis", :total (rand-int 2000)},
                    {:place "shandong", :total (rand-int 2000)},
                    {:place "hebei", :total (rand-int 2000)},
                    {:place "tianjin", :total (rand-int 2000)},
                    {:place "beijing", :total (rand-int 2000)},
                    {:place "ningxia", :total (rand-int 2000)},
                    {:place "neimeng", :total (rand-int 2000)},
                    {:place "liaoning", :total (rand-int 2000)},
                    {:place "jilin", :total (rand-int 2000)},
                    {:place "heilongjiang", :total (rand-int 2000)},
                    {:place "chongqing", :total (rand-int 2000)},
                    {:place "sichuan", :total (rand-int 2000)}
                    ])
  )