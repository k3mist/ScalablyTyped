package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the result, in the form of a response message, from the PlayReady-ND messenger. */
trait INDSendResult extends js.Object {
  /** Gets the response message from a messenger. */
  var response: scala.Double
}

object INDSendResult {
  @scala.inline
  def apply(response: scala.Double): INDSendResult = {
    val __obj = js.Dynamic.literal(response = response)
  
    __obj.asInstanceOf[INDSendResult]
  }
}

