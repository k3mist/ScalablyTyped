package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a singe cell within a text table.
  * @see com.sun.star.text.TextTable
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellProperties because var conflicts: BottomBorder, LeftBorder, NumberFormat, RightBorder, TopBorder, UserDefinedAttributes. Inlined AsianVerticalMode, BottomBorder2, CellBackColor, CellInteropGrabBag, CellProtection, CellStyle, DiagonalBLTR, DiagonalBLTR2, DiagonalTLBR, DiagonalTLBR2, HoriJustify, IsCellBackgroundTransparent, IsTextWrapped, LeftBorder2, Orientation, ParaIndent, RightBorder2, RotateAngle, RotateReference, ShadowFormat, ShrinkToFit, TableBorder, TableBorder2, TopBorder2, VertJustify */ trait Cell
  extends CellProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell
     with XText {
  /**
    * selects Asian character orientation in vertical orientation.
    *
    * If the {@link CellProperties.Orientation} property is CellOrientation::STACKED, in Asian mode only Asian characters are printed in horizontal
    * orientation instead of all characters. For other values of {@link CellProperties.Orientation} , this value is not used.
    */
  var AsianVerticalMode: scala.Boolean
  /**
    * contains a description of the bottom border line of each cell. Preferred over {@link BorderLine}{@link BottomBorder} .
    * @since LibreOffice 3.6
    */
  var BottomBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /** contains the cell background color. */
  var CellBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * Grab bag of cell properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.3  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var CellInteropGrabBag: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * contains a description of the cell protection.
    *
    * {@link Cell} protection is active only if the sheet is protected.
    */
  var CellProtection: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.CellProtection
  /** contains the name of the style of the cell. */
  var CellStyle: java.lang.String
  /** contains a description of the bottom left to top right diagonal line of each cell. */
  var DiagonalBLTR: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /**
    * contains a description of the bottom left to top right diagonal line of each cell. Preferred over {@link BorderLine}{@link DiagonalBLTR} .
    * @since LibreOffice 3.6
    */
  var DiagonalBLTR2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /** contains a description of the top left to bottom right diagonal line of each cell. */
  var DiagonalTLBR: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /**
    * contains a description of the top left to bottom right diagonal line of each cell. Preferred over {@link BorderLine}{@link DiagonalTLBR} .
    * @since LibreOffice 3.6
    */
  var DiagonalTLBR2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /** contains the horizontal alignment of the cell contents. */
  var HoriJustify: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify
  /**
    * is `TRUE` , if the cell background is transparent.
    *
    * In this case the {@link CellProperties.CellBackColor} value is not used.
    */
  var IsCellBackgroundTransparent: scala.Boolean
  /** is `TRUE` , if text in the cells will be wrapped automatically at the right border. */
  var IsTextWrapped: scala.Boolean
  /**
    * contains a description of the left border line of each cell. Preferred over {@link BorderLine}{@link LeftBorder} .
    * @since LibreOffice 3.6
    */
  var LeftBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /**
    * contains the orientation of the cell contents.
    *
    * If the {@link CellProperties.RotateAngle} property is non-zero, this value is not used.
    */
  var Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellOrientation
  /** defines the indentation of the cell contents (in 1/100 mm). */
  var ParaIndent: scala.Double
  /**
    * contains a description of the right border line of each cell. Preferred over {@link BorderLine}{@link RightBorder} .
    * @since LibreOffice 3.6
    */
  var RightBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /** defines how much the content of cells is rotated (in 1/100 degrees). */
  var RotateAngle: scala.Double
  /**
    * defines at which edge rotated cells are aligned.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var RotateReference: scala.Double
  /** contains a description of the shadow. */
  var ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat
  /** is `TRUE` , if the cell content will be shrunk to fit in the cell. */
  var ShrinkToFit: scala.Boolean
  /**
    * contains a description of the cell or cell range border.
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    */
  var TableBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder
  /**
    * contains a description of the cell or cell range border. Preferred over {@link TableBorder}{@link TableBorder} .
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    * @since LibreOffice 3.6
    */
  var TableBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder2
  /**
    * contains a description of the top border line of each cell. Preferred over {@link BorderLine}{@link TopBorder} .
    * @since LibreOffice 3.6
    */
  var TopBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /**
    * contains the vertical alignment of the cell contents.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var VertJustify: scala.Double
}

object Cell {
  @scala.inline
  def apply(
    AsianVerticalMode: scala.Boolean,
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    BottomBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    BottomBorderDistance: scala.Double,
    CellBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CellInteropGrabBag: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    CellName: java.lang.String,
    CellProtection: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.CellProtection,
    CellStyle: java.lang.String,
    DiagonalBLTR: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    DiagonalBLTR2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    DiagonalTLBR: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    DiagonalTLBR2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    End: XTextRange,
    Error: scala.Double,
    Formula: java.lang.String,
    HoriJustify: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify,
    IsCellBackgroundTransparent: scala.Boolean,
    IsProtected: scala.Boolean,
    IsTextWrapped: scala.Boolean,
    LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    LeftBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    LeftBorderDistance: scala.Double,
    NumberFormat: scala.Double,
    Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellOrientation,
    ParaIndent: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    RightBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    RightBorderDistance: scala.Double,
    RotateAngle: scala.Double,
    RotateReference: scala.Double,
    ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    ShrinkToFit: scala.Boolean,
    Start: XTextRange,
    String: java.lang.String,
    TableBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder,
    TableBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder2,
    TextSection: XTextSection,
    TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    TopBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    TopBorderDistance: scala.Double,
    Type: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellContentType,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Value: scala.Double,
    VertJustify: scala.Double,
    VertOrient: scala.Double,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    getEnd: () => XTextRange,
    getError: () => scala.Double,
    getFormula: () => java.lang.String,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getStart: () => XTextRange,
    getString: () => java.lang.String,
    getText: () => XText,
    getType: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellContentType,
    getValue: () => scala.Double,
    insertControlCharacter: (XTextRange, scala.Double, scala.Boolean) => scala.Unit,
    insertString: (XTextRange, java.lang.String, scala.Boolean) => scala.Unit,
    insertTextContent: (XTextRange, XTextContent, scala.Boolean) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeTextContent: XTextContent => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setFormula: java.lang.String => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setString: java.lang.String => scala.Unit,
    setValue: scala.Double => scala.Unit
  ): Cell = {
    val __obj = js.Dynamic.literal(AsianVerticalMode = AsianVerticalMode, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BottomBorder = BottomBorder, BottomBorder2 = BottomBorder2, BottomBorderDistance = BottomBorderDistance, CellBackColor = CellBackColor, CellInteropGrabBag = CellInteropGrabBag, CellName = CellName, CellProtection = CellProtection, CellStyle = CellStyle, DiagonalBLTR = DiagonalBLTR, DiagonalBLTR2 = DiagonalBLTR2, DiagonalTLBR = DiagonalTLBR, DiagonalTLBR2 = DiagonalTLBR2, End = End, Error = Error, Formula = Formula, HoriJustify = HoriJustify, IsCellBackgroundTransparent = IsCellBackgroundTransparent, IsProtected = IsProtected, IsTextWrapped = IsTextWrapped, LeftBorder = LeftBorder, LeftBorder2 = LeftBorder2, LeftBorderDistance = LeftBorderDistance, NumberFormat = NumberFormat, Orientation = Orientation, ParaIndent = ParaIndent, PropertySetInfo = PropertySetInfo, RightBorder = RightBorder, RightBorder2 = RightBorder2, RightBorderDistance = RightBorderDistance, RotateAngle = RotateAngle, RotateReference = RotateReference, ShadowFormat = ShadowFormat, ShrinkToFit = ShrinkToFit, Start = Start, String = String, TableBorder = TableBorder, TableBorder2 = TableBorder2, TextSection = TextSection, TopBorder = TopBorder, TopBorder2 = TopBorder2, TopBorderDistance = TopBorderDistance, Type = Type, UserDefinedAttributes = UserDefinedAttributes, Value = Value, VertJustify = VertJustify, VertOrient = VertOrient, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = js.Any.fromFunction0(getEnd), getError = js.Any.fromFunction0(getError), getFormula = js.Any.fromFunction0(getFormula), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTextContent = js.Any.fromFunction1(removeTextContent), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFormula = js.Any.fromFunction1(setFormula), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setString = js.Any.fromFunction1(setString), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[Cell]
  }
}

