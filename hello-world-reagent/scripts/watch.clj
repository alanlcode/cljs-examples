(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'hello-world-reagent.core
   :output-to "out/hello_world_reagent.js"
   :output-dir "out"})
