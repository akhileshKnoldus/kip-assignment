package com.knoldus.actor

import akka.actor.{Actor, Props, Terminated}
import akka.routing.{ActorRefRoutee, RoundRobinRoutingLogic, Router}
import com.knoldus.app.Tweet

class TestRouter extends  Actor{

  var router= {
    val routees = Vector.fill(7) {
      val r = context.actorOf(Props[Worker].withDispatcher("application"))
      context watch r
      //it is case class which internally call send()
      ActorRefRoutee(r)

    }

    Router(RoundRobinRoutingLogic(), routees)

  }
  override def receive: Receive = {

    case buffer:Tweet => router.route(buffer,sender())
    case Terminated(a) =>
      router= router.removeRoutee(a)
      val r = context.actorOf(Props[Worker])
      context watch r
      router = router.addRoutee(r)


  }


}
