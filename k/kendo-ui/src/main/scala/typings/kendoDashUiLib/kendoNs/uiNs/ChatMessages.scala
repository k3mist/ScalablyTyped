package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatMessages extends js.Object {
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
}

object ChatMessages {
  @scala.inline
  def apply(placeholder: java.lang.String = null): ChatMessages = {
    val __obj = js.Dynamic.literal()
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[ChatMessages]
  }
}

