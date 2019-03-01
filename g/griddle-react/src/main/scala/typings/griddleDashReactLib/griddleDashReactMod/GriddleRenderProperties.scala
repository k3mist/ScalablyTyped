package typings
package griddleDashReactLib.griddleDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GriddleRenderProperties extends js.Object {
  var columnProperties: js.UndefOr[PropertyBag[ColumnRenderProperties]] = js.undefined
  var rowProperties: js.UndefOr[RowRenderProperties] = js.undefined
}

object GriddleRenderProperties {
  @scala.inline
  def apply(
    columnProperties: PropertyBag[ColumnRenderProperties] = null,
    rowProperties: RowRenderProperties = null
  ): GriddleRenderProperties = {
    val __obj = js.Dynamic.literal()
    if (columnProperties != null) __obj.updateDynamic("columnProperties")(columnProperties)
    if (rowProperties != null) __obj.updateDynamic("rowProperties")(rowProperties)
    __obj.asInstanceOf[GriddleRenderProperties]
  }
}

