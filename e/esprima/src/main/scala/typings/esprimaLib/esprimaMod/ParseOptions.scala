package typings
package esprimaLib.esprimaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var comment: js.UndefOr[scala.Boolean] = js.undefined
  var jsx: js.UndefOr[scala.Boolean] = js.undefined
  var loc: js.UndefOr[scala.Boolean] = js.undefined
  var range: js.UndefOr[scala.Boolean] = js.undefined
  var tokens: js.UndefOr[scala.Boolean] = js.undefined
  var tolerant: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    comment: js.UndefOr[scala.Boolean] = js.undefined,
    jsx: js.UndefOr[scala.Boolean] = js.undefined,
    loc: js.UndefOr[scala.Boolean] = js.undefined,
    range: js.UndefOr[scala.Boolean] = js.undefined,
    tokens: js.UndefOr[scala.Boolean] = js.undefined,
    tolerant: js.UndefOr[scala.Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comment)) __obj.updateDynamic("comment")(comment)
    if (!js.isUndefined(jsx)) __obj.updateDynamic("jsx")(jsx)
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (!js.isUndefined(tokens)) __obj.updateDynamic("tokens")(tokens)
    if (!js.isUndefined(tolerant)) __obj.updateDynamic("tolerant")(tolerant)
    __obj.asInstanceOf[ParseOptions]
  }
}

