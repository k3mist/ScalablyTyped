package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var code: js.Any
   // TODO: Find out if String or number
  var message: java.lang.String
}

object Error {
  @scala.inline
  def apply(code: js.Any, message: java.lang.String): Error = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[Error]
  }
}

