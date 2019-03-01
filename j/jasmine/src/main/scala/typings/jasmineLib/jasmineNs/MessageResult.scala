package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageResult extends Result {
  var trace: Trace
  var values: js.Any
}

object MessageResult {
  @scala.inline
  def apply(trace: Trace, `type`: java.lang.String, values: js.Any): MessageResult = {
    val __obj = js.Dynamic.literal(trace = trace, `type` = `type`, values = values)
  
    __obj.asInstanceOf[MessageResult]
  }
}

