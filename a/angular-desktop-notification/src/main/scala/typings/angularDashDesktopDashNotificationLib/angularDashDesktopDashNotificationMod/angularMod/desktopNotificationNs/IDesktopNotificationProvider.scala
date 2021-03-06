package typings
package angularDashDesktopDashNotificationLib.angularDashDesktopDashNotificationMod.angularMod.desktopNotificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IDesktopNotificationProvider extends js.Object {
  /**
    * Set the default app-wide configuration for desktopNotification
    */
  def config(options: IDesktopNotificationOptions): scala.Unit
}

object IDesktopNotificationProvider {
  @scala.inline
  def apply(config: IDesktopNotificationOptions => scala.Unit): IDesktopNotificationProvider = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config))
  
    __obj.asInstanceOf[IDesktopNotificationProvider]
  }
}

