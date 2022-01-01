package com.example.sequence

/** Project Euler 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * naturals lt 10 -> 25
 * naturals lt 1000 -> 233168
 * */

object Multiples extends App {
  val nums: Seq[Int] = Seq.range(1, 1000).filter((x:Int) => List(0, 3, 5, 6, 9, 10, 12).contains(x % 15))
  // println(nums.fold(0)(_ + _))
  println(nums.sum)
}
