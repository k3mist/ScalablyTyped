package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogButtonUnsortClickEventUIParam extends js.Object {
  /**
  	 * Gets the column key.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the modal dialog element. This is a jQuery object.
  	 */
  var modalDialogElement: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to GridSorting.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ModalDialogButtonUnsortClickEventUIParam {
  @scala.inline
  def apply(
    columnKey: java.lang.String = null,
    modalDialogElement: java.lang.String = null,
    owner: js.Any = null
  ): ModalDialogButtonUnsortClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (modalDialogElement != null) __obj.updateDynamic("modalDialogElement")(modalDialogElement)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ModalDialogButtonUnsortClickEventUIParam]
  }
}

