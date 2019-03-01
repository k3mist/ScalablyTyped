package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectPattern
  extends Node
     with LVal
     with Pattern {
  var properties: js.Array[AssignmentProperty | RestProperty]
  var typeAnnotation: js.UndefOr[TypeAnnotation] = js.undefined
  @JSName("type")
  var type_ObjectPattern: babelDashTypesLib.babelDashTypesLibStrings.ObjectPattern
}

object ObjectPattern {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    properties: js.Array[AssignmentProperty | RestProperty],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ObjectPattern,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation = null
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, properties = properties, start = start, `type` = `type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[ObjectPattern]
  }
}

