package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#dom-rtcrtpcontributingsource
trait RTCRtpContributingSource extends js.Object {
  //readonly timestamp: number;
  var source: scala.Double
  //readonly audioLevel: number | null;
  val voiceActivityFlag: js.UndefOr[scala.Boolean] = js.undefined
}

object RTCRtpContributingSource {
  @scala.inline
  def apply(source: scala.Double, voiceActivityFlag: js.UndefOr[scala.Boolean] = js.undefined): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(source = source)
    if (!js.isUndefined(voiceActivityFlag)) __obj.updateDynamic("voiceActivityFlag")(voiceActivityFlag)
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
}

