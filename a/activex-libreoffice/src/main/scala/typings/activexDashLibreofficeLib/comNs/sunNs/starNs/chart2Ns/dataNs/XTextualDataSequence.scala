package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows access to a one-dimensional sequence of strings. */
trait XTextualDataSequence
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieves the data as strings */
  val TextualData: activexDashInteropLib.SafeArray[java.lang.String]
  /** retrieves the data as strings */
  def getTextualData(): activexDashInteropLib.SafeArray[java.lang.String]
}

object XTextualDataSequence {
  @scala.inline
  def apply(
    TextualData: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    getTextualData: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextualDataSequence = {
    val __obj = js.Dynamic.literal(TextualData = TextualData, acquire = acquire, getTextualData = getTextualData, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTextualDataSequence]
  }
}

