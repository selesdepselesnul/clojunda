(ns clojunda.core-lib)

(defn cetak-ka-konsol [value]
    (println value))

(defn pormat [& values]
    (apply format values))