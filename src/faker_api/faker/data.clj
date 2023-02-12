(ns faker-api.faker.data
  (:import [com.github.javafaker Faker]))

(defn fake-address
  []
  (-> (Faker.)
      (.address)
      (.streetAddress)))

