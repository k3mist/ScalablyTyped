package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaDeviceStatics extends js.Object {
  var ondefaultaudiocapturedevicechanged: js.Any
  var ondefaultaudiorenderdevicechanged: js.Any
  def getAudioCaptureSelector(): java.lang.String
  def getAudioRenderSelector(): java.lang.String
  def getDefaultAudioCaptureId(role: AudioDeviceRole): java.lang.String
  def getDefaultAudioRenderId(role: AudioDeviceRole): java.lang.String
  def getVideoCaptureSelector(): java.lang.String
}

object IMediaDeviceStatics {
  @scala.inline
  def apply(
    getAudioCaptureSelector: js.Function0[java.lang.String],
    getAudioRenderSelector: js.Function0[java.lang.String],
    getDefaultAudioCaptureId: js.Function1[AudioDeviceRole, java.lang.String],
    getDefaultAudioRenderId: js.Function1[AudioDeviceRole, java.lang.String],
    getVideoCaptureSelector: js.Function0[java.lang.String],
    ondefaultaudiocapturedevicechanged: js.Any,
    ondefaultaudiorenderdevicechanged: js.Any
  ): IMediaDeviceStatics = {
    val __obj = js.Dynamic.literal(getAudioCaptureSelector = getAudioCaptureSelector, getAudioRenderSelector = getAudioRenderSelector, getDefaultAudioCaptureId = getDefaultAudioCaptureId, getDefaultAudioRenderId = getDefaultAudioRenderId, getVideoCaptureSelector = getVideoCaptureSelector, ondefaultaudiocapturedevicechanged = ondefaultaudiocapturedevicechanged, ondefaultaudiorenderdevicechanged = ondefaultaudiorenderdevicechanged)
  
    __obj.asInstanceOf[IMediaDeviceStatics]
  }
}

