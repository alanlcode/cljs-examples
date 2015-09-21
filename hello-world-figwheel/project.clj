(defproject hello-world-figwheel "0.1.0-SNAPSHOT"
  :description "hello-world using figwheel"
  :url "http://github.com/alanlcode/cljs-examples"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.122" :classifier "aot"
                  :exclusion [org.clojure/data.json]]
                 [org.clojure/data.json "0.2.6" :classifier "aot"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :source-paths ["src" "target/classes"]
  :clean-targets ["js"]
  :target-path "target"
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {:main "hello-world-figwheel.core"
                                   :output-to "js/main.js"}}]}
  :profiles {:dev {:plugins [[lein-figwheel "0.4.0"]
                             [lein-cljsbuild "1.1.0"]]
                   :dependencies [[figwheel "0.4.0"]]}})
