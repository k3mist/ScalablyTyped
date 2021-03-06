package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsEnableXpnResourceRequest extends js.Object {
  /** Service resource (a.k.a service project) ID. */
  var xpnResource: js.UndefOr[XpnResourceId] = js.undefined
}

object ProjectsEnableXpnResourceRequest {
  @scala.inline
  def apply(xpnResource: XpnResourceId = null): ProjectsEnableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    if (xpnResource != null) __obj.updateDynamic("xpnResource")(xpnResource)
    __obj.asInstanceOf[ProjectsEnableXpnResourceRequest]
  }
}

