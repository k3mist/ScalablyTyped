package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: ERRORS
  var file: FileObj
  var message: java.lang.String
}

object Anon_Error {
  @scala.inline
  def apply(error: ERRORS, file: FileObj, message: java.lang.String): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, file = file, message = message)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

