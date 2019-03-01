package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewChangingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the currently selected view.
  	 */
  var currentSelectedView: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the newly selected view.
  	 */
  var newSelectedView: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the scheduler.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ViewChangingEventUIParam {
  @scala.inline
  def apply(
    currentSelectedView: java.lang.String = null,
    newSelectedView: java.lang.String = null,
    owner: js.Any = null
  ): ViewChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentSelectedView != null) __obj.updateDynamic("currentSelectedView")(currentSelectedView)
    if (newSelectedView != null) __obj.updateDynamic("newSelectedView")(newSelectedView)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ViewChangingEventUIParam]
  }
}

