package typings
package sailsDotIoDotJsLib.sailsDotIoDotJsMod.SailsIOJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWR extends js.Object {
  var body: js.Any
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var headers: Headers
  var statusCode: scala.Double
  def pipe(): stdLib.Error
  def toPOJO(): sailsDotIoDotJsLib.Anon_Body
}

object JWR {
  @scala.inline
  def apply(
    body: js.Any,
    headers: Headers,
    pipe: js.Function0[stdLib.Error],
    statusCode: scala.Double,
    toPOJO: js.Function0[sailsDotIoDotJsLib.Anon_Body],
    toString: js.Function0[java.lang.String],
    error: stdLib.Error = null
  ): JWR = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, pipe = pipe, statusCode = statusCode, toPOJO = toPOJO, toString = toString)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[JWR]
  }
}

