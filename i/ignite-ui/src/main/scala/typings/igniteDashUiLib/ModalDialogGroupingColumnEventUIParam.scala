package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogGroupingColumnEventUIParam extends js.Object {
  /**
  	 * The key of the column to be grouped.
  	 */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the current layout object, if any.
  	 */
  var layout: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ModalDialogGroupingColumnEventUIParam {
  @scala.inline
  def apply(key: java.lang.String = null, layout: js.Any = null, owner: js.Any = null): ModalDialogGroupingColumnEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ModalDialogGroupingColumnEventUIParam]
  }
}

