package typings
package dLib.autoDashBindMod.autoBindNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var overwriteDefinition: js.UndefOr[scala.Boolean] = js.undefined
  var resolveContext: js.UndefOr[js.Function1[/* context */ js.Any, _]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    overwriteDefinition: js.UndefOr[scala.Boolean] = js.undefined,
    resolveContext: js.Function1[/* context */ js.Any, _] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overwriteDefinition)) __obj.updateDynamic("overwriteDefinition")(overwriteDefinition)
    if (resolveContext != null) __obj.updateDynamic("resolveContext")(resolveContext)
    __obj.asInstanceOf[Options]
  }
}

