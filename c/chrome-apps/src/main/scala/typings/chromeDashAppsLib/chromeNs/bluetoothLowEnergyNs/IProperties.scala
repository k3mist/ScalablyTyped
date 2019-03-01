package typings
package chromeDashAppsLib.chromeNs.bluetoothLowEnergyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProperties extends js.Object {
  /**
    * Flag indicating whether a connection to the device is left open when the event page of the application is unloaded. The default value is false.
    * @see [HowToManageAppLifecycle]{@link https://developer.chrome.com/apps/app_lifecycle}
    * @default false
    */
  var persistent: scala.Boolean
}

object IProperties {
  @scala.inline
  def apply(persistent: scala.Boolean): IProperties = {
    val __obj = js.Dynamic.literal(persistent = persistent)
  
    __obj.asInstanceOf[IProperties]
  }
}

