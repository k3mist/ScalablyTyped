package typings
package firefoxDashWebextDashBrowserLib.browserNs.permissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyPermissions extends js.Object {
  var origins: js.UndefOr[
    js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.MatchPattern]
  ] = js.undefined
  var permissions: js.UndefOr[
    js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.Permission]
  ] = js.undefined
}

object AnyPermissions {
  @scala.inline
  def apply(
    origins: js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.MatchPattern] = null,
    permissions: js.Array[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.Permission] = null
  ): AnyPermissions = {
    val __obj = js.Dynamic.literal()
    if (origins != null) __obj.updateDynamic("origins")(origins)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[AnyPermissions]
  }
}

