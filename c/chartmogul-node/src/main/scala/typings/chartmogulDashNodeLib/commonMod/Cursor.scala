package typings
package chartmogulDashNodeLib.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursor extends js.Object {
  var current_page: js.UndefOr[scala.Double] = js.undefined
  var has_more: js.UndefOr[scala.Boolean] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var total_pages: js.UndefOr[scala.Double] = js.undefined
}

object Cursor {
  @scala.inline
  def apply(
    current_page: scala.Int | scala.Double = null,
    has_more: js.UndefOr[scala.Boolean] = js.undefined,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    total_pages: scala.Int | scala.Double = null
  ): Cursor = {
    val __obj = js.Dynamic.literal()
    if (current_page != null) __obj.updateDynamic("current_page")(current_page.asInstanceOf[js.Any])
    if (!js.isUndefined(has_more)) __obj.updateDynamic("has_more")(has_more)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (total_pages != null) __obj.updateDynamic("total_pages")(total_pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursor]
  }
}

