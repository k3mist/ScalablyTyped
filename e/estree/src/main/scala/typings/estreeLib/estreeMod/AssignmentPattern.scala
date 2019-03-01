package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentPattern
  extends BaseNode
     with Pattern {
  var left: Pattern
  var right: estreeLib.Expression
  @JSName("type")
  var type_AssignmentPattern: estreeLib.estreeLibStrings.AssignmentPattern
}

object AssignmentPattern {
  @scala.inline
  def apply(
    left: Pattern,
    right: estreeLib.Expression,
    `type`: estreeLib.estreeLibStrings.AssignmentPattern,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left, right = right, `type` = `type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[AssignmentPattern]
  }
}

