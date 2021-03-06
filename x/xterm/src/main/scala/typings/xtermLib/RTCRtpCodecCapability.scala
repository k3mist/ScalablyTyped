package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpCodecCapability extends js.Object {
  var channels: js.UndefOr[scala.Double] = js.undefined
  var clockRate: scala.Double
  var mimeType: java.lang.String
  var sdpFmtpLine: js.UndefOr[java.lang.String] = js.undefined
}

object RTCRtpCodecCapability {
  @scala.inline
  def apply(
    clockRate: scala.Double,
    mimeType: java.lang.String,
    channels: scala.Int | scala.Double = null,
    sdpFmtpLine: java.lang.String = null
  ): RTCRtpCodecCapability = {
    val __obj = js.Dynamic.literal(clockRate = clockRate, mimeType = mimeType)
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (sdpFmtpLine != null) __obj.updateDynamic("sdpFmtpLine")(sdpFmtpLine)
    __obj.asInstanceOf[RTCRtpCodecCapability]
  }
}

