package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a single addressable cell in a spreadsheet document. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.Cell because var conflicts: String. Inlined  */ trait SheetCell
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Text
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex
     with SheetRangesQuery
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XActionLockable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XReplaceable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XIndent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XColumnRowRange
     with XCellAddressable
     with XSheetAnnotationAnchor
     with activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextFieldsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XTolerantMultiPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster {
  /** Returns the absolute address of the range as string, e.g. "$Sheet1.$B$2". */
  var AbsoluteName: java.lang.String
  /**
    * contains the conditional formatting settings for this cell.
    *
    * After a conditional format has been changed it has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableConditionalFormat
    */
  var ConditionalFormat: XSheetConditionalEntries
  /**
    * contains the conditional formatting settings for this cell, using localized formulas.
    *
    * After a conditional format has been changed it has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableConditionalFormat
    */
  var ConditionalFormatLocal: XSheetConditionalEntries
  /**
    * contains the formula string with localized function names.
    *
    * This property can also be used to set a new localized formula.
    */
  var FormulaLocal: java.lang.String
  /**
    * contains the result type of a formula.
    * @see com.sun.star.sheet.FormulaResult
    */
  var FormulaResultType: scala.Double
  /**
    * contains the position of this cell in the sheet (in 1/100 mm).
    *
    * This property contains the absolute position in the whole sheet, not the position in the visible area.
    */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** contains the size of this cell (in 1/100 mm). */
  var Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * contains the data validation settings for this cell.
    *
    * After the data validation settings have been changed the validation has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableValidation
    */
  var Validation: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * contains the data validation settings for this cell, using localized formulas.
    *
    * After the data validation settings have been changed the validation has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableValidation
    */
  var ValidationLocal: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object SheetCell {
  @scala.inline
  def apply(
    AbsoluteName: java.lang.String,
    CharacterProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties = null,
    CharacterPropertiesAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian = null,
    CharacterPropertiesComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex = null,
    ConditionalFormat: XSheetConditionalEntries,
    ConditionalFormatLocal: XSheetConditionalEntries,
    FormulaLocal: java.lang.String,
    FormulaResultType: scala.Double,
    ParagraphProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties = null,
    ParagraphPropertiesAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian = null,
    ParagraphPropertiesComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex = null,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    Text: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.Text = null,
    Validation: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ValidationLocal: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XActionLockable: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XActionLockable = null,
    XCellAddressable: XCellAddressable = null,
    XColumnRowRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XColumnRowRange = null,
    XIndent: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XIndent = null,
    XModifyBroadcaster: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster = null,
    XReplaceable: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XReplaceable = null,
    XSheetAnnotationAnchor: XSheetAnnotationAnchor = null,
    XTextFieldsSupplier: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextFieldsSupplier = null,
    XTolerantMultiPropertySet: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XTolerantMultiPropertySet = null,
    Cell: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.Cell = null,
    SheetRangesQuery: SheetRangesQuery = null
  ): SheetCell = {
    val __obj = js.Dynamic.literal(AbsoluteName = AbsoluteName, ConditionalFormat = ConditionalFormat, ConditionalFormatLocal = ConditionalFormatLocal, FormulaLocal = FormulaLocal, FormulaResultType = FormulaResultType, Position = Position, Size = Size, Validation = Validation, ValidationLocal = ValidationLocal)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterPropertiesAsian)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterPropertiesComplex)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphPropertiesAsian)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphPropertiesComplex)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Text)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XActionLockable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XCellAddressable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XColumnRowRange)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XIndent)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XModifyBroadcaster)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XReplaceable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSheetAnnotationAnchor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XTextFieldsSupplier)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XTolerantMultiPropertySet)
    js.Dynamic.global.Object.assign(__obj, Cell)
    js.Dynamic.global.Object.assign(__obj, SheetRangesQuery)
    __obj.asInstanceOf[SheetCell]
  }
}

