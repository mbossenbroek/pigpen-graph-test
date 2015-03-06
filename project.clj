(defproject test-graph "0.1.0-SNAPSHOT"
  :min-lein-version "2.0.0"
  :main nil ; Ensures that MANIFEST.MF *does not* declare Main-Class. This is important.
            ; See http://goo.gl/f0Edmr for details.
  :dependencies [[prismatic/plumbing "0.3.3"]

                 ;; Doesn't work
                 [com.netflix.pigpen/pigpen "0.2.13"]

                 ;; Works
                 [org.clojure/clojure "1.6.0"]
                 [com.taoensso/nippy "2.6.3"]
                 ])
