package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSettings extends js.Object {
  /** Option to add columns based on which the rows have to be sorted recursively.
    * @Default {[]}
    */
  var sortedColumns: js.UndefOr[js.Array[SortSettingsSortedColumn]] = js.undefined
}

object SortSettings {
  @scala.inline
  def apply(sortedColumns: js.Array[SortSettingsSortedColumn] = null): SortSettings = {
    val __obj = js.Dynamic.literal()
    if (sortedColumns != null) __obj.updateDynamic("sortedColumns")(sortedColumns)
    __obj.asInstanceOf[SortSettings]
  }
}

