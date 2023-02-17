(ns faker-api.faker.handlers
  (:require [ring.util.response :as rr]
            [faker-api.faker.data :as data]))

(defn address
  []
  (fn [request]
    (let [fake-address (data/fake-address)]
      (rr/response {:address fake-address}))))

(defn book
  []
  (fn [request] (let [fake-book (data/fake-book)] (rr/response fake-book))))

(defn name
  []
  (fn [request]
    (let [fake-name (data/fake-name)] (rr/response {:name fake-name}))))

(defn phone-number
  []
  (fn [request]
    (let [fake-phone-number (data/fake-phone-number)]
      (rr/response {:phone-number fake-phone-number}))))
