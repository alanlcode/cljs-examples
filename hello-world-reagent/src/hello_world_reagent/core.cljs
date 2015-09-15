(ns hello-world-reagent.core
  (:require [clojure.browser.repl :as repl]
            [reagent.core :as r]))

(defonce app-state
  (r/atom
    {:value "Hello World!"}))

(defn output-text [state]
  [:span (:value state)])

(defn on-change [new-value]
  (swap! app-state #(assoc % :value new-value)))

(defn text-box []
  (fn [state]
    [:input {:type "text"
             :placeholder "Click here to change message"
             :value (:value state)
             :on-change #(on-change (-> % .-target .-value))}]))

(defn ui []
  [:div
   [:div
    [output-text @app-state]]
   [:div
    [text-box @app-state]]])

(defn mount []
  (r/render-component
    [ui]
    (.getElementById js/document "root")))

(defonce conn
  (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(mount)
