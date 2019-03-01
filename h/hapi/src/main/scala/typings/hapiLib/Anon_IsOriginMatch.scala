package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsOriginMatch extends js.Object {
  /**
    * true if the request 'Origin' header matches the configured CORS restrictions. Set to false if no 'Origin' header is found or if it does not match. Note that this is only available after
    * the 'onRequest' extension point as CORS is configured per-route and no routing decisions are made at that point in the request lifecycle.
    */
  var isOriginMatch: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IsOriginMatch {
  @scala.inline
  def apply(isOriginMatch: js.UndefOr[scala.Boolean] = js.undefined): Anon_IsOriginMatch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isOriginMatch)) __obj.updateDynamic("isOriginMatch")(isOriginMatch)
    __obj.asInstanceOf[Anon_IsOriginMatch]
  }
}

