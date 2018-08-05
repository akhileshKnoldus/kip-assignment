
package com.knoldus.singUp
import scala.io.StdIn.{readLine,readInt}
import org.slf4j.LoggerFactory
import com.knoldus.admin.Admin
import db.{InsertData,Database,Tables}
class  SignUp {

  val logger = LoggerFactory.getLogger(classOf[SignUp])

  def addDetails(admin: Admin,insert:InsertData): Unit = {
    logger.info("Enter the name")
    val name = readLine()
    logger.info("Enter EmployeeId")
    val employeeId = readInt()
    logger.info("Enter Employee MobileNumber")
    val phoneNumber=readLine()
    val check=admin.checkUserCredentials(employeeId,name,phoneNumber)
    if(check==1)
      insert.insertEmployeeDetails(employeeId,name,phoneNumber)
  }

}



object test extends App{
  val dataBase=new Database
  val admin=new Admin()
  //val tables=new Tables(dataBase)
  //tables.signUpTable()
  val insertData=new InsertData(dataBase)
  val signUp=new SignUp()
  signUp.addDetails(admin,insertData)
}
