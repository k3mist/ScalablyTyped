package typings
package contentDashDispositionLib.contentDashDispositionMod.contentDispositionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentDisposition extends js.Object {
  var parameters: js.Any
  var `type`: java.lang.String
}

object ContentDisposition {
  @scala.inline
  def apply(parameters: js.Any, `type`: java.lang.String): ContentDisposition = {
    val __obj = js.Dynamic.literal(parameters = parameters, `type` = `type`)
  
    __obj.asInstanceOf[ContentDisposition]
  }
}

