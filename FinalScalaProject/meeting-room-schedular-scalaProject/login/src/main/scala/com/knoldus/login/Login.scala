
package com.knoldus.login
import org.slf4j.LoggerFactory
import scala.io.StdIn.{readLine,readInt}
import db.{Database,InsertData}
import com.knoldus.{RoomDetails,RequestForRomm,RoomAllocation}
class Login(val db:Database,val room:RoomDetails) {
  val logger = LoggerFactory.getLogger(classOf[Login])

  def login()={
    val connection = db.createConnection()
    val statement = connection.createStatement
    logger.info("Enter the name of the user")
    val name = readLine()
    logger.info("Enter Employee Id")
    val employeeId = readInt()
    logger.info("Enter Employee number")
    val number = readLine()
   val result=statement.executeQuery(s"select * from EMPLOYEEDETAILS where empId ='$employeeId' and empName ='$name' and phoneNumber='$number'")
    //println("result.next="+result.next==true)
    if (result.next==true) room.showRoomDetails()
    else
      logger.info("Invalid Details")
  }

}

object t extends App{
  val database=new Database
  val i= new InsertData(database)
 // println("roomAlllction")
  val roomAllocation=new RoomAllocation(database,i)
 // println("request")
  val requestRoom=new RequestForRomm(roomAllocation)
 // println("details")
  val roomDetails=new RoomDetails(database,requestRoom)
  //println("login")
  val l=new Login(database,roomDetails)
  l.login()
}
