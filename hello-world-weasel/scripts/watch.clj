(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'hello-world-weasel.core
   :output-to "out/hello_world_weasel.js"
   :output-dir "out"})
