package typings
package supportsDashColorLib.supportsDashColorMod.supportsColorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var has16m: scala.Boolean
  var has256: scala.Boolean
  var hasBasic: scala.Boolean
  var level: scala.Double
}

object Level {
  @scala.inline
  def apply(has16m: scala.Boolean, has256: scala.Boolean, hasBasic: scala.Boolean, level: scala.Double): Level = {
    val __obj = js.Dynamic.literal(has16m = has16m, has256 = has256, hasBasic = hasBasic, level = level)
  
    __obj.asInstanceOf[Level]
  }
}

