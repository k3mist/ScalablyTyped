package typings
package vscodeDashJsonrpcLib.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseMessage extends Message {
  /**
    * The error object in case a request fails.
    */
  var error: js.UndefOr[ResponseErrorLiteral[_]] = js.undefined
  /**
    * The request id.
    */
  var id: scala.Double | java.lang.String | scala.Null
  /**
    * The result of a request. This can be omitted in
    * the case of an error.
    */
  var result: js.UndefOr[js.Any] = js.undefined
}

object ResponseMessage {
  @scala.inline
  def apply(
    jsonrpc: java.lang.String,
    error: ResponseErrorLiteral[_] = null,
    id: scala.Double | java.lang.String = null,
    result: js.Any = null
  ): ResponseMessage = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc)
    if (error != null) __obj.updateDynamic("error")(error)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[ResponseMessage]
  }
}

