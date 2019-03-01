package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XConditionalFormats
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val ConditionalFormats: activexDashInteropLib.SafeArray[XConditionalFormat]
  val Length: scala.Double
  /** adds a conditional format to the existing list returns the id of the inserted conditional format */
  def createByRange(range: XSheetCellRanges): scala.Double
  def getConditionalFormats(): activexDashInteropLib.SafeArray[XConditionalFormat]
  def getLength(): scala.Double
  def removeByID(ID: scala.Double): scala.Unit
}

object XConditionalFormats {
  @scala.inline
  def apply(
    ConditionalFormats: activexDashInteropLib.SafeArray[XConditionalFormat],
    Length: scala.Double,
    acquire: js.Function0[scala.Unit],
    createByRange: js.Function1[XSheetCellRanges, scala.Double],
    getConditionalFormats: js.Function0[activexDashInteropLib.SafeArray[XConditionalFormat]],
    getLength: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByID: js.Function1[scala.Double, scala.Unit]
  ): XConditionalFormats = {
    val __obj = js.Dynamic.literal(ConditionalFormats = ConditionalFormats, Length = Length, acquire = acquire, createByRange = createByRange, getConditionalFormats = getConditionalFormats, getLength = getLength, queryInterface = queryInterface, release = release, removeByID = removeByID)
  
    __obj.asInstanceOf[XConditionalFormats]
  }
}

