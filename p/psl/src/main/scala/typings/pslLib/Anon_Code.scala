package typings
package pslLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: pslLib.pslLibStrings.DOMAIN_TOO_SHORT | pslLib.pslLibStrings.DOMAIN_TOO_LONG | pslLib.pslLibStrings.LABEL_STARTS_WITH_DASH | pslLib.pslLibStrings.LABEL_ENDS_WITH_DASH | pslLib.pslLibStrings.LABEL_TOO_LONG | pslLib.pslLibStrings.LABEL_TOO_SHORT | pslLib.pslLibStrings.LABEL_INVALID_CHARS
  var message: java.lang.String
}

object Anon_Code {
  @scala.inline
  def apply(
    code: pslLib.pslLibStrings.DOMAIN_TOO_SHORT | pslLib.pslLibStrings.DOMAIN_TOO_LONG | pslLib.pslLibStrings.LABEL_STARTS_WITH_DASH | pslLib.pslLibStrings.LABEL_ENDS_WITH_DASH | pslLib.pslLibStrings.LABEL_TOO_LONG | pslLib.pslLibStrings.LABEL_TOO_SHORT | pslLib.pslLibStrings.LABEL_INVALID_CHARS,
    message: java.lang.String
  ): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message)
  
    __obj.asInstanceOf[Anon_Code]
  }
}

