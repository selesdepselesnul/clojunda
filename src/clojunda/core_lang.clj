(ns clojunda.core-lang)

(defmacro lamun [test then else]
    (list 'if test
     then else))
