package typings
package gulpDashTsdLib.gulpDashTsdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var command: js.UndefOr[java.lang.String] = js.undefined
  var config: js.UndefOr[java.lang.String] = js.undefined
  var latest: js.UndefOr[scala.Boolean] = js.undefined
  var opts: js.UndefOr[js.Object] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    command: java.lang.String = null,
    config: java.lang.String = null,
    latest: js.UndefOr[scala.Boolean] = js.undefined,
    opts: js.Object = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command)
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(latest)) __obj.updateDynamic("latest")(latest)
    if (opts != null) __obj.updateDynamic("opts")(opts)
    __obj.asInstanceOf[IOptions]
  }
}

