package typings
package properDashLockfileLib.properDashLockfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckOptions extends js.Object {
   // default: true
  var fs: js.UndefOr[js.Any] = js.undefined
   // default: graceful-fs
  var lockfilePath: js.UndefOr[java.lang.String] = js.undefined
   // default: 10000
  var realpath: js.UndefOr[scala.Boolean] = js.undefined
  var stale: js.UndefOr[scala.Double] = js.undefined
}

object CheckOptions {
  @scala.inline
  def apply(
    fs: js.Any = null,
    lockfilePath: java.lang.String = null,
    realpath: js.UndefOr[scala.Boolean] = js.undefined,
    stale: scala.Int | scala.Double = null
  ): CheckOptions = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (lockfilePath != null) __obj.updateDynamic("lockfilePath")(lockfilePath)
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath)
    if (stale != null) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckOptions]
  }
}

