package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSchemaError extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
}

object SimpleSchemaError {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String): SimpleSchemaError = {
    val __obj = js.Dynamic.literal(name = name, `type` = `type`)
  
    __obj.asInstanceOf[SimpleSchemaError]
  }
}

