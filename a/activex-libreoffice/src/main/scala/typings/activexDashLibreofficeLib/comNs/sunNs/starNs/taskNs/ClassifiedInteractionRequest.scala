package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A classified interaction request. */
trait ClassifiedInteractionRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The classification of the request. */
  var Classification: InteractionClassification
}

object ClassifiedInteractionRequest {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String
  ): ClassifiedInteractionRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message)
  
    __obj.asInstanceOf[ClassifiedInteractionRequest]
  }
}

