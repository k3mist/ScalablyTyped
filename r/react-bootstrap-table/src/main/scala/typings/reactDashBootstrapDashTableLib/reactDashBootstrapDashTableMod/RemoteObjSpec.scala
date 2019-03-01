package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteObjSpec extends js.Object {
  /**
  	 * If set, cell edits will be handled remotely
  	 */
  var cellEdit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If set deletion will be handled remotely
  	 */
  var dropRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If set, exporting CSV will be handled remotely
  	 */
  var exportCSV: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If set filters will be handled remotely
  	 */
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If set insertions will be handled remotely
  	 */
  var insertRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If set pagination will be handled remotely
  	 */
  var pagination: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If set search will be handled remotely
  	 */
  var search: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If set sorting will be handled remotely
  	 */
  var sort: js.UndefOr[scala.Boolean] = js.undefined
}

object RemoteObjSpec {
  @scala.inline
  def apply(
    cellEdit: js.UndefOr[scala.Boolean] = js.undefined,
    dropRow: js.UndefOr[scala.Boolean] = js.undefined,
    exportCSV: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    insertRow: js.UndefOr[scala.Boolean] = js.undefined,
    pagination: js.UndefOr[scala.Boolean] = js.undefined,
    search: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.UndefOr[scala.Boolean] = js.undefined
  ): RemoteObjSpec = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cellEdit)) __obj.updateDynamic("cellEdit")(cellEdit)
    if (!js.isUndefined(dropRow)) __obj.updateDynamic("dropRow")(dropRow)
    if (!js.isUndefined(exportCSV)) __obj.updateDynamic("exportCSV")(exportCSV)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(insertRow)) __obj.updateDynamic("insertRow")(insertRow)
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination)
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[RemoteObjSpec]
  }
}

