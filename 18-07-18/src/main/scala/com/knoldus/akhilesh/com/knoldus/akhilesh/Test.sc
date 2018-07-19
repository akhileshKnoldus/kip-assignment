package com.knoldus.akhilesh

case class Student(id:Int , name:String , division:Int , section:Char)

case class ScoreCard(studentId:Int, totalMarks:Double ,subject1:Int ,subject2:Int ,subject3:Int)


object ScoreCard {
  def apply(studentId: Int, subject1: Int, subject2: Int, subject3: Int): ScoreCard = {
    val totalMarks: Double = subject1 + subject2 + subject3
    new ScoreCard(studentId: Int, totalMarks: Double, subject1: Int, subject2: Int, subject3: Int)
  }
}
class Test {
  // def main(args: Array[String]): Unit = {

  //def marksheet(id:Int,list1: List[Student], list2: List[ScoreCard])   ="Id: "+id+" \n"+"Name: "+name+"\n"+"Divison-"+division+"Section: "+section


  def topThreeStudent(studentId: Int, list1: List[Student], list2: List[ScoreCard]) = {

    val list = (list2.sortWith(_.totalMarks < _.totalMarks).takeRight(3)).mkString(" , ")
    println("Top Three Student")
    println(list)
  }

  def topperStudentWithMarks(list1: List[Student], list2: List[ScoreCard]) = {

    println("Toper Student With Their Marks")
    println("*****************************")
    println((list2.sortWith(_.subject1 < _.subject1).takeRight(1)).mkString(" , "))
    println((list2.sortWith(_.subject2 < _.subject2).takeRight(1)).mkString(" , "))
    println((list2.sortWith(_.subject3 < _.subject3).takeRight(1)).mkString(" , "))
    println("*****************************")
  }


  def marksheet(sId: Int, list1: List[Student], list2: List[ScoreCard]) = {
    val scoreCard = list2.filter(_.studentId == sId).head
    val studentInfo = list1.filter(_.id == sId).head
    s"ID : $sId " +
      s" Name : ${studentInfo.name} " +
      s" MARKS : " +
      s" SUBJECTS : " +
      s" SUBJECT1 : ${scoreCard.subject1}" +
      s" SUBJECT2 : ${scoreCard.subject2}" +
      s" SUBJECT3 : ${scoreCard.subject3}" +
      s" TOTAL MARKS : ${scoreCard.totalMarks}"

  }

  object TestDemo extends App {

    val student: List[Student] = List(Student(1, "Bob", 11, 'A'), Student(2, "AKHILESH", 10, 'C'), Student(3, "ami", 10, 'C'), Student(4, "amit", 1, 'A'))

    val scoreCard: List[ScoreCard] = List(ScoreCard(1, 88, 45, 79), ScoreCard(2, 67, 80, 45), ScoreCard(3, 99, 87, 85), ScoreCard(4, 60, 40, 50))

    val test = new Test
    test.topThreeStudent(1, student, scoreCard)
    test.topperStudentWithMarks(student, scoreCard)
    test.topThreeStudent(1, student, scoreCard)
    test.marksheet(1, student, scoreCard)
  }

}
