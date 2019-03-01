package typings
package pathDashParserLib.pathDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITestOptions extends js.Object {
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var queryParams: js.UndefOr[searchDashParamsLib.typingsEncodeMod.IOptions] = js.undefined
  var strictTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined
}

object ITestOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    queryParams: searchDashParamsLib.typingsEncodeMod.IOptions = null,
    strictTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined
  ): ITestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    if (!js.isUndefined(strictTrailingSlash)) __obj.updateDynamic("strictTrailingSlash")(strictTrailingSlash)
    __obj.asInstanceOf[ITestOptions]
  }
}

