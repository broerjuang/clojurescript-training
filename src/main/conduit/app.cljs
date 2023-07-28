(ns conduit.app
  (:require [reagent.dom :as d]))


(defn ^:dev/after-load start []
  (d/render [:div "hello worlds"] (js/document.getElementById "app")))


(defn init []
  (js/console.log "init")
  (start))


(defn ^:dev/before-load stop [] (js/console.log "stop"))