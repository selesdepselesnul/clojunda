(ns clojunda.core-test
  (:require [clojunda.core-lang :refer :all])
  (:use clojure.test))

(with-test
  (defn lamun-jeung [x]
    (lamun x "true" "false"))
(is (= "true" (lamun-jeung true)))
(is (= "false" (lamun-jeung false))))

(lamun (= 1 1) 
  (ulangi-sajumlah-n 20 #(println %))
  (println "salah"))

(run-tests 'clojunda.core-test)
