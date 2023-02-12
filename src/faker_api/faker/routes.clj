(ns faker-api.faker.routes
  (:require [faker-api.faker.handlers :as faker]))

(defn routes
  [env]
  ["/address"
   {:get {:handler (faker/address),
          :responses {200 {:body {:address string?}}},
          :summary "Generate fake address"}}])
