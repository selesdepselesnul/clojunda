(ns clojunda.core-test
  (:require [clojunda.core-lang :refer :all])
  (:use clojure.test))

(with-test
  (defn lamun-jeung [x]
    (lamun x "true" "false"))
(is (= "true" (lamun-jeung true)))
(is (= "false" (lamun-jeung false))))

(with-test
  (fungsi nambahkeun [x y]
          (+ x y))
(is (= 3 (nambahkeun 1 2)))
(is (= 4 (nambahkeun 1 3))))

(run-tests 'clojunda.core-test)
