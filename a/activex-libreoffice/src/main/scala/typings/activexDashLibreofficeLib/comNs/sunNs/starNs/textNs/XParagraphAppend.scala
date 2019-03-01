package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows inserting and appending paragraphs. */
trait XParagraphAppend
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * appends a new and empty paragraph at the end of the text.
    *
    * The properties are applied to the last paragraph before the new paragraph is inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    */
  def finishParagraph(
    CharacterAndParagraphProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): XTextRange
  /**
    * inserts a new and empty paragraph to the text at a given position.
    *
    * The properties are applied to the last paragraph before the new paragraph is inserted.
    * @param CharacterAndParagraphProperties can contain all the properties defined by the service {@link Paragraph} .
    * @param TextRange specifies the position of the insertion.
    * @since LibreOffice 4.0
    */
  def finishParagraphInsert(
    CharacterAndParagraphProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues,
    TextRange: XTextRange
  ): XTextRange
}

object XParagraphAppend {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    finishParagraph: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, XTextRange],
    finishParagraphInsert: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextRange, 
      XTextRange
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XParagraphAppend = {
    val __obj = js.Dynamic.literal(acquire = acquire, finishParagraph = finishParagraph, finishParagraphInsert = finishParagraphInsert, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XParagraphAppend]
  }
}

