package typings
package atAngularCoreLib.srcSanitizationBypassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedScriptString extends TrustedString

object TrustedScriptString {
  @scala.inline
  def apply(trimLeft: () => java.lang.String, trimRight: () => java.lang.String): TrustedScriptString = {
    val __obj = js.Dynamic.literal(trimLeft = js.Any.fromFunction0(trimLeft), trimRight = js.Any.fromFunction0(trimRight))
  
    __obj.asInstanceOf[TrustedScriptString]
  }
}

