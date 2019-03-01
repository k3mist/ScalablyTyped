package typings
package reactDashDataDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableShiftSelect[T] extends js.Object {
  var enableShiftSelect: js.UndefOr[scala.Boolean] = js.undefined
  var onRowsDeselected: js.UndefOr[
    js.Function1[
      /* rows */ js.Array[reactDashDataDashGridLib.AdazzleReactDataGridNs.SelectionParams[T]], 
      scala.Unit
    ]
  ] = js.undefined
  var onRowsSelected: js.UndefOr[
    js.Function1[
      /* rows */ js.Array[reactDashDataDashGridLib.AdazzleReactDataGridNs.SelectionParams[T]], 
      scala.Unit
    ]
  ] = js.undefined
  var selectBy: js.UndefOr[Anon_Indexes] = js.undefined
  var showCheckbox: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_EnableShiftSelect {
  @scala.inline
  def apply[T](
    enableShiftSelect: js.UndefOr[scala.Boolean] = js.undefined,
    onRowsDeselected: js.Function1[
      /* rows */ js.Array[reactDashDataDashGridLib.AdazzleReactDataGridNs.SelectionParams[T]], 
      scala.Unit
    ] = null,
    onRowsSelected: js.Function1[
      /* rows */ js.Array[reactDashDataDashGridLib.AdazzleReactDataGridNs.SelectionParams[T]], 
      scala.Unit
    ] = null,
    selectBy: Anon_Indexes = null,
    showCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EnableShiftSelect[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableShiftSelect)) __obj.updateDynamic("enableShiftSelect")(enableShiftSelect)
    if (onRowsDeselected != null) __obj.updateDynamic("onRowsDeselected")(onRowsDeselected)
    if (onRowsSelected != null) __obj.updateDynamic("onRowsSelected")(onRowsSelected)
    if (selectBy != null) __obj.updateDynamic("selectBy")(selectBy)
    if (!js.isUndefined(showCheckbox)) __obj.updateDynamic("showCheckbox")(showCheckbox)
    __obj.asInstanceOf[Anon_EnableShiftSelect[T]]
  }
}

