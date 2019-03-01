package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle in case package is broken.
  * @since OOo 1.1.2
  */
trait BrokenPackageRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The name of the document that is broken */
  var aName: java.lang.String
}

object BrokenPackageRequest {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    aName: java.lang.String
  ): BrokenPackageRequest = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, aName = aName)
  
    __obj.asInstanceOf[BrokenPackageRequest]
  }
}

