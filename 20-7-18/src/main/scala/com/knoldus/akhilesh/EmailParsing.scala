package com.knoldus.akhilesh

object EmailParsing {

  def apply(user: String, domain: String): String= {

    val email = user + "@" + domain
    val emailRegex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])".r
    
    if (emailRegex.findAllIn(email).isEmpty)
      "Not Valid Email"
    else
      email
  }

  def unapply(email: String): Option[(String,String)] = {
    /*//val email="akhilesh@knoldus.in"
    val user=email.split("@").take(1).mkString(" ")
    val domain=email.split("@").last
*/
    val user=email.split("@")
    //val domain=user(1)

    if(user.length==2)
        Some(user(0) , user(1))
    else
        None


  }
  
}


class Email {
  EmailParsing("knol", "knoldus.com")

  def extractor(email: String):String= email match {

    case EmailParsing(user, domain) =>"user=" + user + "\ndomain=" + domain
    case _ => "Not a valid Email"


  }
}

