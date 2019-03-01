package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsCommand extends js.Object {
  /** Gets or sets an object to customize command button with available ejButton properties.
    */
  var buttonOptions: js.UndefOr[js.Any] = js.undefined
  /** Gets or sets a value that define the command column buttons to be displayed.
    */
  var `type`: js.UndefOr[UnboundType | java.lang.String] = js.undefined
}

object ColumnsCommand {
  @scala.inline
  def apply(buttonOptions: js.Any = null, `type`: UnboundType | java.lang.String = null): ColumnsCommand = {
    val __obj = js.Dynamic.literal()
    if (buttonOptions != null) __obj.updateDynamic("buttonOptions")(buttonOptions)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsCommand]
  }
}

