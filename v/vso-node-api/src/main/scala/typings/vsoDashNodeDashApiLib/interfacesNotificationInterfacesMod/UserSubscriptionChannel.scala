package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSubscriptionChannel extends SubscriptionChannelWithAddress

object UserSubscriptionChannel {
  @scala.inline
  def apply(address: java.lang.String, `type`: java.lang.String, useCustomAddress: scala.Boolean): UserSubscriptionChannel = {
    val __obj = js.Dynamic.literal(address = address, `type` = `type`, useCustomAddress = useCustomAddress)
  
    __obj.asInstanceOf[UserSubscriptionChannel]
  }
}

