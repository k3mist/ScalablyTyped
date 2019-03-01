package typings
package forgeDashApisLib.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiError extends js.Object {
  var statusCode: scala.Double
  var statusMessage: java.lang.String
}

object ApiError {
  @scala.inline
  def apply(statusCode: scala.Double, statusMessage: java.lang.String): ApiError = {
    val __obj = js.Dynamic.literal(statusCode = statusCode, statusMessage = statusMessage)
  
    __obj.asInstanceOf[ApiError]
  }
}

