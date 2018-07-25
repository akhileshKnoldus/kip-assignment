package com.knoldus.akhilesh
import org.scalatest.FunSuite

class PersonSpec extends FunSuite {

  val person1 = new Person("AKHILESH", "GUPTA", age = 21)
  val person2=new Person("AKHILESH", "GUPTA", age = 21)

  val updatePerson= new TestPerson

  test("valid input case"){
  assert(person1 === person2)
}

  test("after modifying the inputs"){
  val actualResult=updatePerson.modify("Anisha")
  val expectedResult=Seq(("Anisha","GUPTA",22),true,true,true)
  assert(actualResult===expectedResult)
}



}


