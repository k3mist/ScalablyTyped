package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an object which can be anchored in a text, like instances of {@link TextFrame} or {@link TextField} .
  *
  * If the concrete {@link TextContent} has a textual representation which fades into the surrounding text, then {@link XTextField} is used.
  *
  * If the concrete {@link TextContent} has a "floating" object, like a graphic, {@link com.sun.star.drawing.XShape} is used.
  * @see TextField
  * @see TextTable
  * @see TextFrame
  * @see TextSection
  * @see TextGraphicObject
  * @see TextEmbeddedObject
  */
trait TextContent extends XTextContent {
  /** specifies how the text content is attached to its surrounding {@link Text} . */
  var AnchorType: TextContentAnchorType
  /**
    * contains the anchor type of the text content.
    * @see com.sun.star.text.TextContentAnchorType
    */
  var AnchorTypes: stdLib.SafeArray[TextContentAnchorType]
  /** specifies if the text content is a shape and how the text is wrapped around the shape. */
  var TextWrap: WrapTextMode
}

object TextContent {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: stdLib.SafeArray[TextContentAnchorType],
    TextWrap: WrapTextMode,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    attach: XTextRange => scala.Unit,
    dispose: () => scala.Unit,
    getAnchor: () => XTextRange,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): TextContent = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, TextWrap = TextWrap, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[TextContent]
  }
}

