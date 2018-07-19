package com.knoldus.akhilesh

/*

case class Student(id :Int, name :String, division :String, section :String)

case class ScoreCard(id :Int, subject1 :Float, subject2 :Float, subject3 :Float, totalMarks :Float)

object ScoreCard{
  def apply(id :Int, subject1 :Float, subject2 :Float, subject3 :Float) :ScoreCard = {
    val totalMarks = subject1 + subject2 + subject3
    new ScoreCard(id, subject1, subject2, subject3, totalMarks)

  }

}
class ReportCard {


  def findFirstThreeToppers(listOfStudents: List[Student], listOfScoreCard: List[ScoreCard]): List[Any] = {

    if(listOfStudents.size >=3) {
      val topperList = listOfScoreCard.sortWith(_.totalMarks > _.totalMarks).take(3).map(_.id)
      val topperName = topperList.map {
        sid => listOfStudents.filter(_.id == sid).head
      }
      topperName.map { e =>
        (e.id, e.name)
      }
    }
    else
      throw new IllegalArgumentException
  }

  def findSubjectTopper(subject :String , listOfStudents: List[Student], listOfScoreCard: List[ScoreCard]): (Int, String, Float, Float, Float, Float) = {

    val subjectTopper = subject match {
      case "subject1" => listOfScoreCard.sortWith (_.subject1 > _.subject1).head
      case "subject2" => listOfScoreCard.sortWith (_.subject2 > _.subject2).head
      case "subject3" => listOfScoreCard.sortWith (_.subject3 > _.subject3).head
    }
    val topperDetails = listOfStudents.filter(_.id == subjectTopper.id).head
    (subjectTopper.id, topperDetails.name, subjectTopper.subject1, subjectTopper.subject2, subjectTopper.subject3, subjectTopper.totalMarks)
  }



  def displayMarksheet (sid :Int, listOfStudents :List[Student], listOfScoreCard :List[ScoreCard]) :String ={

    val scoreCard = listOfScoreCard.filter(_.id == sid).head
    val studentInfo = listOfStudents.filter(_.id == sid).head
    s"ID : $sid " +
      s" Name : ${studentInfo.name} " +
      s" MARKS : " +
      s" SUBJECTS : " +
      s" SUBJECT1 : ${scoreCard.subject1}" +
      s" SUBJECT2 : ${scoreCard.subject2}" +
      s" SUBJECT3 : ${scoreCard.subject3}" +
      s" TOTAL MARKS : ${scoreCard.totalMarks}"
  }


}*/


case class Student(id :Int, name :String, division :String, section :String)

case class ScoreCard(id :Int, subject1 :Float, subject2 :Float, subject3 :Float, totalMarks :Float)

object ScoreCard{
  def apply(id :Int, subject1 :Float, subject2 :Float, subject3 :Float) :ScoreCard = {
    val totalMarks = subject1 + subject2 + subject3
    new ScoreCard(id, subject1, subject2, subject3, totalMarks)

  }

}
class ReportCard {


  def findFirstThreeToppers(listOfStudents: List[Student], listOfScoreCard: List[ScoreCard]): List[Any] = {

    if(listOfStudents.size >=3) {
      val topperList = listOfScoreCard.sortWith(_.totalMarks > _.totalMarks).take(3).map(_.id)
      val topperName = topperList.map {
        sid => listOfStudents.filter(_.id == sid).head
      }
      topperName.map { e =>
        (e.id, e.name)
      }
    }
    else
      throw new IllegalArgumentException
  }

  def findSubjectTopper(subject :String , listOfStudents: List[Student], listOfScoreCard: List[ScoreCard]): (Int, String, Float, Float, Float, Float) = {

    val subjectTopper = subject match {
      case "subject1" => listOfScoreCard.sortWith (_.subject1 > _.subject1).head
      case "subject2" => listOfScoreCard.sortWith (_.subject2 > _.subject2).head
      case "subject3" => listOfScoreCard.sortWith (_.subject3 > _.subject3).head
    }
    val topperDetails = listOfStudents.filter(_.id == subjectTopper.id).head
    (subjectTopper.id, topperDetails.name, subjectTopper.subject1, subjectTopper.subject2, subjectTopper.subject3, subjectTopper.totalMarks)
  }



  def displayMarksheet (sid :Int, listOfStudents :List[Student], listOfScoreCard :List[ScoreCard]) :String ={

    val scoreCard = listOfScoreCard.filter(_.id == sid).head
    val studentInfo = listOfStudents.filter(_.id == sid).head
    s"ID : $sid " +
      s" Name : ${studentInfo.name} " +
      s" MARKS : " +
      s" SUBJECTS : " +
      s" SUBJECT1 : ${scoreCard.subject1}" +
      s" SUBJECT2 : ${scoreCard.subject2}" +
      s" SUBJECT3 : ${scoreCard.subject3}" +
      s" TOTAL MARKS : ${scoreCard.totalMarks}"
  }


}