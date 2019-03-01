package typings
package removeDashMarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gfm extends js.Object {
  var gfm: js.UndefOr[scala.Boolean] = js.undefined
  var stripListLeaders: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Gfm {
  @scala.inline
  def apply(
    gfm: js.UndefOr[scala.Boolean] = js.undefined,
    stripListLeaders: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Gfm = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gfm)) __obj.updateDynamic("gfm")(gfm)
    if (!js.isUndefined(stripListLeaders)) __obj.updateDynamic("stripListLeaders")(stripListLeaders)
    __obj.asInstanceOf[Anon_Gfm]
  }
}

