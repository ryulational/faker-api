(ns faker-api.router
  (:require [muuntaja.core :as m]
            [reitit.ring :as ring]
            [reitit.ring.middleware.muuntaja :as muuntaja]
            [reitit.swagger :as swagger]
            [reitit.swagger-ui :as swagger-ui]
            [faker-api.faker.routes :as faker]))

(def swagger-docs
  ["/swagger.json"
   {:get {:no-doc true,
          :swagger {:basePath "/",
                    :info {:title "Faker Server API Reference",
                           :description "Faker Server API Reference",
                           :version "0.y.z"}},
          :handler (swagger/create-swagger-handler)}}])

(def router-config
  {:data {:muuntaja m/instance,
          :middleware [swagger/swagger-feature muuntaja/format-middleware]}})

(defn routes
  [env]
  (ring/ring-handler
    (ring/router [swagger-docs ["/v1" (faker/routes env)]] router-config)
    (ring/routes (swagger-ui/create-swagger-ui-handler {:path "/"}))))
