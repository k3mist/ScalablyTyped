package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionTypeAnnotation
  extends Node
     with Flow
     with FlowTypeAnnotation {
  @JSName("type")
  var type_UnionTypeAnnotation: babelDashTypesLib.babelDashTypesLibStrings.UnionTypeAnnotation
  var types: js.Array[FlowTypeAnnotation]
}

object UnionTypeAnnotation {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.UnionTypeAnnotation,
    types: js.Array[FlowTypeAnnotation],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): UnionTypeAnnotation = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, `type` = `type`, types = types)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[UnionTypeAnnotation]
  }
}

