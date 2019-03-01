package typings
package extjsLib.ExtNs.gridNs.columnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckColumn extends IColumn {
  /** [Method] Disables this CheckColumn
  		* @param silent Boolean
  		*/
  @JSName("onDisable")
  var onDisable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Enables this CheckColumn
  		* @param silent Boolean
  		*/
  @JSName("onEnable")
  var onEnable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var stopSelection: js.UndefOr[scala.Boolean] = js.undefined
}

object ICheckColumn {
  @scala.inline
  def apply(
    IColumn: IColumn = null,
    onDisable: js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    onEnable: js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    stopSelection: js.UndefOr[scala.Boolean] = js.undefined,
    tdCls: java.lang.String = null
  ): ICheckColumn = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IColumn)
    if (onDisable != null) __obj.updateDynamic("onDisable")(onDisable)
    if (onEnable != null) __obj.updateDynamic("onEnable")(onEnable)
    if (!js.isUndefined(stopSelection)) __obj.updateDynamic("stopSelection")(stopSelection)
    if (tdCls != null) __obj.updateDynamic("tdCls")(tdCls)
    __obj.asInstanceOf[ICheckColumn]
  }
}

