(ns faker-api.faker.data
  (:import [com.github.javafaker Faker]))

(defn fake-address
  []
  (-> (Faker.)
      (.address)
      (.streetAddress)))

(defn fake-name
  []
  (-> (Faker.)
      (.name)
      (.fullName)))

(defn fake-phone-number
  []
  (-> (Faker.)
      (.phoneNumber)
      (.cellPhone)))
