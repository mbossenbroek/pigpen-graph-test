(ns nippy-aot-record-test
  (:require [clojure.test :refer [is deftest]]
            [taoensso.nippy :as nippy]))

(defrecord foo [stuff])

(deftest test-roundtrip
  (nippy/thaw (nippy/freeze (foo. 42))))
