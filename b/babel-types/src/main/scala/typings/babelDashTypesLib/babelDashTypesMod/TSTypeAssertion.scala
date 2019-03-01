package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeAssertion
  extends Node
     with Expression {
  var expression: Expression
  var typeAnnotation: TSType
  @JSName("type")
  var type_TSTypeAssertion: babelDashTypesLib.babelDashTypesLibStrings.TSTypeAssertion
}

object TSTypeAssertion {
  @scala.inline
  def apply(
    end: scala.Double,
    expression: Expression,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSTypeAssertion,
    typeAnnotation: TSType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeAssertion = {
    val __obj = js.Dynamic.literal(end = end, expression = expression, loc = loc, start = start, `type` = `type`, typeAnnotation = typeAnnotation)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeAssertion]
  }
}

