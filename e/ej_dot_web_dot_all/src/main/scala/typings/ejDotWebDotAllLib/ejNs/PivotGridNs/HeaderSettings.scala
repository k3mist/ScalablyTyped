package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderSettings extends js.Object {
  /** Allows you to enable/disable the column header names in the PivotGrid control.
    * @Default {false}
    */
  var showColumnItems: js.UndefOr[scala.Boolean] = js.undefined
  /** Allows you to enable/disable the row header names in the PivotGrid control.
    * @Default {false}
    */
  var showRowItems: js.UndefOr[scala.Boolean] = js.undefined
}

object HeaderSettings {
  @scala.inline
  def apply(
    showColumnItems: js.UndefOr[scala.Boolean] = js.undefined,
    showRowItems: js.UndefOr[scala.Boolean] = js.undefined
  ): HeaderSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showColumnItems)) __obj.updateDynamic("showColumnItems")(showColumnItems)
    if (!js.isUndefined(showRowItems)) __obj.updateDynamic("showRowItems")(showRowItems)
    __obj.asInstanceOf[HeaderSettings]
  }
}

