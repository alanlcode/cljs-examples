(ns user
  (:require cemerick.piggieback
            weasel.repl.websocket))

(defn start-weasel []
  (cemerick.piggieback/cljs-repl
    (weasel.repl.websocket/repl-env :port 9001)))
