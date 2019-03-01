package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaCaptureInitializationSettings extends js.Object {
  var audioDeviceId: java.lang.String
  var photoCaptureSource: PhotoCaptureSource
  var streamingCaptureMode: StreamingCaptureMode
  var videoDeviceId: java.lang.String
}

object IMediaCaptureInitializationSettings {
  @scala.inline
  def apply(
    audioDeviceId: java.lang.String,
    photoCaptureSource: PhotoCaptureSource,
    streamingCaptureMode: StreamingCaptureMode,
    videoDeviceId: java.lang.String
  ): IMediaCaptureInitializationSettings = {
    val __obj = js.Dynamic.literal(audioDeviceId = audioDeviceId, photoCaptureSource = photoCaptureSource, streamingCaptureMode = streamingCaptureMode, videoDeviceId = videoDeviceId)
  
    __obj.asInstanceOf[IMediaCaptureInitializationSettings]
  }
}

