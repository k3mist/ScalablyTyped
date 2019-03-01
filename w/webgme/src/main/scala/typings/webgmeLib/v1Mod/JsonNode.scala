package typings
package webgmeLib.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonNode extends js.Object {
  var attributes: js.Any
  var base: java.lang.String
  var constratints: js.Any
  var meta: js.Any
  var parent: java.lang.String
  var pointers: js.Any
  var registry: js.Any
  var sets: js.Any
}

object JsonNode {
  @scala.inline
  def apply(
    attributes: js.Any,
    base: java.lang.String,
    constratints: js.Any,
    meta: js.Any,
    parent: java.lang.String,
    pointers: js.Any,
    registry: js.Any,
    sets: js.Any
  ): JsonNode = {
    val __obj = js.Dynamic.literal(attributes = attributes, base = base, constratints = constratints, meta = meta, parent = parent, pointers = pointers, registry = registry, sets = sets)
  
    __obj.asInstanceOf[JsonNode]
  }
}

