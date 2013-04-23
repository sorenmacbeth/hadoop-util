(defproject hadoop-util "0.3.0"
  :description "Hadoop utilities that we've found useful."
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev
             {:dependencies
              [[org.apache.hadoop/hadoop-core "0.20.2"]
               [midje "1.5.0"]]}})
