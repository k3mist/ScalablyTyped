package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsLoc extends js.Object {
  var body: astDashTypesLib.genKindsMod.StatementKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var `object`: astDashTypesLib.genKindsMod.ExpressionKind
}

object Anon_BodyCommentsLoc {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.StatementKind,
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_BodyCommentsLoc = {
    val __obj = js.Dynamic.literal(body = body, `object` = `object`)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyCommentsLoc]
  }
}

