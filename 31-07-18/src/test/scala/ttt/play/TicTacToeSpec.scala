import akka.actor.{ActorSystem, Props}
import akka.testkit.{ImplicitSender, TestKit}
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}
import ttt.entites._

class TicTacToeSpec() extends TestKit(ActorSystem("MySpec")) with ImplicitSender
  with WordSpecLike with Matchers with BeforeAndAfterAll {

  override def afterAll {
    TestKit.shutdownActorSystem(system)
  }

  val playRef=  system.actorOf(Props[Player])
  val gameRef=  system.actorOf(Props[Game])


  "An Game actor" should {

    "be able to change and return the state of tic tac toe game" in {
      gameRef ! PlayStep(2,1)
      expectMsgAllClassOf(classOf[TicTacToeMap])

    }

    "be able to send Tic Tac Toe Map and a GameOver when a condition is met" in {

      gameRef  ! PlayStep(1, 1)
      gameRef  ! PlayStep(2, 2)
      gameRef  ! PlayStep(4, 1)
      gameRef  ! PlayStep(5, 2)
      gameRef  ! PlayStep(7, 1)

      expectMsgAllClassOf(classOf[TicTacToeMap],classOf[TicTacToeMap],classOf[TicTacToeMap],classOf[TicTacToeMap],classOf[TicTacToeMap])
      expectMsg(GameOver)
    }

    "be able to send PlaceAlreadyFilled Message when a PlayStep is sent on a non empty step" in {

      gameRef  ! PlayStep(1, 1)
      gameRef  ! PlayStep(2, 2)
      gameRef  ! PlayStep(1, 1)
      expectMsgAllClassOf(classOf[TicTacToeMap])


    }


  }
}