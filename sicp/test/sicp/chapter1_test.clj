(ns sicp.chapter1-test
  (:require [clojure.test :refer :all]
            [sicp.chapter1 :refer :all]))

(deftest square-test
  (testing "square."
    (is (square 4) 16)))
