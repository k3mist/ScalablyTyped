package typings
package winrtLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIDeviceActivatedEventArgs")
@js.native
class WebUIDeviceActivatedEventArgs ()
  extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.IDeviceActivatedEventArgs
     with IActivatedEventArgsDeferral {
  /* CompleteClass */
  override var activatedOperation: ActivatedOperation = js.native
  /* CompleteClass */
  override var deviceInformationId: java.lang.String = js.native
  /* CompleteClass */
  override var kind: winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
  /* CompleteClass */
  override var verb: java.lang.String = js.native
}

