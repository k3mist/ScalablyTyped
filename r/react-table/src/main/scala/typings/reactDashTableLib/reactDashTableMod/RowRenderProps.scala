package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-table.react-table.RowInfo ]:? react-table.react-table.RowInfo[P]} */ trait RowRenderProps extends js.Object {
  /** Whenever the current row is expanded */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
  /** The current cell value */
  var value: js.UndefOr[js.Any] = js.undefined
}

object RowRenderProps {
  @scala.inline
  def apply(isExpanded: js.UndefOr[scala.Boolean] = js.undefined, value: js.Any = null): RowRenderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RowRenderProps]
  }
}

