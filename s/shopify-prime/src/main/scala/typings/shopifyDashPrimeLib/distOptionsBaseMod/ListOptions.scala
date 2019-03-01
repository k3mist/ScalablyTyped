package typings
package shopifyDashPrimeLib.distOptionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOptions extends BasicListOptions {
  /**
    * Restricts results to those created after the given id.
    */
  var since_id: js.UndefOr[scala.Double] = js.undefined
}

object ListOptions {
  @scala.inline
  def apply(
    limit: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    since_id: scala.Int | scala.Double = null
  ): ListOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (since_id != null) __obj.updateDynamic("since_id")(since_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptions]
  }
}

