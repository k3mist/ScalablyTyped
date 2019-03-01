package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the base interface for all text fields.
  *
  * A text field is embedded in text and expands to a sequence of characters.
  * @see TextField
  */
trait XTextField extends XTextContent {
  /**
    * @param bShowCommand if `TRUE` the command of the field will be returned
    * @returns the display string of the text field either as the command of the field or as the output string.
    */
  def getPresentation(bShowCommand: scala.Boolean): java.lang.String
}

object XTextField {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getPresentation: js.Function1[scala.Boolean, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): XTextField = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, acquire = acquire, addEventListener = addEventListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getPresentation = getPresentation, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[XTextField]
  }
}

