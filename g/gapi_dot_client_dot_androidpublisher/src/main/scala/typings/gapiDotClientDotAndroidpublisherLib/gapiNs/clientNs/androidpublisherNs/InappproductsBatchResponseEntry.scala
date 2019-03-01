package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var inappproductsinsertresponse: js.UndefOr[InappproductsInsertResponse] = js.undefined
  var inappproductsupdateresponse: js.UndefOr[InappproductsUpdateResponse] = js.undefined
}

object InappproductsBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    inappproductsinsertresponse: InappproductsInsertResponse = null,
    inappproductsupdateresponse: InappproductsUpdateResponse = null
  ): InappproductsBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (inappproductsinsertresponse != null) __obj.updateDynamic("inappproductsinsertresponse")(inappproductsinsertresponse)
    if (inappproductsupdateresponse != null) __obj.updateDynamic("inappproductsupdateresponse")(inappproductsupdateresponse)
    __obj.asInstanceOf[InappproductsBatchResponseEntry]
  }
}

