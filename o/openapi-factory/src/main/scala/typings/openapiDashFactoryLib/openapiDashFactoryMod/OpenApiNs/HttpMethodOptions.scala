package typings
package openapiDashFactoryLib.openapiDashFactoryMod.OpenApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpMethodOptions extends js.Object {
  var rawBody: js.UndefOr[scala.Boolean] = js.undefined
}

object HttpMethodOptions {
  @scala.inline
  def apply(rawBody: js.UndefOr[scala.Boolean] = js.undefined): HttpMethodOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rawBody)) __obj.updateDynamic("rawBody")(rawBody)
    __obj.asInstanceOf[HttpMethodOptions]
  }
}

