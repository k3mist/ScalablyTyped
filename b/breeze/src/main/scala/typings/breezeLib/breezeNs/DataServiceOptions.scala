package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataServiceOptions extends js.Object {
  var adapterName: js.UndefOr[java.lang.String] = js.undefined
  var hasServerMetadata: js.UndefOr[scala.Boolean] = js.undefined
  var jsonResultsAdapter: js.UndefOr[JsonResultsAdapter] = js.undefined
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
  var uriBuilderName: js.UndefOr[java.lang.String] = js.undefined
  var useJsonp: js.UndefOr[scala.Boolean] = js.undefined
}

object DataServiceOptions {
  @scala.inline
  def apply(
    adapterName: java.lang.String = null,
    hasServerMetadata: js.UndefOr[scala.Boolean] = js.undefined,
    jsonResultsAdapter: JsonResultsAdapter = null,
    serviceName: java.lang.String = null,
    uriBuilderName: java.lang.String = null,
    useJsonp: js.UndefOr[scala.Boolean] = js.undefined
  ): DataServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (adapterName != null) __obj.updateDynamic("adapterName")(adapterName)
    if (!js.isUndefined(hasServerMetadata)) __obj.updateDynamic("hasServerMetadata")(hasServerMetadata)
    if (jsonResultsAdapter != null) __obj.updateDynamic("jsonResultsAdapter")(jsonResultsAdapter)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    if (uriBuilderName != null) __obj.updateDynamic("uriBuilderName")(uriBuilderName)
    if (!js.isUndefined(useJsonp)) __obj.updateDynamic("useJsonp")(useJsonp)
    __obj.asInstanceOf[DataServiceOptions]
  }
}

