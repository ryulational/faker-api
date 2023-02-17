(ns faker-api.faker.data
  (:import [com.github.javafaker Faker]))

(defn fake-address
  []
  (-> (Faker.)
      (.address)
      (.streetAddress)))

(defn fake-book
  []
  (let [book (-> (Faker.)
                 (.book))]
    {:author (.author book),
     :genre (.genre book),
     :publisher (.publisher book),
     :title (.title book)}))

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
