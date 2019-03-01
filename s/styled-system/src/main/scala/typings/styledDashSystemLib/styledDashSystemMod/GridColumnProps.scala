package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnProps extends js.Object {
  /**
    * The grid-column CSS property is a shorthand property for grid-column-start and grid-column-end specifying
    * a grid item's size and location within the grid column by contributing a line, a span, or nothing (automatic)
    * to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column)
    */
  var gridColumn: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.GridColumnProperty]] = js.undefined
}

object GridColumnProps {
  @scala.inline
  def apply(gridColumn: ResponsiveValue[csstypeLib.csstypeMod.GridColumnProperty] = null): GridColumnProps = {
    val __obj = js.Dynamic.literal()
    if (gridColumn != null) __obj.updateDynamic("gridColumn")(gridColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnProps]
  }
}

