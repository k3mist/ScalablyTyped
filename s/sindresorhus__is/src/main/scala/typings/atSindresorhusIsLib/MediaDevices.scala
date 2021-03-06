package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaDevices extends EventTarget {
  var ondevicechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def enumerateDevices(): Promise[Array[MediaDeviceInfo]] = js.native
  def getSupportedConstraints(): MediaTrackSupportedConstraints = js.native
  def getUserMedia(constraints: MediaStreamConstraints): Promise[MediaStream] = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("MediaDevices")
@js.native
object MediaDevices
  extends org.scalablytyped.runtime.Instantiable0[MediaDevices]

