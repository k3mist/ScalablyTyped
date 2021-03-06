package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator
  extends NavigatorID
     with NavigatorOnLine
     with NavigatorContentUtils
     with NavigatorStorageUtils
     with MSNavigatorDoNotTrack
     with MSFileSaver
     with NavigatorBeacon
     with NavigatorConcurrentHardware
     with NavigatorUserMedia
     with NavigatorLanguage
     with NavigatorStorage
     with NavigatorAutomationInformation {
  val activeVRDisplays: ReadonlyArray[VRDisplay] = js.native
  val authentication: WebAuthentication = js.native
  val cookieEnabled: scala.Boolean = js.native
  val doNotTrack: java.lang.String | scala.Null = js.native
  var gamepadInputEmulation: GamepadInputEmulationType = js.native
  val geolocation: Geolocation = js.native
  val maxTouchPoints: scala.Double = js.native
  val mimeTypes: MimeTypeArray = js.native
  val msManipulationViewsEnabled: scala.Boolean = js.native
  val msMaxTouchPoints: scala.Double = js.native
  val msPointerEnabled: scala.Boolean = js.native
  val plugins: PluginArray = js.native
  val pointerEnabled: scala.Boolean = js.native
  val serviceWorker: ServiceWorkerContainer = js.native
  def getGamepads(): Array[Gamepad | scala.Null] = js.native
  def getVRDisplays(): Promise[Array[VRDisplay]] = js.native
  def javaEnabled(): scala.Boolean = js.native
  def msLaunchUri(uri: java.lang.String): scala.Unit = js.native
  def msLaunchUri(uri: java.lang.String, successCallback: MSLaunchUriCallback): scala.Unit = js.native
  def msLaunchUri(
    uri: java.lang.String,
    successCallback: MSLaunchUriCallback,
    noHandlerCallback: MSLaunchUriCallback
  ): scala.Unit = js.native
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: Array[MediaKeySystemConfiguration]): Promise[MediaKeySystemAccess] = js.native
  def vibrate(pattern: Array[scala.Double]): scala.Boolean = js.native
  def vibrate(pattern: scala.Double): scala.Boolean = js.native
}

@JSGlobal("Navigator")
@js.native
object Navigator
  extends org.scalablytyped.runtime.Instantiable0[Navigator]

