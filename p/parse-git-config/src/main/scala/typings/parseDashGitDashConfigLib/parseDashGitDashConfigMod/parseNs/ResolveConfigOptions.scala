package typings
package parseDashGitDashConfigLib.parseDashGitDashConfigMod.parseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveConfigOptions extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[parseDashGitDashConfigLib.parseDashGitDashConfigLibStrings.global] = js.undefined
}

object ResolveConfigOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    path: java.lang.String = null,
    `type`: parseDashGitDashConfigLib.parseDashGitDashConfigLibStrings.global = null
  ): ResolveConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResolveConfigOptions]
  }
}

