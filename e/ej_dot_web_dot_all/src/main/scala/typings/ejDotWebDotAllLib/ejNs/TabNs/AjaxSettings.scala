package typings
package ejDotWebDotAllLib.ejNs.TabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSettings extends js.Object {
  /** It specifies, whether to enable or disable asynchronous request.
    * @Default {true}
    */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /** It specifies the page will be cached in the web browser.
    * @Default {false}
    */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /** It specifies the type of data is send in the query string.
    * @Default {html}
    */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /** It specifies the data as an object, will be passed in the query string.
    * @Default {{}}
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** It specifies the type of data that you're expecting back from the response.
    * @Default {html}
    */
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  /** It specifies the HTTP request type.
    * @Default {get}
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AjaxSettings {
  @scala.inline
  def apply(
    async: js.UndefOr[scala.Boolean] = js.undefined,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    contentType: java.lang.String = null,
    data: js.Any = null,
    dataType: java.lang.String = null,
    `type`: java.lang.String = null
  ): AjaxSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AjaxSettings]
  }
}

