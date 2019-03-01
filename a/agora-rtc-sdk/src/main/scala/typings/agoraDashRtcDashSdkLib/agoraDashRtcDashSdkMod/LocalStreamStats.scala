package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStreamStats extends js.Object {
  var audioCodecName: java.lang.String
  var audioSendBytes: java.lang.String
  var audioSendPackets: java.lang.String
  var duration: java.lang.String
  var startTime: java.lang.String
  var timestamp: java.lang.String
  var videoCodecName: java.lang.String
  var videoSendBandwidth: java.lang.String
  var videoSendBytes: java.lang.String
  var videoSendFrameRate: java.lang.String
  var videoSendPackets: java.lang.String
  var videoSendPacketsLost: java.lang.String
  var videoSendResolutionHeight: js.UndefOr[java.lang.String] = js.undefined
  var videoSendResolutionWidth: js.UndefOr[java.lang.String] = js.undefined
}

object LocalStreamStats {
  @scala.inline
  def apply(
    audioCodecName: java.lang.String,
    audioSendBytes: java.lang.String,
    audioSendPackets: java.lang.String,
    duration: java.lang.String,
    startTime: java.lang.String,
    timestamp: java.lang.String,
    videoCodecName: java.lang.String,
    videoSendBandwidth: java.lang.String,
    videoSendBytes: java.lang.String,
    videoSendFrameRate: java.lang.String,
    videoSendPackets: java.lang.String,
    videoSendPacketsLost: java.lang.String,
    videoSendResolutionHeight: java.lang.String = null,
    videoSendResolutionWidth: java.lang.String = null
  ): LocalStreamStats = {
    val __obj = js.Dynamic.literal(audioCodecName = audioCodecName, audioSendBytes = audioSendBytes, audioSendPackets = audioSendPackets, duration = duration, startTime = startTime, timestamp = timestamp, videoCodecName = videoCodecName, videoSendBandwidth = videoSendBandwidth, videoSendBytes = videoSendBytes, videoSendFrameRate = videoSendFrameRate, videoSendPackets = videoSendPackets, videoSendPacketsLost = videoSendPacketsLost)
    if (videoSendResolutionHeight != null) __obj.updateDynamic("videoSendResolutionHeight")(videoSendResolutionHeight)
    if (videoSendResolutionWidth != null) __obj.updateDynamic("videoSendResolutionWidth")(videoSendResolutionWidth)
    __obj.asInstanceOf[LocalStreamStats]
  }
}

