package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSubscriberUpdateParameters extends js.Object {
  /**
    * New delivery preference for the subscriber (indicates how the subscriber should be notified).
    */
  var deliveryPreference: NotificationSubscriberDeliveryPreference
  /**
    * New preferred email address for the subscriber. Specify an empty string to clear the current address.
    */
  var preferredEmailAddress: java.lang.String
}

object NotificationSubscriberUpdateParameters {
  @scala.inline
  def apply(
    deliveryPreference: NotificationSubscriberDeliveryPreference,
    preferredEmailAddress: java.lang.String
  ): NotificationSubscriberUpdateParameters = {
    val __obj = js.Dynamic.literal(deliveryPreference = deliveryPreference, preferredEmailAddress = preferredEmailAddress)
  
    __obj.asInstanceOf[NotificationSubscriberUpdateParameters]
  }
}

