package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionTypeParam
  extends Node
     with Flow {
  var name: Identifier
  var typeAnnotation: FlowTypeAnnotation
  @JSName("type")
  var type_FunctionTypeParam: babelDashTypesLib.babelDashTypesLibStrings.FunctionTypeParam
}

object FunctionTypeParam {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    name: Identifier,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.FunctionTypeParam,
    typeAnnotation: FlowTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): FunctionTypeParam = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, name = name, start = start, `type` = `type`, typeAnnotation = typeAnnotation)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[FunctionTypeParam]
  }
}

