(require
  '[cemerick.austin.repls :as repls]
  '[cemerick.austin :as austin])

(repls/cljs-repl (austin/exec-env))
