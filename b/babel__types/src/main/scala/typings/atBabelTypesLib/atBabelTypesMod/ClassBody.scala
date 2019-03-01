package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBody
  extends BaseNode
     with _Node {
  var body: js.Array[
    ClassMethod | ClassPrivateMethod | ClassProperty | ClassPrivateProperty | TSDeclareMethod | TSIndexSignature
  ]
  @JSName("type")
  var type_ClassBody: atBabelTypesLib.atBabelTypesLibStrings.ClassBody
}

object ClassBody {
  @scala.inline
  def apply(
    body: js.Array[
      ClassMethod | ClassPrivateMethod | ClassProperty | ClassPrivateProperty | TSDeclareMethod | TSIndexSignature
    ],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ClassBody,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): ClassBody = {
    val __obj = js.Dynamic.literal(body = body, `type` = `type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ClassBody]
  }
}

