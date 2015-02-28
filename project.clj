(defproject profile "0.1.0-SNAPSHOT"
  :description "Coilo central hub for open source"
  :url "https://github.com/coilo/profile"
  :min-lein-version "2.0.0"
  :license {:name "The MIT License (MIT)"
            :url "http://opensource.org/licenses/mit-license.php"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [enlive "1.1.5"]
                 [tentacles "0.3.0"]
                 [ring/ring-defaults "0.1.2"]]
  :plugins [[lein-ring "0.8.13"]
            [lein-cloverage "1.0.2"]]
  :ring {:handler profile.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
