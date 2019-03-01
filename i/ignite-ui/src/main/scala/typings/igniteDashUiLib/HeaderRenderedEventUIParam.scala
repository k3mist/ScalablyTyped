package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderRenderedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to headers table DOM element.
  	 */
  var table: js.UndefOr[stdLib.Element] = js.undefined
}

object HeaderRenderedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, table: stdLib.Element = null): HeaderRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[HeaderRenderedEventUIParam]
  }
}

