package typings
package gulpDashIfLib.gulpDashIfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatFilterCondition extends js.Object {
  var isDirectory: js.UndefOr[scala.Boolean] = js.undefined
  var isFile: js.UndefOr[scala.Boolean] = js.undefined
}

object StatFilterCondition {
  @scala.inline
  def apply(
    isDirectory: js.UndefOr[scala.Boolean] = js.undefined,
    isFile: js.UndefOr[scala.Boolean] = js.undefined
  ): StatFilterCondition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDirectory)) __obj.updateDynamic("isDirectory")(isDirectory)
    if (!js.isUndefined(isFile)) __obj.updateDynamic("isFile")(isFile)
    __obj.asInstanceOf[StatFilterCondition]
  }
}

