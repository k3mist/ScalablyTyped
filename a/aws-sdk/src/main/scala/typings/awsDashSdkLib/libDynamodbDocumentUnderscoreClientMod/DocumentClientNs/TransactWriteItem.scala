package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactWriteItem extends js.Object {
  /**
    * A request to perform a check item operation.
    */
  var ConditionCheck: js.UndefOr[ConditionCheck] = js.undefined
  /**
    * A request to perform a DeleteItem operation.
    */
  var Delete: js.UndefOr[Delete] = js.undefined
  /**
    * A request to perform a PutItem operation.
    */
  var Put: js.UndefOr[Put] = js.undefined
  /**
    * A request to perform an UpdateItem operation.
    */
  var Update: js.UndefOr[Update] = js.undefined
}

object TransactWriteItem {
  @scala.inline
  def apply(
    ConditionCheck: ConditionCheck = null,
    Delete: Delete = null,
    Put: Put = null,
    Update: Update = null
  ): TransactWriteItem = {
    val __obj = js.Dynamic.literal()
    if (ConditionCheck != null) __obj.updateDynamic("ConditionCheck")(ConditionCheck)
    if (Delete != null) __obj.updateDynamic("Delete")(Delete)
    if (Put != null) __obj.updateDynamic("Put")(Put)
    if (Update != null) __obj.updateDynamic("Update")(Update)
    __obj.asInstanceOf[TransactWriteItem]
  }
}

