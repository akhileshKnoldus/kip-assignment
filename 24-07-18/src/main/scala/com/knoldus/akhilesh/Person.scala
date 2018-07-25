package com.knoldus.akhilesh


class Person(var fName:String, var lName:String, var age:Int){

  override  def equals(person:Any): Boolean = person match {
    case  that: Person => this.fName == that.fName &&
      this.lName == that.lName &&
      this.age == that.age
    case _ => false
  }

  def equalsComparision(person:Any): Boolean = person match {
    case  that: Person => this.fName == that.fName &&
      this.lName == that.lName &&
      this.age == that.age
    case _ => false
  }
}

class TestPerson{
  val person1 = new Person("AKHILESH", "GUPTA", age = 21)
  val coll = collection.mutable.HashSet(person1)
  println(coll contains person1)
  def modify(newName:String):Seq[Any]= {
    person1.age += 1
    person1.fName=newName
    //println(person)
    Seq((person1.fName,person1.lName,person1.age), coll contains person1, coll contains person1,coll.iterator contains person1
    )

  }

}