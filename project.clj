(defproject test-graph "0.1.0-SNAPSHOT"
  :min-lein-version "2.0.0"
  :main nil ; Ensures that MANIFEST.MF *does not* declare Main-Class. This is important.
            ; See http://goo.gl/f0Edmr for details.
  :dependencies [[com.netflix.pigpen/pigpen  "0.2.13"]
                 [prismatic/plumbing "0.3.3"]]
  :profiles {:dev {:dependencies [[org.apache.pig/pig "0.11.1"]
                                  [junit/junit "4.11" :scope "test"]
                                  [log4j/log4j  "1.2.17"]
                                  [org.apache.hadoop/hadoop-core  "1.1.2"]
                                  [org.antlr/antlr  "3.5.2"]
                                  [org.clojure/test.check "0.5.7" :scope "test"] ]}})
