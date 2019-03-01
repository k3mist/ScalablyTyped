package typings
package meteorLib.HTTPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPResponse extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.Any
  ] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object HTTPResponse {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    data: js.Any = null,
    headers: /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.Any = null,
    statusCode: scala.Int | scala.Double = null
  ): HTTPResponse = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPResponse]
  }
}

