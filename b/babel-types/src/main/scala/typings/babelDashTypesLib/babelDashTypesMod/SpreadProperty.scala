package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadProperty
  extends Node
     with UnaryLike {
  var argument: Expression
  @JSName("type")
  var type_SpreadProperty: babelDashTypesLib.babelDashTypesLibStrings.SpreadProperty
}

object SpreadProperty {
  @scala.inline
  def apply(
    argument: Expression,
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.SpreadProperty,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): SpreadProperty = {
    val __obj = js.Dynamic.literal(argument = argument, end = end, loc = loc, start = start, `type` = `type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SpreadProperty]
  }
}

