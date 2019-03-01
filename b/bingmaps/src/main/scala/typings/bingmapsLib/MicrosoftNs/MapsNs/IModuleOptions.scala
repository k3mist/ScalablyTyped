package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModuleOptions extends js.Object {
  /** 
    * @deprecated
    * A callback function that is fired after the module has loaded.
    * It is recommended that the Bing Maps key be set as a URL parameter of the Bing Maps script reference.
    */
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** A Bing Maps key that is used with the module when the module is loaded without a map. */
  var credentials: js.UndefOr[java.lang.String] = js.undefined
  /** A function that is called if there is an error loading the module. */
  var errorCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IModuleOptions {
  @scala.inline
  def apply(
    callback: js.Function0[scala.Unit] = null,
    credentials: java.lang.String = null,
    errorCallback: js.Function0[scala.Unit] = null
  ): IModuleOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (errorCallback != null) __obj.updateDynamic("errorCallback")(errorCallback)
    __obj.asInstanceOf[IModuleOptions]
  }
}

