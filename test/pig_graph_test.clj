(ns pig-graph-test
  (:require [clojure.test :refer [is deftest]]
            [taoensso.nippy :as nippy]
            [plumbing.graph :as graph]
            [plumbing.core :refer [fnk]]))

(def transformation (graph/compile {:x (fnk [y] (+ y 1))}))

(deftest test-roundtrip
  (nippy/thaw (nippy/freeze (transformation {:y 1}))))
