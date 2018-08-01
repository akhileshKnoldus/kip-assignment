package akkaDemo
import akka.actor.{Actor, ActorSystem, Props}

class EchoActor extends Actor {
  var counter=0;

  override def receive: Receive = {
    case msg:String=>counter+=1;
      println("hello fork i m receiving a msg"+"\n"+ msg+"\n"+counter+"")
     sender() ! "Hello"
    case _=> sender() ! new Exception

  }

}

object EchoActor extends App{
  val system=ActorSystem("EchoActor")
  val props= Props[EchoActor]
  val ref= system.actorOf(props)
  ref!"welcome......:D"
  ref!"welcome......:D"
  println(ref.path)

}