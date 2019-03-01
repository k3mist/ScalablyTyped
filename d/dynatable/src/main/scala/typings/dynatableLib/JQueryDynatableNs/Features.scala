package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  /**
    * Enable the pagination feature
    *
    * @default true
    */
  var paginate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable the perPageSelect feature
    * The perPageSelect will insert a form control filled with the options from `perPageOptions`
    *
    * @default true
    */
  var perPageSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable the pushState feature
    * Used to update the page URL parameters and cache the query result for the browser's forward- and back-buttons
    *
    * @default true
    */
  var pushState: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable the recordCount feature
    * When pagination is enabled, dynatable will also show the currently displayed records and the total number of records
    *
    * @default true
    */
  var recordCount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable the search feature
    *
    * @default true
    */
  var search: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable the sorting feature
    *
    * @default true
    */
  var sort: js.UndefOr[scala.Boolean] = js.undefined
}

object Features {
  @scala.inline
  def apply(
    paginate: js.UndefOr[scala.Boolean] = js.undefined,
    perPageSelect: js.UndefOr[scala.Boolean] = js.undefined,
    pushState: js.UndefOr[scala.Boolean] = js.undefined,
    recordCount: js.UndefOr[scala.Boolean] = js.undefined,
    search: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.UndefOr[scala.Boolean] = js.undefined
  ): Features = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(paginate)) __obj.updateDynamic("paginate")(paginate)
    if (!js.isUndefined(perPageSelect)) __obj.updateDynamic("perPageSelect")(perPageSelect)
    if (!js.isUndefined(pushState)) __obj.updateDynamic("pushState")(pushState)
    if (!js.isUndefined(recordCount)) __obj.updateDynamic("recordCount")(recordCount)
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[Features]
  }
}

