package akkaDemo

import akka.actor.{ActorSystem, Props}
import akka.testkit.{ImplicitSender, TestKit}
import org.scalatest.matchers.Matcher
import org.scalatest.{Matchers, WordSpec, WordSpecLike}

class EchoActorSpec extends  TestKit( ActorSystem("EchoAcror")) with WordSpecLike with ImplicitSender
with Matchers{

  val testEchoActor=system.actorOf(Props[EchoActor])

  " An EchoActor" should{
    "respond with the msg it receives" in{
      testEchoActor ! "welcome......:D"
      expectMsg("Hello")


    }
  }

}
