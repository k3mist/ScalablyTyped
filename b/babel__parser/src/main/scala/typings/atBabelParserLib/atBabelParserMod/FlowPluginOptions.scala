package typings
package atBabelParserLib.atBabelParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowPluginOptions extends js.Object {
  var all: js.UndefOr[scala.Boolean] = js.undefined
}

object FlowPluginOptions {
  @scala.inline
  def apply(all: js.UndefOr[scala.Boolean] = js.undefined): FlowPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    __obj.asInstanceOf[FlowPluginOptions]
  }
}

