package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** a scanner context is an identifier for a specific scanner device */
trait ScannerContext extends js.Object {
  /** InternalData contains service private data and must not be changed */
  var InternalData: scala.Double
  /** ScannerName contains a user readable identification */
  var ScannerName: java.lang.String
}

object ScannerContext {
  @scala.inline
  def apply(InternalData: scala.Double, ScannerName: java.lang.String): ScannerContext = {
    val __obj = js.Dynamic.literal(InternalData = InternalData, ScannerName = ScannerName)
  
    __obj.asInstanceOf[ScannerContext]
  }
}

