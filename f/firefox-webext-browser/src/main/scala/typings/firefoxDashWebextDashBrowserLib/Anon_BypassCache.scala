package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BypassCache extends js.Object {
  /** Whether using any local cache. Default is false. */
  var bypassCache: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_BypassCache {
  @scala.inline
  def apply(bypassCache: js.UndefOr[scala.Boolean] = js.undefined): Anon_BypassCache = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassCache)) __obj.updateDynamic("bypassCache")(bypassCache)
    __obj.asInstanceOf[Anon_BypassCache]
  }
}

