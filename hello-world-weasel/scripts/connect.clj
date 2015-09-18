(require 'weasel.repl.websocket
         'cljs.repl)

(cljs.repl/repl (weasel.repl.websocket/repl-env :port 9001))
