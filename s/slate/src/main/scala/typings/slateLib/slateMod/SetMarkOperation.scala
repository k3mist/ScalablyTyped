package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetMarkOperation extends Operation {
  var length: scala.Double
  var mark: Mark
  var offset: scala.Double
  var path: js.Array[scala.Double]
  var properties: MarkProperties
  var `type`: slateLib.slateLibStrings.set_mark
}

object SetMarkOperation {
  @scala.inline
  def apply(
    length: scala.Double,
    mark: Mark,
    offset: scala.Double,
    path: js.Array[scala.Double],
    properties: MarkProperties,
    `type`: slateLib.slateLibStrings.set_mark
  ): SetMarkOperation = {
    val __obj = js.Dynamic.literal(length = length, mark = mark, offset = offset, path = path, properties = properties)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetMarkOperation]
  }
}

