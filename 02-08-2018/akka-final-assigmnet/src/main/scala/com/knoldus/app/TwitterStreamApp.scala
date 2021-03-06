package com.knoldus.app


import akka.actor.{ActorSystem, Props}
import com.knoldus.actor.TestRouter

import scala.collection.mutable.ListBuffer
import scala.concurrent.duration._


case class Tweet(tweetId: String, createdAt: Long, userId: Long, tweetUserName: String, countryName: String, friendsCount: Long)

object TwitterStreamApp extends App {

  val system = ActorSystem("tweetAppSystem")


  //dispatcher create

  val masterDispatcher=system.actorOf(Props[TestRouter].withDispatcher("application"))


  // excution context should be use for scheduler
  implicit val executionContext = system.dispatcher
  val buffer: ListBuffer[Tweet] = scala.collection.mutable.ListBuffer[Tweet]()

  system.scheduler.schedule(0 millis, 50 millis) {
    val rg = scala.util.Random
    buffer += Tweet(java.util.UUID.randomUUID().toString, rg.nextLong(), rg.nextLong(), rg.nextString(10), "India", rg.nextInt(2000))
  }


  system.scheduler.schedule(0 millis, 1000 millis) {
    for(i<- buffer.indices)
      masterDispatcher ! buffer(i)
  }

}


