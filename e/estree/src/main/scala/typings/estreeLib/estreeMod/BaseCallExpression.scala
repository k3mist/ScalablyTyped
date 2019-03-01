package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCallExpression extends BaseNode {
  var arguments: js.Array[estreeLib.Expression | SpreadElement]
  var callee: estreeLib.Expression | Super
}

object BaseCallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[estreeLib.Expression | SpreadElement],
    callee: estreeLib.Expression | Super,
    `type`: java.lang.String,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): BaseCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee.asInstanceOf[js.Any], `type` = `type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BaseCallExpression]
  }
}

