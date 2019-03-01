package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonContainer extends JsonNode {
  /**
    * @returns The container's first child.
    */
  var first: js.UndefOr[Node] = js.undefined
  /**
    * @returns The container's last child.
    */
  var last: js.UndefOr[Node] = js.undefined
  /**
    * Contains the container's children.
    */
  var nodes: js.UndefOr[js.Array[Node]] = js.undefined
}

object JsonContainer {
  @scala.inline
  def apply(
    first: Node = null,
    last: Node = null,
    nodes: js.Array[Node] = null,
    parent: JsonContainer = null,
    raws: NodeRaws = null,
    source: NodeSource = null,
    `type`: java.lang.String = null
  ): JsonContainer = {
    val __obj = js.Dynamic.literal()
    if (first != null) __obj.updateDynamic("first")(first)
    if (last != null) __obj.updateDynamic("last")(last)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (raws != null) __obj.updateDynamic("raws")(raws)
    if (source != null) __obj.updateDynamic("source")(source)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JsonContainer]
  }
}

