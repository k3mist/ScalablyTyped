package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ClassPrivateProperty
  extends Private
     with BaseNode
     with Property {
  var key: PrivateName
  @JSName("type")
  var type_ClassPrivateProperty: atBabelTypesLib.atBabelTypesLibStrings.ClassPrivateProperty
  var value: Expression | scala.Null
}

object ClassPrivateProperty {
  @scala.inline
  def apply(
    key: PrivateName,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ClassPrivateProperty,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    value: Expression = null
  ): ClassPrivateProperty = {
    val __obj = js.Dynamic.literal(key = key, `type` = `type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ClassPrivateProperty]
  }
}

