(ns sicp.chapter1
  (:gen-class))

(defn square
  [x]
  (* x x))

(defn spread
  [& nums]
  (- (apply max nums) (apply min nums)))

(defn sum-of-squares
  [x y]
  (+ (square x) (square y)))

(defn f
  [a]
  (sum-of-squares (+ a 1) (* a 2)))

(defn ex1-2
  "Translate the following expression into prefix form"
  []
  (/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5))))) (* 3 (- 6 2) (- 2 7))))

(defn ex1-3
  "Define a function that takes three numbers as arguments and returns the sum of the squares of the two larger numbers."
  [x y z]
  (apply sum-of-squares (filter (partial not= (min x y z)) [x y z])))

(defn ex1-5
  ""
  []
  )

(defn first-denomination
  [kinds-of-coins]
  (cond
        (= kinds-of-coins 1) 1
        (= kinds-of-coins 2) 5
        (= kinds-of-coins 3) 10
        (= kinds-of-coins 4) 25
        (= kinds-of-coins 5) 50))
