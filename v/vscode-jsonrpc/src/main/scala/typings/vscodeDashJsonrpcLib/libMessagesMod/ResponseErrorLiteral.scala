package typings
package vscodeDashJsonrpcLib.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseErrorLiteral[D] extends js.Object {
  /**
    * A number indicating the error type that occured.
    */
  var code: scala.Double
  /**
    * A Primitive or Structured value that contains additional
    * information about the error. Can be omitted.
    */
  var data: js.UndefOr[D] = js.undefined
  /**
    * A string providing a short decription of the error.
    */
  var message: java.lang.String
}

object ResponseErrorLiteral {
  @scala.inline
  def apply[D](code: scala.Double, message: java.lang.String, data: D = null): ResponseErrorLiteral[D] = {
    val __obj = js.Dynamic.literal(code = code, message = message)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseErrorLiteral[D]]
  }
}

