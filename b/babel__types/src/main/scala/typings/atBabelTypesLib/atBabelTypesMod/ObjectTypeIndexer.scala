package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ObjectTypeIndexer
  extends Flow
     with BaseNode
     with UserWhitespacable {
  var id: Identifier | scala.Null
  var key: FlowType
  var static: scala.Boolean | scala.Null
  @JSName("type")
  var type_ObjectTypeIndexer: atBabelTypesLib.atBabelTypesLibStrings.ObjectTypeIndexer
  var value: FlowType
  var variance: Variance | scala.Null
}

object ObjectTypeIndexer {
  @scala.inline
  def apply(
    key: FlowType,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ObjectTypeIndexer,
    value: FlowType,
    end: scala.Int | scala.Double = null,
    id: Identifier = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    static: js.UndefOr[scala.Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    variance: Variance = null
  ): ObjectTypeIndexer = {
    val __obj = js.Dynamic.literal(key = key, `type` = `type`, value = value)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (variance != null) __obj.updateDynamic("variance")(variance)
    __obj.asInstanceOf[ObjectTypeIndexer]
  }
}

