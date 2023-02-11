(ns faker-api.server
  (:require [reitit.ring :as ring]
            [ring.adapter.jetty :as jetty])
  (:gen-class))

(def app
  (ring/ring-handler
    (ring/router
      [["/" {:get {:handler (fn [req] {:status 200, :body "Hello World"})}}]])))

(defn start
  []
  (jetty/run-jetty app {:port 3000, :join? false})
  (println "\nServer running on port 3000"))

(defn -main "I don't do a whole lot ... yet." [& args] (println "main"))
