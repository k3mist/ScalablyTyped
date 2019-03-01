package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDialogFilterAddedEventUIParam extends js.Object {
  /**
  	 * Gets reference to the filters table row DOM element.
  	 */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FilterDialogFilterAddedEventUIParam {
  @scala.inline
  def apply(filter: java.lang.String = null, owner: js.Any = null): FilterDialogFilterAddedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[FilterDialogFilterAddedEventUIParam]
  }
}

