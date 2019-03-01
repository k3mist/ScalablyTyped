package typings
package expressDashHandlebarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[js.Object] = js.undefined
  var helpers: js.UndefOr[js.Any] = js.undefined
  var partials: js.UndefOr[js.Any] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Object = null,
    helpers: js.Any = null,
    partials: js.Any = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (data != null) __obj.updateDynamic("data")(data)
    if (helpers != null) __obj.updateDynamic("helpers")(helpers)
    if (partials != null) __obj.updateDynamic("partials")(partials)
    __obj.asInstanceOf[RenderOptions]
  }
}

