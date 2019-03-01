package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForOfStatement
  extends BaseForXStatement
     with Statement {
  @JSName("type")
  var type_ForOfStatement: estreeLib.estreeLibStrings.ForOfStatement
}

object ForOfStatement {
  @scala.inline
  def apply(
    body: Statement,
    left: VariableDeclaration | Pattern,
    right: estreeLib.Expression,
    `type`: estreeLib.estreeLibStrings.ForOfStatement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ForOfStatement = {
    val __obj = js.Dynamic.literal(body = body, left = left.asInstanceOf[js.Any], right = right, `type` = `type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ForOfStatement]
  }
}

