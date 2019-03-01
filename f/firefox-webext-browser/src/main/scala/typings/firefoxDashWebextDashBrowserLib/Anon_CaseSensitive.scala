package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitive extends js.Object {
  /** Find only ranges with case sensitive match. */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** Find only ranges that match entire word. */
  var entireWord: js.UndefOr[scala.Boolean] = js.undefined
  /** Return range data which provides range data in a serializable form. */
  var includeRangeData: js.UndefOr[scala.Boolean] = js.undefined
  /** Return rectangle data which describes visual position of search results. */
  var includeRectData: js.UndefOr[scala.Boolean] = js.undefined
  /** Tab to query. Defaults to the active tab. */
  var tabId: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    entireWord: js.UndefOr[scala.Boolean] = js.undefined,
    includeRangeData: js.UndefOr[scala.Boolean] = js.undefined,
    includeRectData: js.UndefOr[scala.Boolean] = js.undefined,
    tabId: scala.Int | scala.Double = null
  ): Anon_CaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (!js.isUndefined(entireWord)) __obj.updateDynamic("entireWord")(entireWord)
    if (!js.isUndefined(includeRangeData)) __obj.updateDynamic("includeRangeData")(includeRangeData)
    if (!js.isUndefined(includeRectData)) __obj.updateDynamic("includeRectData")(includeRectData)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CaseSensitive]
  }
}

