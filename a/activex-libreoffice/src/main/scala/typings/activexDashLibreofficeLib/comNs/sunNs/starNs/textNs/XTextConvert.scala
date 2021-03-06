package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows converting selections of text to frames or tables. */
trait XTextConvert
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * converts the paragraphs marked in TableRanges into a table.
    * @param TableRanges contains the {@link TextRange} interfaces of the paragraphs, cells and rows of the table. The inner sequence contains the start and e
    * @param CellProperties contains the properties of each cell.
    * @param RowProperties contains the properties of each table row.
    * @param TableProperties contains the properties of the table.
    * @returns the created table.
    */
  def convertToTable(
    TableRanges: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.sequence[XTextRange]]
    ],
    CellProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues]
    ],
    RowProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues],
    TableProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): XTextTable
  /**
    * moves the paragraphs from Start to End into a text frame.
    * @param Start start position of frame content
    * @param End end position of frame content
    * @param FrameProperties contains the properties of the to-be-created text frame
    * @returns the newly created text frame
    */
  def convertToTextFrame(
    Start: XTextRange,
    End: XTextRange,
    FrameProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): XTextContent
}

object XTextConvert {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    convertToTable: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.sequence[XTextRange]]
    ], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues]
    ], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues], activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues) => XTextTable,
    convertToTextFrame: (XTextRange, XTextRange, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues) => XTextContent,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTextConvert = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertToTable = js.Any.fromFunction4(convertToTable), convertToTextFrame = js.Any.fromFunction3(convertToTextFrame), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextConvert]
  }
}

