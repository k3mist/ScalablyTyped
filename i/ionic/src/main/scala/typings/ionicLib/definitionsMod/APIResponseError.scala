package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIResponseError extends APIResponse {
  var error: APIResponseErrorError
  var meta: APIResponseMeta
}

object APIResponseError {
  @scala.inline
  def apply(error: APIResponseErrorError, meta: APIResponseMeta): APIResponseError = {
    val __obj = js.Dynamic.literal(error = error, meta = meta)
  
    __obj.asInstanceOf[APIResponseError]
  }
}

