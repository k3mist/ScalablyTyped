package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RichMediaExitOverride extends js.Object {
  /** Click-through URL of this rich media exit override. Applicable if the enabled field is set to true. */
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  /** Whether to use the clickThroughUrl. If false, the creative-level exit will be used. */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** ID for the override to refer to a specific exit in the creative. */
  var exitId: js.UndefOr[java.lang.String] = js.undefined
}

object RichMediaExitOverride {
  @scala.inline
  def apply(
    clickThroughUrl: ClickThroughUrl = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    exitId: java.lang.String = null
  ): RichMediaExitOverride = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (exitId != null) __obj.updateDynamic("exitId")(exitId)
    __obj.asInstanceOf[RichMediaExitOverride]
  }
}

