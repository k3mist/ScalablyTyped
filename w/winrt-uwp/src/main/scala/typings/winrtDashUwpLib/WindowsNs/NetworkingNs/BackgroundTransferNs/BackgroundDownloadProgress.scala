package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains status information about the download operation. */
trait BackgroundDownloadProgress extends js.Object {
  /** The total number of bytes received. This value does not include bytes received as response headers. */
  var bytesReceived: scala.Double
  /** true if the download request response has changed; otherwise, false. */
  var hasResponseChanged: scala.Boolean
  /** true if a data transfer operation has restarted; otherwise false. */
  var hasRestarted: scala.Boolean
  /** The current status of the download operation. */
  var status: BackgroundTransferStatus
  /** The total number of bytes of data to download. If this number is unknown, this value is set to 0. */
  var totalBytesToReceive: scala.Double
}

object BackgroundDownloadProgress {
  @scala.inline
  def apply(
    bytesReceived: scala.Double,
    hasResponseChanged: scala.Boolean,
    hasRestarted: scala.Boolean,
    status: BackgroundTransferStatus,
    totalBytesToReceive: scala.Double
  ): BackgroundDownloadProgress = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived, hasResponseChanged = hasResponseChanged, hasRestarted = hasRestarted, status = status, totalBytesToReceive = totalBytesToReceive)
  
    __obj.asInstanceOf[BackgroundDownloadProgress]
  }
}

