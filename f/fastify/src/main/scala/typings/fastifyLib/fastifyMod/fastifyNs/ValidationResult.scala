package typings
package fastifyLib.fastifyMod.fastifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResult extends js.Object {
  var dataPath: java.lang.String
  var keyword: java.lang.String
  var message: java.lang.String
  var params: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var schemaPath: java.lang.String
}

object ValidationResult {
  @scala.inline
  def apply(
    dataPath: java.lang.String,
    keyword: java.lang.String,
    message: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    schemaPath: java.lang.String
  ): ValidationResult = {
    val __obj = js.Dynamic.literal(dataPath = dataPath, keyword = keyword, message = message, params = params, schemaPath = schemaPath)
  
    __obj.asInstanceOf[ValidationResult]
  }
}

