package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDialogContentsRenderedEventUIParam extends js.Object {
  /**
  	 * Gets reference to the filtering dialog DOM element.
  	 */
  var dialogElement: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FilterDialogContentsRenderedEventUIParam {
  @scala.inline
  def apply(dialogElement: java.lang.String = null, owner: js.Any = null): FilterDialogContentsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dialogElement != null) __obj.updateDynamic("dialogElement")(dialogElement)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[FilterDialogContentsRenderedEventUIParam]
  }
}

