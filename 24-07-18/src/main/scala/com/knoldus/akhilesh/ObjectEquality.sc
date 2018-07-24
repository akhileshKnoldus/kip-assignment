/*
class Point(var x: Int, var y: Int) {

  override def equals(other: Any) = other match {
    case that: Point => this.x == that.x && this.y == that.y
    case _ => false
  }

   def equalsComparison(other: Any) = other match {
    case that: Point => this.x == that.x && this.y == that.y
    case _ => false
  }
}

val p1 = new Point(1, 2)
val coll1 = collection.mutable.HashSet(p1)
coll1 contains p1
p1.x += 1
coll1 contains p1
coll1.iterator contains p1
*/




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

val person1 = new Person("AKHILESH", "GUPTA", age = 21)
val person2=new Person("AKHILESH", "GUPTA", age = 21)

person1==person2
person1 eq person2
person1 equals(person2)
val coll = collection.mutable.HashSet(person1)
person1.fName="AKHI"

coll contains person1