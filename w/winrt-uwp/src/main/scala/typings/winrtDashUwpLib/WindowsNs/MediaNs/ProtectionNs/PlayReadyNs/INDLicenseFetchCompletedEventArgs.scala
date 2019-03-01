package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets custom data from a PlayReady-ND license fetch operation. This custom data is an argument from a PlayReady-ND LicenseFetchCompleted event. */
trait INDLicenseFetchCompletedEventArgs extends js.Object {
  /** Gets custom data from a license fetch response. */
  var responseCustomData: INDCustomData
}

object INDLicenseFetchCompletedEventArgs {
  @scala.inline
  def apply(responseCustomData: INDCustomData): INDLicenseFetchCompletedEventArgs = {
    val __obj = js.Dynamic.literal(responseCustomData = responseCustomData)
  
    __obj.asInstanceOf[INDLicenseFetchCompletedEventArgs]
  }
}

