package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this request is used in case a content can't keep files from overwriting
  *
  * It is supported by {@link InteractionHandler} service, and can be used in case a content can not keep files from overwriting and user specifies to do
  * so. Continuations for using with the mentioned service are Abort and Approve.
  * @since OOo 1.1.2
  */
trait UnsupportedOverwriteRequest extends ClassifiedInteractionRequest {
  /** the name of the target that might be overwritten, can be empty. */
  var Name: java.lang.String
}

object UnsupportedOverwriteRequest {
  @scala.inline
  def apply(
    Classification: InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    Name: java.lang.String
  ): UnsupportedOverwriteRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification, Context = Context, Message = Message, Name = Name)
  
    __obj.asInstanceOf[UnsupportedOverwriteRequest]
  }
}

