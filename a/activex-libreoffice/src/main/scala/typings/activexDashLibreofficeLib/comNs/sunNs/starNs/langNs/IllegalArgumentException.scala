package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This exception is thrown to indicate that a method has passed an illegal or inappropriate argument. */
trait IllegalArgumentException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /**
    * identifies the position of the illegal argument.
    *
    * This field is -1 if the position is not known.
    */
  var ArgumentPosition: scala.Double
}

object IllegalArgumentException {
  @scala.inline
  def apply(
    ArgumentPosition: scala.Double,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String
  ): IllegalArgumentException = {
    val __obj = js.Dynamic.literal(ArgumentPosition = ArgumentPosition, Context = Context, Message = Message)
  
    __obj.asInstanceOf[IllegalArgumentException]
  }
}

