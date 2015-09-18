(ns user
  (:require [cemerick.austin.repls :as repls]
            [cemerick.austin :as austin]
            [cemerick.piggieback :as piggieback]
            [net.cgrand.enlive-html :as enlive]
            [compojure.route :refer (files)]
            [compojure.core :refer (GET defroutes)]
            ring.adapter.jetty
            [clojure.java.io :as io]))

(println "Starting Austin server...")
(def browser-repl-env
  (reset! cemerick.austin.repls/browser-repl-env (austin/repl-env)))
;; must reset this atom, otherwise browser-connected-repl-js produces nil,
;; and browser never connects to the Austin server

(enlive/deftemplate page
  (io/resource "index.html")
  []
  [:body] (enlive/append
           (enlive/html [:script (repls/browser-connected-repl-js)])))

(defroutes site
  (files "/out" {:root "out"})
  (GET "/*" req (page)))

(defn start-austin-repl []
  (ring.adapter.jetty/run-jetty #'site {:port 8080 :join? false})
  (println "Open http://localhost:8080 in the browser to connect to REPL")
  (piggieback/cljs-repl browser-repl-env))
;; bug in austin.repls/cljs-repl calls (pb/cljs-repl :repl-env ...)
;; instead of (pb/cljs-repl ...)



