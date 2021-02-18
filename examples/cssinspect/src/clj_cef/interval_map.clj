(ns clj-cef.interval-map)

;; from http://clj-me.cgrand.net/2012/03/16/a-poor-mans-interval-tree/

(defn interval-lt
  [[a b] [c d]]
  (boolean (and b c 
                (if (= a b)
                  (neg? (compare b c))
                  (<= (compare b c) 0)))))

(def empty-interval-map 
  (sorted-map-by interval-lt [nil nil] #{}))

(defn- isplit-at [interval-map x]
  (if x
    (let [[[a b :as k] vs] (find interval-map [x x])]
      (if (or (= a x) (= b x))
        interval-map
        (-> interval-map (dissoc k) (assoc [a x] vs [x b] vs))))
    interval-map))

(defn- ialter [interval-map from to f & args]
  (let [interval-map (-> interval-map (isplit-at from) (isplit-at to))
        kvs (for [[r vs] 
                  (cond 
                    (and from to)
                    (subseq interval-map >= [from from] < [to to])
                    from
                    (subseq interval-map >= [from from])
                    to
                    (subseq interval-map < [to to])
                    :else
                    interval-map)]
              [r (apply f vs args)])]
    (into interval-map kvs)))

(defn iassoc [interval-map from to v]
  (ialter interval-map from to conj v))

(defn idissoc [interval-map from to v]
  (ialter interval-map from to disj v))

(defn iget [interval-map x]
  (get interval-map [x x]))
