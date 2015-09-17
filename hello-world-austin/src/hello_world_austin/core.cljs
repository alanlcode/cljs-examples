(ns hello-world-austin.core
  (:require [clojure.browser.repl]))
;; Need this require. Otherwise Clojurescript doesn't add the dependency to
;; cljs_deps.js, and the code inserted by browser-connected-repl-js fails since
;; it relies on clojure.browser.repl

(enable-console-print!)

(println "Hello world!")
