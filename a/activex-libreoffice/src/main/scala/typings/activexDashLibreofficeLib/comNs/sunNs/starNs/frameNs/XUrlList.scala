package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XUrlList
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  var List: activexDashInteropLib.SafeArray[java.lang.String]
}

object XUrlList {
  @scala.inline
  def apply(
    List: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XUrlList = {
    val __obj = js.Dynamic.literal(List = List, acquire = acquire, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XUrlList]
  }
}

