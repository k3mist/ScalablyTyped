package typings
package cordovaDashPluginDashBackgroundDashModeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPluginBackgroundMode extends js.Object {
  /**
    * Configure the default background notification
    */
  def configure(item: ICordovaPluginBackgroundModeNotificationItem): scala.Unit
  /**
    * The background mode can be disabled
    */
  def disable(): scala.Unit
  /**
    * The background mode can be enabled
    */
  def enable(): scala.Unit
  /**
    * Checks if the background mode is activated or not
    */
  def isActivated(): scala.Boolean
  /**
    * Checks if the background mode is enabled or not
    */
  def isEnabled(): scala.Boolean
  /**
    * Function to get notified when the background mode has been activated
    */
  def onactivate(): scala.Unit
  /**
    * Function to get notified when the background mode has been deactivated
    */
  def ondeactivate(): scala.Unit
  /**
    * Function to get notified when the background could not benn activated
    */
  def onfailure(callback: js.Function1[/* errorCode */ scala.Double, scala.Unit]): scala.Unit
  /**
    * Customize default title, ticker and text for the notification
    */
  def setDefaults(item: ICordovaPluginBackgroundModeNotificationItem): scala.Unit
}

object CordovaPluginBackgroundMode {
  @scala.inline
  def apply(
    configure: ICordovaPluginBackgroundModeNotificationItem => scala.Unit,
    disable: () => scala.Unit,
    enable: () => scala.Unit,
    isActivated: () => scala.Boolean,
    isEnabled: () => scala.Boolean,
    onactivate: () => scala.Unit,
    ondeactivate: () => scala.Unit,
    onfailure: js.Function1[/* errorCode */ scala.Double, scala.Unit] => scala.Unit,
    setDefaults: ICordovaPluginBackgroundModeNotificationItem => scala.Unit
  ): CordovaPluginBackgroundMode = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isActivated = js.Any.fromFunction0(isActivated), isEnabled = js.Any.fromFunction0(isEnabled), onactivate = js.Any.fromFunction0(onactivate), ondeactivate = js.Any.fromFunction0(ondeactivate), onfailure = js.Any.fromFunction1(onfailure), setDefaults = js.Any.fromFunction1(setDefaults))
  
    __obj.asInstanceOf[CordovaPluginBackgroundMode]
  }
}

