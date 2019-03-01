package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends Node {
  @JSName("anchor")
  val anchor_Comment: scala.Null
  @JSName("comment")
  val comment_Comment: java.lang.String
  @JSName("rawValue")
  val rawValue_Comment: scala.Null
  @JSName("tag")
  val tag_Comment: scala.Null
  @JSName("type")
  var type_Comment: yamlLib.yamlLibStrings.COMMENT
}

object Comment {
  @scala.inline
  def apply(
    anchor: scala.Null,
    comment: java.lang.String,
    hasComment: scala.Boolean,
    hasProps: scala.Boolean,
    jsonLike: scala.Boolean,
    props: js.Array[Range],
    rawValue: scala.Null,
    tag: scala.Null,
    `type`: yamlLib.yamlLibStrings.COMMENT,
    valueRangeContainsNewline: scala.Boolean,
    context: ParseContext = null,
    error: yamlLib.yamlMod.YAMLSyntaxError = null,
    range: Range = null,
    value: java.lang.String = null,
    valueRange: Range = null
  ): Comment = {
    val __obj = js.Dynamic.literal(anchor = anchor, comment = comment, hasComment = hasComment, hasProps = hasProps, jsonLike = jsonLike, props = props, rawValue = rawValue, tag = tag, `type` = `type`, valueRangeContainsNewline = valueRangeContainsNewline)
    if (context != null) __obj.updateDynamic("context")(context)
    if (error != null) __obj.updateDynamic("error")(error)
    if (range != null) __obj.updateDynamic("range")(range)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    __obj.asInstanceOf[Comment]
  }
}

