package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowCollection
  extends Node
     with ContentNode {
  var items: js.Array[FlowChar | Comment | Alias | Scalar | FlowCollection]
  @JSName("type")
  var type_FlowCollection: yamlLib.yamlLibStrings.FLOW_MAP | yamlLib.yamlLibStrings.FLOW_SEQ
}

object FlowCollection {
  @scala.inline
  def apply(
    hasComment: scala.Boolean,
    hasProps: scala.Boolean,
    items: js.Array[FlowChar | Comment | Alias | Scalar | FlowCollection],
    jsonLike: scala.Boolean,
    props: js.Array[Range],
    `type`: yamlLib.yamlLibStrings.FLOW_MAP | yamlLib.yamlLibStrings.FLOW_SEQ,
    valueRangeContainsNewline: scala.Boolean,
    anchor: java.lang.String = null,
    comment: java.lang.String = null,
    context: ParseContext = null,
    error: yamlLib.yamlMod.YAMLSyntaxError = null,
    range: Range = null,
    rawValue: java.lang.String = null,
    tag: yamlLib.Anon_Verbatim | yamlLib.Anon_Handle = null,
    value: java.lang.String = null,
    valueRange: Range = null
  ): FlowCollection = {
    val __obj = js.Dynamic.literal(hasComment = hasComment, hasProps = hasProps, items = items, jsonLike = jsonLike, props = props, `type` = `type`.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (context != null) __obj.updateDynamic("context")(context)
    if (error != null) __obj.updateDynamic("error")(error)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    __obj.asInstanceOf[FlowCollection]
  }
}

