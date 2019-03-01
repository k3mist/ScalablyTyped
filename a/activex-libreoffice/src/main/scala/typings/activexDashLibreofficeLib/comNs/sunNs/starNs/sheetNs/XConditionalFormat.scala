package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XConditionalFormat
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * Creates a new conditional format entry and insert its at the position.
    * @param Type a com.sun.star.sheet.ConditionFormatEntryType specifying the type of the new entry
    * @param Position the position in the conditional format
    */
  def createEntry(Type: scala.Double, Position: scala.Double): scala.Unit
  def removeByIndex(Index: scala.Double): scala.Unit
}

object XConditionalFormat {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    createEntry: js.Function2[scala.Double, scala.Double, scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit]
  ): XConditionalFormat = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, createEntry = createEntry, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex)
  
    __obj.asInstanceOf[XConditionalFormat]
  }
}

