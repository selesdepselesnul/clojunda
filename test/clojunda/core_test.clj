(ns clojunda.core-test
  (:require [clojunda.core-lang :refer :all]))

(with-test
  (defn lamun-jeung [x]
    (lamun x "true" "false"))
(is (= "true" (lamun-jeung true)))
(is (= "false" (lamun-jeung false))))

(run-tests 'clojunda.core-test)
