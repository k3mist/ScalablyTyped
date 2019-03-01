package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericTypeAnnotation
  extends Node
     with Flow
     with FlowTypeAnnotation {
  var id: Identifier
  var typeParameters: TypeParameterInstantiation
  @JSName("type")
  var type_GenericTypeAnnotation: babelDashTypesLib.babelDashTypesLibStrings.GenericTypeAnnotation
}

object GenericTypeAnnotation {
  @scala.inline
  def apply(
    end: scala.Double,
    id: Identifier,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.GenericTypeAnnotation,
    typeParameters: TypeParameterInstantiation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): GenericTypeAnnotation = {
    val __obj = js.Dynamic.literal(end = end, id = id, loc = loc, start = start, `type` = `type`, typeParameters = typeParameters)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[GenericTypeAnnotation]
  }
}

