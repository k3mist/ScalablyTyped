package typings
package apolloDashCacheDashControlLib.apolloDashCacheDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheHint extends js.Object {
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var scope: js.UndefOr[CacheScope] = js.undefined
}

object CacheHint {
  @scala.inline
  def apply(maxAge: scala.Int | scala.Double = null, scope: CacheScope = null): CacheHint = {
    val __obj = js.Dynamic.literal()
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[CacheHint]
  }
}

