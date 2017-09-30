(ns clojunda.core-test
  (:require [clojunda.core-lang :refer :all])
  (:use clojure.test))

(with-test
  (defn lamun-jeung [x]
    (lamun x "true" "false"))
(is (= "true" (lamun-jeung true)))
(is (= "false" (lamun-jeung false))))

(with-test
  (eusian y 20)
(is (= 20 y)))

(testing "jeung"
  (is (= true (jeung true true)))
  (is (= false (jeung true false)))
  (is (= false (jeung false false))))

(run-tests 'clojunda.core-test)
