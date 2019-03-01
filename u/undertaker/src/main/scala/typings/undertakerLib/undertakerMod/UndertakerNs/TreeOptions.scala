package typings
package undertakerLib.undertakerMod.UndertakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeOptions extends js.Object {
  /**
    * Whether or not the whole tree should be returned.
    * Default: false
    */
  var deep: js.UndefOr[scala.Boolean] = js.undefined
}

object TreeOptions {
  @scala.inline
  def apply(deep: js.UndefOr[scala.Boolean] = js.undefined): TreeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    __obj.asInstanceOf[TreeOptions]
  }
}

