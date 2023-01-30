
(ns my-boat)


(defmacro let-def [bindings & body]
  (let [vars (mapv first (partition 2 bindings))
        defs (for [v vars] `(def ~v ~v))]
    `(let ~bindings ~@defs ~@body)))

(let-def [
          puma 77
          ]
  (println "Your puma is " puma)
  )

