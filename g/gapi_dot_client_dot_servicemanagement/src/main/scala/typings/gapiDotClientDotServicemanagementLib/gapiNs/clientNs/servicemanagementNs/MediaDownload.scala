package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaDownload extends js.Object {
  /**
    * A boolean that determines whether a notification for the completion of a
    * download should be sent to the backend.
    */
  var completeNotification: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * DO NOT USE FIELDS BELOW THIS LINE UNTIL THIS WARNING IS REMOVED.
    *
    * Specify name of the download service if one is used for download.
    */
  var downloadService: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the Scotty dropzone to use for the current API. */
  var dropzone: js.UndefOr[java.lang.String] = js.undefined
  /** Whether download is enabled. */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional maximum acceptable size for direct download.
    * The size is specified in bytes.
    */
  var maxDirectDownloadSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A boolean that determines if direct download from ESF should be used for
    * download of this media.
    */
  var useDirectDownload: js.UndefOr[scala.Boolean] = js.undefined
}

object MediaDownload {
  @scala.inline
  def apply(
    completeNotification: js.UndefOr[scala.Boolean] = js.undefined,
    downloadService: java.lang.String = null,
    dropzone: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    maxDirectDownloadSize: java.lang.String = null,
    useDirectDownload: js.UndefOr[scala.Boolean] = js.undefined
  ): MediaDownload = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(completeNotification)) __obj.updateDynamic("completeNotification")(completeNotification)
    if (downloadService != null) __obj.updateDynamic("downloadService")(downloadService)
    if (dropzone != null) __obj.updateDynamic("dropzone")(dropzone)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (maxDirectDownloadSize != null) __obj.updateDynamic("maxDirectDownloadSize")(maxDirectDownloadSize)
    if (!js.isUndefined(useDirectDownload)) __obj.updateDynamic("useDirectDownload")(useDirectDownload)
    __obj.asInstanceOf[MediaDownload]
  }
}

