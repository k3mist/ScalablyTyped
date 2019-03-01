package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBadgeNotificationFactory extends js.Object {
  def createBadgeNotification(content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument): BadgeNotification
}

object IBadgeNotificationFactory {
  @scala.inline
  def apply(
    createBadgeNotification: js.Function1[winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument, BadgeNotification]
  ): IBadgeNotificationFactory = {
    val __obj = js.Dynamic.literal(createBadgeNotification = createBadgeNotification)
  
    __obj.asInstanceOf[IBadgeNotificationFactory]
  }
}

