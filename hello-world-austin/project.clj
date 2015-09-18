(defproject hello-world-austin "0.1.0-SNAPSHOT"
  :description "hello-world with an Austin REPL"
  :url "http://github.com/alanlcode/clj-examples"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.122" :classifier "aot"
                  :exclusion [org.clojure/data.json]]
                 [org.clojure/data.json "0.2.6" :classifier "aot"]
                 [com.cemerick/piggieback "0.2.1"]
                 [ring "1.4.0"]
                 [compojure "1.4.0"]
                 [enlive "1.1.6"]]
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :plugins [[lein-npm "0.6.1"]]
  :npm {:dependencies [[source-map-support "0.3.2"]]}
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target"
  :profiles {:dev {:plugins [[com.cemerick/austin "0.1.7-SNAPSHOT"]]}})

; Notes:
; - Austin itself has a transitive dependency on an older version of
;   Clojurescript. This causes errors related to the fact that
;   in recent Clojurescript versions, cljs.repl/repl* automatically
;   refers cljs.pprint/pprint, which was only recently added.
