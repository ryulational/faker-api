(ns faker-api.router
  (:require [reitit.ring :as ring]
            [faker-api.faker.routes :as faker]))

(defn routes
  [env]
  (ring/ring-handler (ring/router [["/v1" (faker/routes env)]])))
