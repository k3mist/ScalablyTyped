package typings
package atAngularCoreLib.srcSanitizationBypassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedHtmlString extends TrustedString

object TrustedHtmlString {
  @scala.inline
  def apply(trimLeft: () => java.lang.String, trimRight: () => java.lang.String): TrustedHtmlString = {
    val __obj = js.Dynamic.literal(trimLeft = js.Any.fromFunction0(trimLeft), trimRight = js.Any.fromFunction0(trimRight))
  
    __obj.asInstanceOf[TrustedHtmlString]
  }
}

