package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchExternal extends js.Object {
  var launchExternal: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_LaunchExternal {
  @scala.inline
  def apply(launchExternal: js.UndefOr[scala.Boolean] = js.undefined, `type`: java.lang.String = null): Anon_LaunchExternal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(launchExternal)) __obj.updateDynamic("launchExternal")(launchExternal)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_LaunchExternal]
  }
}

