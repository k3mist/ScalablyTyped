package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpEncodingParameters extends RTCRtpCodingParameters {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var codecPayloadType: js.UndefOr[scala.Double] = js.undefined
  var dtx: js.UndefOr[RTCDtxStatus] = js.undefined
  var maxBitrate: js.UndefOr[scala.Double] = js.undefined
  var maxFramerate: js.UndefOr[scala.Double] = js.undefined
  var priority: js.UndefOr[RTCPriorityType] = js.undefined
  var ptime: js.UndefOr[scala.Double] = js.undefined
  var scaleResolutionDownBy: js.UndefOr[scala.Double] = js.undefined
}

object RTCRtpEncodingParameters {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    codecPayloadType: scala.Int | scala.Double = null,
    dtx: RTCDtxStatus = null,
    maxBitrate: scala.Int | scala.Double = null,
    maxFramerate: scala.Int | scala.Double = null,
    priority: RTCPriorityType = null,
    ptime: scala.Int | scala.Double = null,
    rid: java.lang.String = null,
    scaleResolutionDownBy: scala.Int | scala.Double = null
  ): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (codecPayloadType != null) __obj.updateDynamic("codecPayloadType")(codecPayloadType.asInstanceOf[js.Any])
    if (dtx != null) __obj.updateDynamic("dtx")(dtx)
    if (maxBitrate != null) __obj.updateDynamic("maxBitrate")(maxBitrate.asInstanceOf[js.Any])
    if (maxFramerate != null) __obj.updateDynamic("maxFramerate")(maxFramerate.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (ptime != null) __obj.updateDynamic("ptime")(ptime.asInstanceOf[js.Any])
    if (rid != null) __obj.updateDynamic("rid")(rid)
    if (scaleResolutionDownBy != null) __obj.updateDynamic("scaleResolutionDownBy")(scaleResolutionDownBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
}

