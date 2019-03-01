package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupedColumnsChangedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the current child grid element, in case it's an hierarchical grid(not set if called from modal dialog).
  	 */
  var grid: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the current groupedColumns.
  	 */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets a reference to the current column's key that's being grouped(not set if called from modal dialog).
  	 */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the current layout object, if any(not set if called from modal dialog).
  	 */
  var layout: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets which user interaction triggers the event - possible options are dragAndDrop|modalDialog|sortStateChanged|removeButton|regroup.
  	 */
  var triggeredBy: js.UndefOr[java.lang.String] = js.undefined
}

object GroupedColumnsChangedEventUIParam {
  @scala.inline
  def apply(
    grid: js.Any = null,
    groupedColumns: js.Array[_] = null,
    key: java.lang.String = null,
    layout: js.Any = null,
    owner: js.Any = null,
    triggeredBy: java.lang.String = null
  ): GroupedColumnsChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (groupedColumns != null) __obj.updateDynamic("groupedColumns")(groupedColumns)
    if (key != null) __obj.updateDynamic("key")(key)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (triggeredBy != null) __obj.updateDynamic("triggeredBy")(triggeredBy)
    __obj.asInstanceOf[GroupedColumnsChangedEventUIParam]
  }
}

