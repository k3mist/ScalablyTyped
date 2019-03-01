package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAccessibleExtendedAttributes
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val ExtendedAttributes: js.Any
  def getExtendedAttributes(): js.Any
}

object XAccessibleExtendedAttributes {
  @scala.inline
  def apply(
    ExtendedAttributes: js.Any,
    acquire: js.Function0[scala.Unit],
    getExtendedAttributes: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAccessibleExtendedAttributes = {
    val __obj = js.Dynamic.literal(ExtendedAttributes = ExtendedAttributes, acquire = acquire, getExtendedAttributes = getExtendedAttributes, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAccessibleExtendedAttributes]
  }
}

