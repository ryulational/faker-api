# faker-api

## Usage

Run the project's tests (they'll fail until you edit them):

    $ clojure -T:build test

Run the project's CI pipeline and build an uberjar (this will fail until you edit the tests to pass):

    $ clojure -T:build ci

Run that uberjar:

    $ java -jar target/net.clojars.faker-api/server-0.1.0-SNAPSHOT.jar resources/config.edn

