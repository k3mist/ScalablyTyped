package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFace
  extends Node
     with AtRule {
  /** Array of nodes with the types declaration and comment. */
  var declarations: js.UndefOr[js.Array[Declaration | Comment]] = js.undefined
}

object FontFace {
  @scala.inline
  def apply(
    declarations: js.Array[Declaration | Comment] = null,
    parent: Node = null,
    position: cssLib.Anon_Content = null,
    `type`: java.lang.String = null
  ): FontFace = {
    val __obj = js.Dynamic.literal()
    if (declarations != null) __obj.updateDynamic("declarations")(declarations)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FontFace]
  }
}

