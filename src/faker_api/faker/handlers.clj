(ns faker-api.faker.handlers
  (:require [ring.util.response :as rr]
            [faker-api.faker.data :as data]))

(defn address
  []
  (fn [request]
    (let [address (data/fake-address)] (rr/response {:address address}))))
