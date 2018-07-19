package com.knoldus.akhilesh

class PatternMatching {

def returnWhatYouGet(valType: Any)={

valType match{

case s: String=> s"you have me this string: $s"
case i: Int=> s"thanks for the int: $i"
case f:Float=> s"thanks for the float: $f"
case arr1: Array[Int]=> s"an array of int: ${arr1.mkString(",")}"
case arr2: Array[String]=> s"an array of string: ${arr2.mkString(",")}"
case p: Pet=> s"${p.name} is a good dog "
case list: List[Any]=> s" thanks for the list: ${list.toString()}"
case m: Map[_,_]=> m.toString
case _=> "other input"
}
}

}
/*
object PatternMatching extends App {

  val patternMatching = new PatternMatching
  patternMatching.returnWhatYouGet("hi")
  patternMatching.returnWhatYouGet(27)
  patternMatching.returnWhatYouGet(27.3)
  patternMatching.returnWhatYouGet(Array(1, 3, 5))
  patternMatching.returnWhatYouGet(Array("a", "b"))
  patternMatching.returnWhatYouGet(List(5, 3.0, "d"))
  patternMatching.returnWhatYouGet(Pet("tommy"))
  patternMatching.returnWhatYouGet(Map(1 -> 'a', 2 -> 'b'))

}*/
