package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAuthRequirements extends js.Object {
  /**
    * A configuration string containing connection information for the
    * authentication provider, typically formatted as a SmartService string
    * (go/smartservice).
    */
  var provider: js.UndefOr[java.lang.String] = js.undefined
}

object CustomAuthRequirements {
  @scala.inline
  def apply(provider: java.lang.String = null): CustomAuthRequirements = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[CustomAuthRequirements]
  }
}

