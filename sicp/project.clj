(defproject sicp "0.1.0-SNAPSHOT"
  :description "Exercises from Structure and Interpretation of Computer Programs"
  :url "https://github.com/crlane/sicp"
  :license {:name "WTFPL"
            :url "http://www.wtfpl.net/about/"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot sicp.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
