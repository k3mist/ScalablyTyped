package typings
package senecaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basic extends js.Object {
  var basic: js.UndefOr[scala.Boolean] = js.undefined
  var `mem-store`: js.UndefOr[scala.Boolean] = js.undefined
  var transport: js.UndefOr[scala.Boolean] = js.undefined
  var web: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Basic {
  @scala.inline
  def apply(
    basic: js.UndefOr[scala.Boolean] = js.undefined,
    `mem-store`: js.UndefOr[scala.Boolean] = js.undefined,
    transport: js.UndefOr[scala.Boolean] = js.undefined,
    web: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Basic = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic)
    if (!js.isUndefined(`mem-store`)) __obj.updateDynamic("mem-store")(`mem-store`)
    if (!js.isUndefined(transport)) __obj.updateDynamic("transport")(transport)
    if (!js.isUndefined(web)) __obj.updateDynamic("web")(web)
    __obj.asInstanceOf[Anon_Basic]
  }
}

