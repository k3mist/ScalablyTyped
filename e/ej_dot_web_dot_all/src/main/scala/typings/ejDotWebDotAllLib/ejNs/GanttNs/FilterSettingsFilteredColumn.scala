package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettingsFilteredColumn extends js.Object {
  /** Specifies the field where filtering has to be performed.
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the filter condition to filtered column. See operator
    */
  var operator: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the predicate(and/or) value to perform filtering.
    */
  var predicate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the value to be filtered in Gantt.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object FilterSettingsFilteredColumn {
  @scala.inline
  def apply(
    field: java.lang.String = null,
    operator: java.lang.String = null,
    predicate: java.lang.String = null,
    value: java.lang.String = null
  ): FilterSettingsFilteredColumn = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (predicate != null) __obj.updateDynamic("predicate")(predicate)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FilterSettingsFilteredColumn]
  }
}

