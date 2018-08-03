package com.knoldus.actor

import akka.actor.Actor
import akka.event.{Logging, LoggingAdapter}
import com.knoldus.app.Tweet

class Worker  extends  Actor{

    var count =0
    val log:LoggingAdapter = Logging(context.system, this)

  override def receive: Receive ={
    case tweet:Tweet =>
      count +=1
      log.info(s"Friends tweet= ${tweet.friendsCount}"+count)
  }
}
