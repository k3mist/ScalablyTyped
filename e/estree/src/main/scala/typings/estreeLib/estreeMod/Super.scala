package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Super
  extends BaseNode
     with _Node {
  @JSName("type")
  var type_Super: estreeLib.estreeLibStrings.Super
}

object Super {
  @scala.inline
  def apply(
    `type`: estreeLib.estreeLibStrings.Super,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): Super = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Super]
  }
}

