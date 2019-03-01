package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagSettings extends js.Object {
  /** Whether dynamic floodlight tags are enabled. */
  var dynamicTagEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether image tags are enabled. */
  var imageTagEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object TagSettings {
  @scala.inline
  def apply(
    dynamicTagEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    imageTagEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): TagSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicTagEnabled)) __obj.updateDynamic("dynamicTagEnabled")(dynamicTagEnabled)
    if (!js.isUndefined(imageTagEnabled)) __obj.updateDynamic("imageTagEnabled")(imageTagEnabled)
    __obj.asInstanceOf[TagSettings]
  }
}

