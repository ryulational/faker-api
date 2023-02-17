(ns faker-api.faker.routes
  (:require [faker-api.faker.handlers :as faker]))

(defn routes
  [env]
  [""
   ["/address"
    {:get {:handler (faker/address),
           :responses {200 {:body {:address string?}}},
           :summary "Generate fake address"}}]
   ["/book"
    {:get {:handler (faker/book),
           :responses {200 {:body {:author string?,
                                   :genre string?,
                                   :publisher string?,
                                   :title string?}}},
           :summary "Generate fake book"}}]
   ["/name"
    {:get {:handler (faker/name),
           :responses {200 {:body {:name string?}}},
           :summary "Generate fake name"}}]
   ["/phone"
    {:get {:handler (faker/phone-number),
           :responses {200 {:body {:phone-number string?}}},
           :summary "Generate fake phone number"}}]])
