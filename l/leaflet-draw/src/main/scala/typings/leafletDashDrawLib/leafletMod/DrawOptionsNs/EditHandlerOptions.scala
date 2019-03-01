package typings
package leafletDashDrawLib.leafletMod.DrawOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditHandlerOptions extends js.Object {
  /**
  			 * The path options for how the layers will look while in edit mode.
  			 * If this is set to null the editable path options will not be set.
  			 *
  			 * Default value: See code
  			 */
  var selectedPathOptions: js.UndefOr[leafletLib.leafletMod.PathOptions] = js.undefined
}

object EditHandlerOptions {
  @scala.inline
  def apply(selectedPathOptions: leafletLib.leafletMod.PathOptions = null): EditHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (selectedPathOptions != null) __obj.updateDynamic("selectedPathOptions")(selectedPathOptions)
    __obj.asInstanceOf[EditHandlerOptions]
  }
}

