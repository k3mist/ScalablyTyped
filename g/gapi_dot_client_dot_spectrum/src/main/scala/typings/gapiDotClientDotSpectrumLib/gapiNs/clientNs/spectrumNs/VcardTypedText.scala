package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VcardTypedText extends js.Object {
  /** The text string associated with this item. For example, for an org field: ACME, inc. For an email field: smith@example.com. */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object VcardTypedText {
  @scala.inline
  def apply(text: java.lang.String = null): VcardTypedText = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[VcardTypedText]
  }
}

