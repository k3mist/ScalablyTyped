package typings
package refluxLib.refluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionDefinition extends ActionParameters {
  var actionName: js.UndefOr[java.lang.String] = js.undefined
}

object ActionDefinition {
  @scala.inline
  def apply(
    actionName: java.lang.String = null,
    asyncResult: js.UndefOr[scala.Boolean] = js.undefined,
    children: js.Array[java.lang.String] = null,
    preEmit: js.Function1[/* repeated */ js.Any, js.UndefOr[js.Array[_]]] = null,
    shouldEmit: js.Function1[/* repeated */ js.Any, scala.Boolean] = null,
    sync: js.UndefOr[scala.Boolean] = js.undefined
  ): ActionDefinition = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (!js.isUndefined(asyncResult)) __obj.updateDynamic("asyncResult")(asyncResult)
    if (children != null) __obj.updateDynamic("children")(children)
    if (preEmit != null) __obj.updateDynamic("preEmit")(preEmit)
    if (shouldEmit != null) __obj.updateDynamic("shouldEmit")(shouldEmit)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[ActionDefinition]
  }
}

