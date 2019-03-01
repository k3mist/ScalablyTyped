package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CdnSettings extends js.Object {
  /** The format of the video stream that you are sending to Youtube. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** The frame rate of the inbound video data. */
  var frameRate: js.UndefOr[java.lang.String] = js.undefined
  /** The ingestionInfo object contains information that YouTube provides that you need to transmit your RTMP or HTTP stream to YouTube. */
  var ingestionInfo: js.UndefOr[IngestionInfo] = js.undefined
  /** The method or protocol used to transmit the video stream. */
  var ingestionType: js.UndefOr[java.lang.String] = js.undefined
  /** The resolution of the inbound video data. */
  var resolution: js.UndefOr[java.lang.String] = js.undefined
}

object CdnSettings {
  @scala.inline
  def apply(
    format: java.lang.String = null,
    frameRate: java.lang.String = null,
    ingestionInfo: IngestionInfo = null,
    ingestionType: java.lang.String = null,
    resolution: java.lang.String = null
  ): CdnSettings = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate)
    if (ingestionInfo != null) __obj.updateDynamic("ingestionInfo")(ingestionInfo)
    if (ingestionType != null) __obj.updateDynamic("ingestionType")(ingestionType)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    __obj.asInstanceOf[CdnSettings]
  }
}

