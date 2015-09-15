(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:main 'hello-world-reagent.core
     :output-to "out/hello_world_reagent.js"
     :output-dir "out"
     :verbose true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))


