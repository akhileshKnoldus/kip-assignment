package com.knoldus.akhilesh.com.knoldus.akhilesh

import com.knoldus.akhilesh.{ScoreCard, Student, Test}

object TestStudent extends App {

  val student: List[Student] = List(Student(1, "Bob", 11, 'A'), Student(2, "AKHILESH", 10, 'C'), Student(3, "ami", 10, 'C'), Student(4, "amit", 1, 'A'))

  val scoreCard: List[ScoreCard] = List(ScoreCard(1, 88, 45, 79), ScoreCard(2, 67, 80, 45), ScoreCard(3, 99, 87, 85), ScoreCard(4, 60, 40, 50))

  val test = new Test
  test.topThreeStudent(student, scoreCard)

  /*test.topperStudentWithMarks(student, scoreCard)
  test.topThreeStudent(1, student, scoreCard)
  test.marksheet(1, student, scoreCard)
*/

}
