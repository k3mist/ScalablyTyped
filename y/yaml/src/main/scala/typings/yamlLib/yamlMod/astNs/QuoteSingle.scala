package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuoteSingle
  extends Scalar
     with ScalarNode {
  @JSName("cstNode")
  var cstNode_QuoteSingle: js.UndefOr[yamlLib.yamlMod.cstNs.QuoteSingle] = js.undefined
  @JSName("type")
  var type_QuoteSingle: yamlLib.yamlLibStrings.QUOTE_SINGLE
}

object QuoteSingle {
  @scala.inline
  def apply(
    toJSON: () => js.Any,
    `type`: yamlLib.yamlLibStrings.QUOTE_SINGLE,
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    cstNode: yamlLib.yamlMod.cstNs.QuoteSingle = null,
    format: yamlLib.yamlLibStrings.BIN | yamlLib.yamlLibStrings.HEX | yamlLib.yamlLibStrings.OCT | yamlLib.yamlLibStrings.TIME = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tag: java.lang.String = null,
    value: scala.Boolean | scala.Double | java.lang.String = null
  ): QuoteSingle = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuoteSingle]
  }
}

