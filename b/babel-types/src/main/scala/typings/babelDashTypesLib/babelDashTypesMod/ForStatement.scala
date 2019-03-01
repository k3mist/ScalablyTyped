package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForStatement
  extends Node
     with BlockParent
     with For
     with Loop
     with Scopable
     with Statement {
  var body: Statement
  var init: VariableDeclaration | Expression
  var test: Expression
  @JSName("type")
  var type_ForStatement: babelDashTypesLib.babelDashTypesLibStrings.ForStatement
  var update: Expression
}

object ForStatement {
  @scala.inline
  def apply(
    body: Statement,
    end: scala.Double,
    init: VariableDeclaration | Expression,
    loc: SourceLocation,
    start: scala.Double,
    test: Expression,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ForStatement,
    update: Expression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ForStatement = {
    val __obj = js.Dynamic.literal(body = body, end = end, init = init.asInstanceOf[js.Any], loc = loc, start = start, test = test, `type` = `type`, update = update)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ForStatement]
  }
}

