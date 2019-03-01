package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows generic access to all spreadsheet functions. */
trait FunctionAccess
  extends SpreadsheetDocumentSettings
     with XFunctionAccess {
  /**
    * specifies whether the function call is performed as array function call.
    *
    * If set to `TRUE` , the result of the function call will be calculated similar to array formulas in a spreadsheet document. The return value of the
    * function call will usually be a sequence of sequences containing the values of the resulting array. Example: If the function ABS is called for a 3x2
    * cell range, the result will be a 3x2 array containing the absolute values of the numbers contained in the specified cell range.
    *
    * If set to `FALSE` , the result of the function call will be calculated similar to simple cell formulas in a spreadsheet document. The return value of
    * the function call will usually be a single value. Of course, some functions always return an array, for example the MUNIT function.
    *
    * For compatibility with older versions, the default value of this property is `TRUE` .
    * @since OOo 3.3
    */
  var IsArrayFunction: scala.Boolean
}

object FunctionAccess {
  @scala.inline
  def apply(
    CalcAsShown: scala.Boolean,
    CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharLocaleAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharLocaleComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    DefaultTabStop: scala.Double,
    ForbiddenCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters,
    HasDrawPages: scala.Boolean,
    IgnoreCase: scala.Boolean,
    IsAdjustHeightEnabled: scala.Boolean,
    IsArrayFunction: scala.Boolean,
    IsExecuteLinkEnabled: scala.Boolean,
    IsIterationEnabled: scala.Boolean,
    IsLoaded: scala.Boolean,
    IsRecordChangesProtected: scala.Boolean,
    IsUndoEnabled: scala.Boolean,
    IterationCount: scala.Double,
    IterationEpsilon: scala.Double,
    LookUpLabels: scala.Boolean,
    MatchWholeCell: scala.Boolean,
    NullDate: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Date,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RecordChanges: scala.Boolean,
    ReferenceDevice: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XDevice,
    RegularExpressions: scala.Boolean,
    SpellOnline: scala.Boolean,
    StandardDecimals: scala.Double,
    Wildcards: scala.Boolean,
    acquire: js.Function0[scala.Unit],
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
    callFunction: js.Function2[java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], js.Any],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
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
  ): FunctionAccess = {
    val __obj = js.Dynamic.literal(CalcAsShown = CalcAsShown, CharLocale = CharLocale, CharLocaleAsian = CharLocaleAsian, CharLocaleComplex = CharLocaleComplex, DefaultTabStop = DefaultTabStop, ForbiddenCharacters = ForbiddenCharacters, HasDrawPages = HasDrawPages, IgnoreCase = IgnoreCase, IsAdjustHeightEnabled = IsAdjustHeightEnabled, IsArrayFunction = IsArrayFunction, IsExecuteLinkEnabled = IsExecuteLinkEnabled, IsIterationEnabled = IsIterationEnabled, IsLoaded = IsLoaded, IsRecordChangesProtected = IsRecordChangesProtected, IsUndoEnabled = IsUndoEnabled, IterationCount = IterationCount, IterationEpsilon = IterationEpsilon, LookUpLabels = LookUpLabels, MatchWholeCell = MatchWholeCell, NullDate = NullDate, PropertySetInfo = PropertySetInfo, RecordChanges = RecordChanges, ReferenceDevice = ReferenceDevice, RegularExpressions = RegularExpressions, SpellOnline = SpellOnline, StandardDecimals = StandardDecimals, Wildcards = Wildcards, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, callFunction = callFunction, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[FunctionAccess]
  }
}

