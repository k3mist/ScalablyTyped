package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEntityOptions extends TimeoutIntervalOptions {
  var checkEtag: js.UndefOr[scala.Boolean] = js.undefined
}

object UpdateEntityOptions {
  @scala.inline
  def apply(
    checkEtag: js.UndefOr[scala.Boolean] = js.undefined,
    locationMode: java.lang.String = null,
    maximumExecutionTimeInMs: scala.Int | scala.Double = null,
    timeoutIntervalInMs: scala.Int | scala.Double = null
  ): UpdateEntityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkEtag)) __obj.updateDynamic("checkEtag")(checkEtag)
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode)
    if (maximumExecutionTimeInMs != null) __obj.updateDynamic("maximumExecutionTimeInMs")(maximumExecutionTimeInMs.asInstanceOf[js.Any])
    if (timeoutIntervalInMs != null) __obj.updateDynamic("timeoutIntervalInMs")(timeoutIntervalInMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEntityOptions]
  }
}

