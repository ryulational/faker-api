(ns faker-api.faker.routes)

(defn routes
  [env]
  ["/faker" {:get {:handler (fn [req] {:status 200, :body "Hello World"})}}])
