package typings
package backboneDashFetchDashCacheLib.backboneDashFetchDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCacheOptions extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object GetCacheOptions {
  @scala.inline
  def apply(data: js.Any = null, url: java.lang.String = null): GetCacheOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GetCacheOptions]
  }
}

