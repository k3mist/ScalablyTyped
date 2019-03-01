package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowFunctionExpression
  extends BaseFunction
     with Function {
  var expression: scala.Boolean
  @JSName("type")
  var type_ArrowFunctionExpression: estreeLib.estreeLibStrings.ArrowFunctionExpression
}

object ArrowFunctionExpression {
  @scala.inline
  def apply(
    body: BlockStatement | estreeLib.Expression,
    expression: scala.Boolean,
    params: js.Array[Pattern],
    `type`: estreeLib.estreeLibStrings.ArrowFunctionExpression,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    generator: js.UndefOr[scala.Boolean] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression, params = params, `type` = `type`)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ArrowFunctionExpression]
  }
}

