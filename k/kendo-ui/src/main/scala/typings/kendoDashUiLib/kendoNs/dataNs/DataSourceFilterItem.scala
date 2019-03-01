package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceFilterItem extends DataSourceFilter {
  var field: js.UndefOr[java.lang.String] = js.undefined
  var operator: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DataSourceFilterItem {
  @scala.inline
  def apply(
    field: java.lang.String = null,
    operator: java.lang.String | js.Function = null,
    value: js.Any = null
  ): DataSourceFilterItem = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataSourceFilterItem]
  }
}

