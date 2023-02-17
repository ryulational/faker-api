(ns faker-api.faker.handlers
  (:require [ring.util.response :as rr]
            [faker-api.faker.data :as data]))

(defn address
  []
  (fn [request]
    (let [address (data/fake-address)] (rr/response {:address address}))))

(defn book [] (fn [request] (let [book (data/fake-book)] (rr/response book))))

(defn name
  []
  (fn [request] (let [name (data/fake-name)] (rr/response {:name name}))))

(defn phone-number
  []
  (fn [request]
    (let [phone-number (data/fake-phone-number)]
      (rr/response {:phone-number phone-number}))))
