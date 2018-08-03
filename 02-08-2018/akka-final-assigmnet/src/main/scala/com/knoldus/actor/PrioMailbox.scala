package com.knoldus.actor
import akka.actor.{ActorSystem, PoisonPill}
import akka.dispatch.PriorityGenerator
import akka.dispatch.UnboundedStablePriorityMailbox
import com.knoldus.app.Tweet
import com.typesafe.config.Config


class PrioMailbox(settings: ActorSystem.Settings, config: Config)
  extends UnboundedStablePriorityMailbox(
    // Create a new PriorityGenerator, lower prio means more important
    PriorityGenerator {
      /*
         // 'highpriority messages should be treated first if possible
         case 'highpriority ⇒ 0

         // 'lowpriority messages should be treated last if possible
         case 'lowpriority  ⇒ 2

         // PoisonPill when no other left
         case PoisonPill    ⇒ 3

         // We default to 1, which is in between high and low
         case otherwise     ⇒ 1
      */

      case tweet: Tweet if tweet.friendsCount >500  => 0
      case tweet: Tweet if tweet.friendsCount >400 && tweet.friendsCount <500  => 1
      case tweet: Tweet if tweet.friendsCount >300 && tweet.friendsCount <400 => 2
      case otherwise => 3

})