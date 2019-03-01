package typings
package eslintLib.eslintMod.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program
  extends estreeLib.estreeMod.Program {
  @JSName("comments")
  var comments_Program: js.Array[estreeLib.estreeMod.Comment]
  @JSName("loc")
  var loc_Program: SourceLocation
  @JSName("range")
  var range_Program: Range
  var tokens: js.Array[Token]
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[estreeLib.estreeMod.Statement | estreeLib.estreeMod.ModuleDeclaration],
    comments: js.Array[estreeLib.estreeMod.Comment],
    loc: SourceLocation,
    range: Range,
    sourceType: estreeLib.estreeLibStrings.script | estreeLib.estreeLibStrings.module,
    tokens: js.Array[Token],
    `type`: java.lang.String,
    type_Program: estreeLib.estreeLibStrings.Program,
    leadingComments: js.Array[estreeLib.estreeMod.Comment] = null,
    trailingComments: js.Array[estreeLib.estreeMod.Comment] = null
  ): Program = {
    val __obj = js.Dynamic.literal(body = body, comments = comments, loc = loc, range = range, sourceType = sourceType.asInstanceOf[js.Any], tokens = tokens, `type` = `type`, type_Program = type_Program)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Program]
  }
}

