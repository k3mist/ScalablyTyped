package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.metaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** identifies a {@link XFormulaParser} which allows to retrieve the meta data of all supported functions. */
trait XFormulaParser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XFormulaParser
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** return the mapper for op codes. */
  var FormulaOpCodeMapper: activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XFormulaOpCodeMapper
  /**
    * The complete mapping of Names to OpCodes.
    *
    * Names and symbols not defined here lead to a parser/print error.
    */
  var OpCodeMap: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaOpCodeMapEntry]
}

object XFormulaParser {
  @scala.inline
  def apply(
    FormulaOpCodeMapper: activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XFormulaOpCodeMapper,
    OpCodeMap: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaOpCodeMapEntry],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    parseFormula: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaToken]
    ],
    printFormula: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FormulaToken], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, 
      java.lang.String
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XFormulaParser = {
    val __obj = js.Dynamic.literal(FormulaOpCodeMapper = FormulaOpCodeMapper, OpCodeMap = OpCodeMap, PropertySetInfo = PropertySetInfo, acquire = acquire, addEventListener = addEventListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, dispose = dispose, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, parseFormula = parseFormula, printFormula = printFormula, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[XFormulaParser]
  }
}

