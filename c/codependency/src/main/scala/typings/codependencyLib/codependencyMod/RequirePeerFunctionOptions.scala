package typings
package codependencyLib.codependencyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequirePeerFunctionOptions extends js.Object {
  var dontThrow: js.UndefOr[scala.Boolean] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
}

object RequirePeerFunctionOptions {
  @scala.inline
  def apply(
    dontThrow: js.UndefOr[scala.Boolean] = js.undefined,
    optional: js.UndefOr[scala.Boolean] = js.undefined
  ): RequirePeerFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dontThrow)) __obj.updateDynamic("dontThrow")(dontThrow)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[RequirePeerFunctionOptions]
  }
}

