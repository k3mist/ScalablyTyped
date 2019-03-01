package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataHeadersOverrideMimeTypeResponseType extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var overrideMimeType: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DataHeadersOverrideMimeTypeResponseType {
  @scala.inline
  def apply(
    data: js.Any = null,
    headers: js.Any = null,
    overrideMimeType: java.lang.String = null,
    responseType: java.lang.String = null
  ): Anon_DataHeadersOverrideMimeTypeResponseType = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    __obj.asInstanceOf[Anon_DataHeadersOverrideMimeTypeResponseType]
  }
}

