package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTarget
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def addDrawElement(): scala.Unit
}

object XTarget {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addDrawElement: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTarget = {
    val __obj = js.Dynamic.literal(acquire = acquire, addDrawElement = addDrawElement, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTarget]
  }
}

