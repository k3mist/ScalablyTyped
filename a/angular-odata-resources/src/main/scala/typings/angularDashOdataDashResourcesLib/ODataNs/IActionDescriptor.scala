package typings
package angularDashOdataDashResourcesLib.ODataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Just a reference to facilitate describing new actions
trait IActionDescriptor extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var isArray: js.UndefOr[scala.Boolean] = js.undefined
  var method: java.lang.String
  var params: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object IActionDescriptor {
  @scala.inline
  def apply(
    method: java.lang.String,
    headers: js.Any = null,
    isArray: js.UndefOr[scala.Boolean] = js.undefined,
    params: js.Any = null,
    url: java.lang.String = null
  ): IActionDescriptor = {
    val __obj = js.Dynamic.literal(method = method)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(isArray)) __obj.updateDynamic("isArray")(isArray)
    if (params != null) __obj.updateDynamic("params")(params)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IActionDescriptor]
  }
}

