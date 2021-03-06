package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiver
trait RTCRtpTransceiver extends js.Object {
  var direction: stdLib.RTCRtpTransceiverDirection
  val mid: java.lang.String | scala.Null
  val receiver: RTCRtpReceiver
  val sender: RTCRtpSender
  val stopped: scala.Boolean
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): scala.Unit
  def setDirection(direction: stdLib.RTCRtpTransceiverDirection): scala.Unit
  def stop(): scala.Unit
}

object RTCRtpTransceiver {
  @scala.inline
  def apply(
    direction: stdLib.RTCRtpTransceiverDirection,
    receiver: RTCRtpReceiver,
    sender: RTCRtpSender,
    setCodecPreferences: js.Array[RTCRtpCodecCapability] => scala.Unit,
    setDirection: stdLib.RTCRtpTransceiverDirection => scala.Unit,
    stop: () => scala.Unit,
    stopped: scala.Boolean,
    mid: java.lang.String = null
  ): RTCRtpTransceiver = {
    val __obj = js.Dynamic.literal(direction = direction, receiver = receiver, sender = sender, setCodecPreferences = js.Any.fromFunction1(setCodecPreferences), setDirection = js.Any.fromFunction1(setDirection), stop = js.Any.fromFunction0(stop), stopped = stopped)
    if (mid != null) __obj.updateDynamic("mid")(mid)
    __obj.asInstanceOf[RTCRtpTransceiver]
  }
}

