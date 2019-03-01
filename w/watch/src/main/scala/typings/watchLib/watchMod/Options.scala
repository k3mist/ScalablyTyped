package typings
package watchLib.watchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var filter: js.UndefOr[
    js.Function2[/* path */ java.lang.String, /* stat */ nodeLib.fsMod.Stats, scala.Boolean]
  ] = js.undefined
  var ignoreDirectoryPattern: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreDotFiles: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreNotPermitted: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUnreadableDir: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    filter: js.Function2[/* path */ java.lang.String, /* stat */ nodeLib.fsMod.Stats, scala.Boolean] = null,
    ignoreDirectoryPattern: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDotFiles: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreNotPermitted: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreUnreadableDir: js.UndefOr[scala.Boolean] = js.undefined,
    interval: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(ignoreDirectoryPattern)) __obj.updateDynamic("ignoreDirectoryPattern")(ignoreDirectoryPattern)
    if (!js.isUndefined(ignoreDotFiles)) __obj.updateDynamic("ignoreDotFiles")(ignoreDotFiles)
    if (!js.isUndefined(ignoreNotPermitted)) __obj.updateDynamic("ignoreNotPermitted")(ignoreNotPermitted)
    if (!js.isUndefined(ignoreUnreadableDir)) __obj.updateDynamic("ignoreUnreadableDir")(ignoreUnreadableDir)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

