package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YarnApplication extends js.Object {
  /** Required. The application name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The numerical progress of the application, from 1 to 100. */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /** Required. The application state. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or TimelineServer that provides application-specific information. The URL uses the
    * internal hostname, and requires a proxy server for resolution and, possibly, access.
    */
  var trackingUrl: js.UndefOr[java.lang.String] = js.undefined
}

object YarnApplication {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    progress: scala.Int | scala.Double = null,
    state: java.lang.String = null,
    trackingUrl: java.lang.String = null
  ): YarnApplication = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (trackingUrl != null) __obj.updateDynamic("trackingUrl")(trackingUrl)
    __obj.asInstanceOf[YarnApplication]
  }
}

