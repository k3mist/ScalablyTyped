package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationQueryCondition extends js.Object {
  var eventInitiator: java.lang.String
  var eventType: java.lang.String
  var subscriber: java.lang.String
  var subscriptionId: java.lang.String
}

object NotificationQueryCondition {
  @scala.inline
  def apply(
    eventInitiator: java.lang.String,
    eventType: java.lang.String,
    subscriber: java.lang.String,
    subscriptionId: java.lang.String
  ): NotificationQueryCondition = {
    val __obj = js.Dynamic.literal(eventInitiator = eventInitiator, eventType = eventType, subscriber = subscriber, subscriptionId = subscriptionId)
  
    __obj.asInstanceOf[NotificationQueryCondition]
  }
}

