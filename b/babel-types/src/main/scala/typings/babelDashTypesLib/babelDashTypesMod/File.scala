package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends Node {
  var comments: js.Array[Comment]
  var program: Program
  var tokens: js.Array[_]
  @JSName("type")
  var type_File: babelDashTypesLib.babelDashTypesLibStrings.File
}

object File {
  @scala.inline
  def apply(
    comments: js.Array[Comment],
    end: scala.Double,
    loc: SourceLocation,
    program: Program,
    start: scala.Double,
    tokens: js.Array[_],
    `type`: babelDashTypesLib.babelDashTypesLibStrings.File,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): File = {
    val __obj = js.Dynamic.literal(comments = comments, end = end, loc = loc, program = program, start = start, tokens = tokens, `type` = `type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[File]
  }
}

