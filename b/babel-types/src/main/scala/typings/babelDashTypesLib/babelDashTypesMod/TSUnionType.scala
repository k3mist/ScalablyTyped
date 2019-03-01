package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSUnionType
  extends Node
     with TSType {
  @JSName("type")
  var type_TSUnionType: babelDashTypesLib.babelDashTypesLibStrings.TSUnionType
  var types: js.Array[TSType]
}

object TSUnionType {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSUnionType,
    types: js.Array[TSType],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSUnionType = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, `type` = `type`, types = types)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSUnionType]
  }
}

