package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoExpression
  extends Node
     with Expression {
  var body: BlockStatement
  @JSName("type")
  var type_DoExpression: babelDashTypesLib.babelDashTypesLibStrings.DoExpression
}

object DoExpression {
  @scala.inline
  def apply(
    body: BlockStatement,
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.DoExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): DoExpression = {
    val __obj = js.Dynamic.literal(body = body, end = end, loc = loc, start = start, `type` = `type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[DoExpression]
  }
}

