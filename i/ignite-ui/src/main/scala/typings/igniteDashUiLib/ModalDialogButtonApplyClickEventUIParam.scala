package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogButtonApplyClickEventUIParam extends js.Object {
  /**
  	 * Gets the array of column layouts.
  	 */
  var groupedColumnLayouts: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets the array of grouped columns.
  	 */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets a reference to the modal dialog element. This is a jQuery object.
  	 */
  var modalDialogElement: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the array of sorted columns.
  	 */
  var sortingExpr: js.UndefOr[js.Array[_]] = js.undefined
}

object ModalDialogButtonApplyClickEventUIParam {
  @scala.inline
  def apply(
    groupedColumnLayouts: js.Array[_] = null,
    groupedColumns: js.Array[_] = null,
    modalDialogElement: java.lang.String = null,
    owner: js.Any = null,
    sortingExpr: js.Array[_] = null
  ): ModalDialogButtonApplyClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (groupedColumnLayouts != null) __obj.updateDynamic("groupedColumnLayouts")(groupedColumnLayouts)
    if (groupedColumns != null) __obj.updateDynamic("groupedColumns")(groupedColumns)
    if (modalDialogElement != null) __obj.updateDynamic("modalDialogElement")(modalDialogElement)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (sortingExpr != null) __obj.updateDynamic("sortingExpr")(sortingExpr)
    __obj.asInstanceOf[ModalDialogButtonApplyClickEventUIParam]
  }
}

