package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpConf extends js.Object {
  var data: js.Any
  var headers: js.Any
  var operation: java.lang.String
}

object HttpConf {
  @scala.inline
  def apply(data: js.Any, headers: js.Any, operation: java.lang.String): HttpConf = {
    val __obj = js.Dynamic.literal(data = data, headers = headers, operation = operation)
  
    __obj.asInstanceOf[HttpConf]
  }
}

