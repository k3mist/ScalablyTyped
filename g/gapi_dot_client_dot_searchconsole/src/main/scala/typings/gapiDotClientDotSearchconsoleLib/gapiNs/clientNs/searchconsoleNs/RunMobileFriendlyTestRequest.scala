package typings
package gapiDotClientDotSearchconsoleLib.gapiNs.clientNs.searchconsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunMobileFriendlyTestRequest extends js.Object {
  /** Whether or not screenshot is requested. Default is false. */
  var requestScreenshot: js.UndefOr[scala.Boolean] = js.undefined
  /** URL for inspection. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object RunMobileFriendlyTestRequest {
  @scala.inline
  def apply(requestScreenshot: js.UndefOr[scala.Boolean] = js.undefined, url: java.lang.String = null): RunMobileFriendlyTestRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requestScreenshot)) __obj.updateDynamic("requestScreenshot")(requestScreenshot)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RunMobileFriendlyTestRequest]
  }
}

