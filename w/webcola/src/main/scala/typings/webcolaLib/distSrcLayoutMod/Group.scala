package typings
package webcolaLib.distSrcLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var bounds: js.UndefOr[webcolaLib.distSrcRectangleMod.Rectangle] = js.undefined
  var groups: js.UndefOr[js.Array[Group]] = js.undefined
  var leaves: js.UndefOr[js.Array[Node]] = js.undefined
  var padding: scala.Double
}

object Group {
  @scala.inline
  def apply(
    padding: scala.Double,
    bounds: webcolaLib.distSrcRectangleMod.Rectangle = null,
    groups: js.Array[Group] = null,
    leaves: js.Array[Node] = null
  ): Group = {
    val __obj = js.Dynamic.literal(padding = padding)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (leaves != null) __obj.updateDynamic("leaves")(leaves)
    __obj.asInstanceOf[Group]
  }
}

