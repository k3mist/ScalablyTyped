package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompanionSetting extends js.Object {
  /** Whether companions are disabled for this placement. */
  var companionsDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Whitelist of companion sizes to be served to this placement. Set this list to null or empty to serve all companion sizes. */
  var enabledSizes: js.UndefOr[js.Array[Size]] = js.undefined
  /** Whether to serve only static images as companions. */
  var imageOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#companionSetting". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object CompanionSetting {
  @scala.inline
  def apply(
    companionsDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    enabledSizes: js.Array[Size] = null,
    imageOnly: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null
  ): CompanionSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(companionsDisabled)) __obj.updateDynamic("companionsDisabled")(companionsDisabled)
    if (enabledSizes != null) __obj.updateDynamic("enabledSizes")(enabledSizes)
    if (!js.isUndefined(imageOnly)) __obj.updateDynamic("imageOnly")(imageOnly)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[CompanionSetting]
  }
}

