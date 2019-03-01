package typings
package gulpDashMinifyDashHtmlLib.gulpDashMinifyDashHtmlMod.minifyHtmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Options from https://github.com/Swaagie/minimize#options
trait Options extends js.Object {
  // Do not strip CDATA from scripts
  var cdata: js.UndefOr[scala.Boolean] = js.undefined
  // Do not remove comments
  var comments: js.UndefOr[scala.Boolean] = js.undefined
  // Do not remove conditional internet explorer comments
  var conditionals: js.UndefOr[scala.Boolean] = js.undefined
  // Do not remove empty attributes
  var empty: js.UndefOr[scala.Boolean] = js.undefined
  // Preserve one whitespace
  var loose: js.UndefOr[scala.Boolean] = js.undefined
  // Do not remove arbitrary quotes
  var quotes: js.UndefOr[scala.Boolean] = js.undefined
  // Do not remove redundant attributes
  var spare: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cdata: js.UndefOr[scala.Boolean] = js.undefined,
    comments: js.UndefOr[scala.Boolean] = js.undefined,
    conditionals: js.UndefOr[scala.Boolean] = js.undefined,
    empty: js.UndefOr[scala.Boolean] = js.undefined,
    loose: js.UndefOr[scala.Boolean] = js.undefined,
    quotes: js.UndefOr[scala.Boolean] = js.undefined,
    spare: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cdata)) __obj.updateDynamic("cdata")(cdata)
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(conditionals)) __obj.updateDynamic("conditionals")(conditionals)
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose)
    if (!js.isUndefined(quotes)) __obj.updateDynamic("quotes")(quotes)
    if (!js.isUndefined(spare)) __obj.updateDynamic("spare")(spare)
    __obj.asInstanceOf[Options]
  }
}

