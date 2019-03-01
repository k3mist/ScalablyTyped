package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeCallProperty
  extends Node
     with Flow
     with UserWhitespacable {
  @JSName("type")
  var type_ObjectTypeCallProperty: babelDashTypesLib.babelDashTypesLibStrings.ObjectTypeCallProperty
  var value: FlowTypeAnnotation
}

object ObjectTypeCallProperty {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ObjectTypeCallProperty,
    value: FlowTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectTypeCallProperty = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, `type` = `type`, value = value)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectTypeCallProperty]
  }
}

