package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditRowEndedEventUIParam extends js.Object {
  /**
  	 * Gets the old value for the column with the specified key.
  	 */
  var oldValues: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to GridUpdating.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Check if the edit mode is for adding a new row.
  	 */
  var rowAdding: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the row's PK value.
  	 */
  var rowID: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Check if any of the values is changed which will cause update in the data source.
  	 */
  var update: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the new value for the column with the specified key.
  	 */
  var values: js.UndefOr[js.Any] = js.undefined
}

object EditRowEndedEventUIParam {
  @scala.inline
  def apply(
    oldValues: js.Any = null,
    owner: js.Any = null,
    rowAdding: js.UndefOr[scala.Boolean] = js.undefined,
    rowID: js.Any = null,
    update: js.UndefOr[scala.Boolean] = js.undefined,
    values: js.Any = null
  ): EditRowEndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (oldValues != null) __obj.updateDynamic("oldValues")(oldValues)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(rowAdding)) __obj.updateDynamic("rowAdding")(rowAdding)
    if (rowID != null) __obj.updateDynamic("rowID")(rowID)
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[EditRowEndedEventUIParam]
  }
}

