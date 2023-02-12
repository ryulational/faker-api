(ns faker-api.server
  (:require [integrant.core :as ig]
            [reitit.ring :as ring]
            [ring.adapter.jetty :as jetty]
            [faker-api.router :as router])
  (:gen-class))

(defn app [env] (router/routes env))

(defmethod ig/init-key :faker-api/app
  [_ config]
  (println "\nStarted app")
  (app config))

(defmethod ig/init-key :server/jetty
  [_ {:keys [handler port]}]
  (println "\nServer running on port " port)
  (jetty/run-jetty handler {:port port, :join? false}))

(defmethod ig/halt-key! :server/jetty [_ jetty] (.stop jetty))

(defn -main
  "I don't do a whole lot ... yet."
  [config-file]
  (let [config (-> config-file
                   slurp
                   ig/read-string)]
    (-> config
        ig/prep
        ig/init)))
