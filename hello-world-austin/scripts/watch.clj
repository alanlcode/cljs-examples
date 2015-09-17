(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'hello-world-austin.core
   :output-to "out/hello_world_austin.js"
   :output-dir "out"})
