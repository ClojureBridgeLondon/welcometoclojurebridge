(ns clojurebridge-turtle.walk
  (:use clojure.repl)
  (:use clojurebridge-turtle.core))
(init)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; On NightCode, click Run with REPL followed by Reload File
;; for the first time. If REPL has already started, click
;; Reload File to run this code.
;;
;; Once a turtle (small triangle) appears in the center of window,
;; type code in REPL.
;;
;; Alternatively, you may type code in this editor. To evaluate:
;; - pieces of code: select code fragment and Reload Selection
;; - whole file: click Reload File
;;
;; [Exercise]
;; write some functions under these comment lines
;; and evalute those
;;
;; for example
;; (forward 30)
;; (right 90)
;; (forward 30)
;; (right 90)
;;
;; see how the turtle walks
;;

(right 90)
(forward 100)









;; ;; data structures

;; ;; vectors


;; maps
;; define a turtle that has a name, x & y cooridinates, direction, and colour
{:name "hugo"
 :coordinates {:x 1
               :y 2}
;; :direction :north-east
 :colour :red}

;; get values out of the map using `get` and `get-in`


;; define a vector of turtles

;; get some values out of the vector

;; add some new turtles to the vector


;; How do we move a turtle north

(defn move-north [turtle]
  (update-in turtle [:coordinates :x] inc))

(defn move-north [turtle amount]
  (update-in turtle [:coordinates :x] + amount))

(move-north {kljdsaf} 10)

(doc dosync)

(apply-to-turtle :trinity move-north)

;; How do we move a turtle east

(defn amounts-move [direction]
  (cond
    (= direction :north-east) {:x 1
                               :y 1}))

;; now give a turtle a direction using merge


;; Flow control

;; turn a turtle left/right

(defn turn-left [direction]
  (condp = direction
    :north :west
    (= direction :west)  :south))


;; ;; ---------------------------
;; ;; | | | | | | | | | | | | | |
;; ;; ---------------------------
;; ;; | | | | | | | | | | | | | |
;; ;; ---------------------------
;; ;; | | | | | | |>| | | | | | |
;; ;; ---------------------------
;; ;; | | | | | | | | | | | | | |
;; ;; ---------------------------
