package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupSubscriptionChannel extends SubscriptionChannelWithAddress

object GroupSubscriptionChannel {
  @scala.inline
  def apply(address: java.lang.String, `type`: java.lang.String, useCustomAddress: scala.Boolean): GroupSubscriptionChannel = {
    val __obj = js.Dynamic.literal(address = address, `type` = `type`, useCustomAddress = useCustomAddress)
  
    __obj.asInstanceOf[GroupSubscriptionChannel]
  }
}

