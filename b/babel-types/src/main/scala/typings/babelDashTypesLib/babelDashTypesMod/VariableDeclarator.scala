package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclarator extends Node {
  var id: LVal
  var init: Expression
  @JSName("type")
  var type_VariableDeclarator: babelDashTypesLib.babelDashTypesLibStrings.VariableDeclarator
}

object VariableDeclarator {
  @scala.inline
  def apply(
    end: scala.Double,
    id: LVal,
    init: Expression,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.VariableDeclarator,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): VariableDeclarator = {
    val __obj = js.Dynamic.literal(end = end, id = id, init = init, loc = loc, start = start, `type` = `type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[VariableDeclarator]
  }
}

