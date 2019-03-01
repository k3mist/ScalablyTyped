package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFilteredEventUIParam extends js.Object {
  /**
  	 * Gets the column index. Applicable only when filtering mode is "simple".
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the column key. Applicable only when filtering mode is "simple".
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the filtered expressions.
  	 */
  var expressions: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DataFilteredEventUIParam {
  @scala.inline
  def apply(
    columnIndex: scala.Int | scala.Double = null,
    columnKey: java.lang.String = null,
    expressions: js.Array[_] = null,
    owner: js.Any = null
  ): DataFilteredEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (expressions != null) __obj.updateDynamic("expressions")(expressions)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[DataFilteredEventUIParam]
  }
}

