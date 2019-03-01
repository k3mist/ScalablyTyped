package typings
package routeDashNodeLib.routeDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOptions extends js.Object {
  var queryParams: js.UndefOr[searchDashParamsLib.typingsEncodeMod.IOptions] = js.undefined
  var queryParamsMode: js.UndefOr[QueryParamsMode] = js.undefined
  var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.undefined
}

object BuildOptions {
  @scala.inline
  def apply(
    queryParams: searchDashParamsLib.typingsEncodeMod.IOptions = null,
    queryParamsMode: QueryParamsMode = null,
    trailingSlashMode: TrailingSlashMode = null
  ): BuildOptions = {
    val __obj = js.Dynamic.literal()
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    if (queryParamsMode != null) __obj.updateDynamic("queryParamsMode")(queryParamsMode)
    if (trailingSlashMode != null) __obj.updateDynamic("trailingSlashMode")(trailingSlashMode)
    __obj.asInstanceOf[BuildOptions]
  }
}

