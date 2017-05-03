(ns bowlingscore.core
  (:gen-class))

(defn scoreRound
  [x]
  (if (or (= x "X") (= x "/")) 10 (Integer/parseInt x)))

(defn adjScore
  [r s]
  (def ascore [])
  (doseq [i (range(count r))]
    (println i ": " (nth r i) (nth s i))
    (if (= "X" (nth r i) (concat ascore (nth s (+ i 1)))) 0 ))
  ascore)

(defn -main
  "treats arguments as a bowling score for rounds"
  [& args]
  (def score (map scoreRound args))
  (doseq [x score]
    (println x))
  (doseq (adjScore args score))
  ;(doseq [x ascore]
    (println x)
  (println (apply + score)))


  ;(println (.indexOf args "X"))
  ;(println (nth score (+ 1 (.indexOf args "X"))))
  ;(def score [])
  ;(println (apply + (map scoreRound args))))
  ;(doseq [x args]
    ;(println (scoreRound x)))
  ;(doseq [x score]
    ;(println x))
  ;(println (reduce + score)))
