(ns code-alignment)

(when something
  (something-else))

(with-out-str
  (println "Hello, ")
  (println "world!"))

(filter even?
        (range 1 10))

(filter
 even?
 (range 1 10))

(or
 ala
 bala
 portokala)

(let [thing1 "some stuff"
      thing2 "other stuff"]
  {:thing1 thing1
   :thing2 thing2})

(defn foo
  [x]
  (bar x))

(defn foo [x]
  (bar x))

(defmethod foo :bar [x] (baz x))

(defmethod foo :bar
  [x]
  (baz x))

(defn foo [x]
  (bar x))

(defn foo [x] (bar x))

(defn foo
  ([x] (bar x))
  ([x y]
   (if (predicate? x)
     (bar x)
     (baz x))))

(defn foo
  "I have two arities."
  ([x]
   (foo x 1))
  ([x y]
   (+ x y)))

(defn foo
  "I have two arities."
  ([x]
   (foo x 1))
  ([x y]
   (+ x y)))

(defn foo
  "I have two arities."
  ([x y]
   (+ x y))
  ([x]
   (foo x 1))
  ([x y z & more]
   (reduce foo (foo x (foo y z)) more)))

(foo (bar baz) quux)

[1 2 3]
(1 2 3)

{:name "Bruce Wayne" :alter-ego "Batman"}

;; good and arguably a bit more readable
{:name "Bruce Wayne"
 :alter-ego "Batman"}

;; good and arguably more compact
{:name "Bruce Wayne", :alter-ego "Batman"}

(when something
  (something-else))

(def min-rows 10)
(def max-rows 20)
(def min-cols 15)
(def max-cols 30)

(ns examples.ns
  (:refer-clojure :exclude [next replace remove])
  (:require [clojure.string :as s :refer [blank?]]
            [clojure.set :as set]
            [clojure.java.shell :as sh])
  (:import java.util.Date
           java.text.SimpleDateFormat
           [java.util.concurrent Executors
                                 LinkedBlockingQueue]))

(ns examples.ns
  (:require [clojure.zip :as zip]))

(ns examples.ns
  (:require [clojure.zip :refer [lefts rights]]))

(ns examples.ns
  (:require [clojure.zip :refer :all]))

(defn some-fun
  []
  ;; FIXME: This has crashed occasionally since v1.2.3. It may
  ;;        be related to the BarBazUtil upgrade. (xz 13-1-31)
  (baz))

(defn bar
  []
  (sleep 100)) ; OPTIMIZE

(defn foo
  "This function doesn't do much."
  []
  ...)

(ns foo.bar.core
  "That's an awesome library.")

(defn frobnitz
  "This function does a frobnitz.
  It will do gnorwatz to achieve this, but only under certain
  cricumstances."
  []
  ...)

(defn wombat
  "Acts much like `clojure.core/identity` except when it doesn't.
  Takes `x` as an argument and returns that. If it feels like it."
  [x]
  ...)

(def foo
  "All sentences should end with a period (or maybe an exclamation mark).
  And the period should be followed by a space, unless it's the last sentence.")

(ns my.ns
  "It is actually possible to document a ns.
  It's a nice place to describe the purpose of the namespace and maybe even
  the overall conventions used. Note how _not_ indenting the doc string makes
  it easier for tooling to display it correctly.")

(def foo
  "I'm so awesome."
  42)
