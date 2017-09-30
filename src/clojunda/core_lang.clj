(ns clojunda.core-lang)

(defmacro lamun [test then else]
    (list 'if test
              then 
              else))

(defmacro ulangi [n action]
    (list 'loop '[i 0]
        (list 'if-not (list '= 'i n)
              (list 'do (list action 'i) 
                        (list 'recur (list '+ 'i 1))))))

(defmacro fungsi [name vect body]
          (list 'defn name vect body))

(defmacro eusian [name value]
    (list 'def name value))

(defmacro eusian-lokal [binds body]
    (list 'let binds body))

(defmacro jeung [x y]
          (list 'and x y))

(defmacro atawa [x y]
          (list 'or x y))