package com.knoldus.akhilesh

class ListOperation {

  def max(xs: List[Int]): Int = xs match {
    case Nil => throw new NoSuchElementException("The list is empty")
    case x :: Nil => x
    case x :: tail => x.max(max(tail))
  }

  def length[A](list : List[A]) : Int = list match {
    case Nil => 0
    case _ :: tail => 1 + length(tail)

  }
  def reverse[A](l: List[A]): List[A] = l match {
    case h :: tail => reverse(tail) ::: List(h)
    case Nil => Nil
  }

  def min(xs: List[Int]): Int = xs match {
    case Nil => throw new NoSuchElementException("The list is empty")
    case x :: Nil => x
    case x :: tail => x.min(min(tail))
  }

}

object  ListOperationTest extends  App{

  val list= List(1,2,3,4,5,6,7,8,9,10)
  val listOperation=new ListOperation
     println(listOperation.max(list))
     println(listOperation.length(list))
     println(listOperation.reverse(list))
     println( listOperation.min(list))
}
