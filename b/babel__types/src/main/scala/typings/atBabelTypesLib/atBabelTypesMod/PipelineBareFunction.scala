package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineBareFunction
  extends BaseNode
     with _Node {
  var callee: Expression
  @JSName("type")
  var type_PipelineBareFunction: atBabelTypesLib.atBabelTypesLibStrings.PipelineBareFunction
}

object PipelineBareFunction {
  @scala.inline
  def apply(
    callee: Expression,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.PipelineBareFunction,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): PipelineBareFunction = {
    val __obj = js.Dynamic.literal(callee = callee, `type` = `type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[PipelineBareFunction]
  }
}

