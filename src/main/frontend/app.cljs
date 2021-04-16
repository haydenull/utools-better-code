(ns frontend.app
  (:require [rum.core :as rum]))

(rum/defc app []
  (let [[x set-x] (rum/use-state 0)
        [y set-y] (rum/use-state 1)]
    [:div
     [:h1 x]
     [:h2 y]]))


(defn ^:export init []
  (println "Hellow World")
  (when-let [node (.getElementById js/document "root")]
    (rum/mount (app) node)))