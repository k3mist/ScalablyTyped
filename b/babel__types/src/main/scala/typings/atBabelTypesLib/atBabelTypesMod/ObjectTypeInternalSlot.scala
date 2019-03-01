package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ObjectTypeInternalSlot
  extends Flow
     with BaseNode
     with UserWhitespacable {
  var id: Identifier
  var method: scala.Boolean
  var optional: scala.Boolean
  var static: scala.Boolean
  @JSName("type")
  var type_ObjectTypeInternalSlot: atBabelTypesLib.atBabelTypesLibStrings.ObjectTypeInternalSlot
  var value: FlowType
}

object ObjectTypeInternalSlot {
  @scala.inline
  def apply(
    id: Identifier,
    method: scala.Boolean,
    optional: scala.Boolean,
    static: scala.Boolean,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ObjectTypeInternalSlot,
    value: FlowType,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectTypeInternalSlot = {
    val __obj = js.Dynamic.literal(id = id, method = method, optional = optional, static = static, `type` = `type`, value = value)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectTypeInternalSlot]
  }
}

