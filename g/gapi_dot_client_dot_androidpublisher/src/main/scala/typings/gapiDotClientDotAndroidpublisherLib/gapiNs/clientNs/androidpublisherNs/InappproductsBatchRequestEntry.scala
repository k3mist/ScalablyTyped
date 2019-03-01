package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var inappproductsinsertrequest: js.UndefOr[InappproductsInsertRequest] = js.undefined
  var inappproductsupdaterequest: js.UndefOr[InappproductsUpdateRequest] = js.undefined
  var methodName: js.UndefOr[java.lang.String] = js.undefined
}

object InappproductsBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    inappproductsinsertrequest: InappproductsInsertRequest = null,
    inappproductsupdaterequest: InappproductsUpdateRequest = null,
    methodName: java.lang.String = null
  ): InappproductsBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (inappproductsinsertrequest != null) __obj.updateDynamic("inappproductsinsertrequest")(inappproductsinsertrequest)
    if (inappproductsupdaterequest != null) __obj.updateDynamic("inappproductsupdaterequest")(inappproductsupdaterequest)
    if (methodName != null) __obj.updateDynamic("methodName")(methodName)
    __obj.asInstanceOf[InappproductsBatchRequestEntry]
  }
}

