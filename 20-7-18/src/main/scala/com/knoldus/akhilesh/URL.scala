package com.knoldus.akhilesh


object URL {

  def apply(protocal:String,domain:String,path:String, params:Map[String,String]):String = {
    protocal + "://" + domain + "/" + path + "?" +params.map(element =>
      element._1 +"="+element._2+"&").mkString(" ")

  }

  def unapply(url:String):Option[(String , String, String,Map[String,String])] = {

    val protocal = url.split("://")
    val domain = protocal(1).split("/",2)
    val path   =domain(1).split("\\?")
    val params= path(1).split("&").map(

      value =>{
        val remaningValue = value.split("=")
        remaningValue(0) -> remaningValue(1)
      }).toMap
    Some(protocal(0),domain(0),path(0),params)

  }


}

class Test{
  def extractingDetails(url:String):String= {
    url match {
      case URL(protocol, domain, path, params) =>
        "protocol =" + protocol + "\n domain =" + domain + "\n path =" + path + "\n params =" + params
      //case URL(url) =>
      case _ => "Not a valid URL"
    }
  }
}

