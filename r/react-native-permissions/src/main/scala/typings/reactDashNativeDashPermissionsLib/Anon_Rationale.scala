package typings
package reactDashNativeDashPermissionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rationale extends js.Object {
  var rationale: js.UndefOr[reactDashNativeDashPermissionsLib.reactDashNativeDashPermissionsMod.Rationale] = js.undefined
  var `type`: java.lang.String
}

object Anon_Rationale {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    rationale: reactDashNativeDashPermissionsLib.reactDashNativeDashPermissionsMod.Rationale = null
  ): Anon_Rationale = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (rationale != null) __obj.updateDynamic("rationale")(rationale)
    __obj.asInstanceOf[Anon_Rationale]
  }
}

