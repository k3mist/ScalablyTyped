package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentCommentsDelegate extends js.Object {
  var argument: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var delegate: js.UndefOr[scala.Boolean] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_ArgumentCommentsDelegate {
  @scala.inline
  def apply(
    argument: astDashTypesLib.genKindsMod.ExpressionKind = null,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    delegate: js.UndefOr[scala.Boolean] = js.undefined,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_ArgumentCommentsDelegate = {
    val __obj = js.Dynamic.literal()
    if (argument != null) __obj.updateDynamic("argument")(argument)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(delegate)) __obj.updateDynamic("delegate")(delegate)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_ArgumentCommentsDelegate]
  }
}

