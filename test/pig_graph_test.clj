(ns pig-graph-test
  (:require [clojure.test :refer [is deftest]]
            [pigpen.core :as pig]
            [plumbing.graph :as graph]
            [plumbing.core :refer [fnk]]))

(def transformation (graph/compile { :x (fnk [y] (+ y 1))}))

(deftest test-graph
  (let [data (pig/return [{:y 1} {:y 2}])]
    (is (= [{:x 2} {:x 3}] (pig/dump (pig/map transformation data))))))

