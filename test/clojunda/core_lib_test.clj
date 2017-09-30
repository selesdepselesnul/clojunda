(ns clojunda.core-lib-test
    (:require [clojunda.core-lib :refer :all])
    (:use clojure.test))

(testing "pormat"
    (is (= "ieu mantab" (pormat "ieu %s" "mantab"))))

(run-tests 'clojunda.core-lib-test)