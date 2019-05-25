(ns app.core
  (:require
   ["haul/hot" :refer (makeHot)]
   ["react-native" :refer (AppRegistry Text View)]
   ["react" :as react]
   [reagent.core :as r]))

(defn root []
  (r/create-class
   {:render (fn []
              [:> View {:style {:flex 1 :justify-content "center" :align-items "center"}}
               [:> Text "Hot reload me!"]])}))

(defn init []
  (.registerComponent AppRegistry "shadowhaul" (makeHot root)))
