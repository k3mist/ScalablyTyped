package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterTransform extends _Transforms {
  var expr: java.lang.String
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.filter
}

object FilterTransform {
  @scala.inline
  def apply(expr: java.lang.String, `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.filter): FilterTransform = {
    val __obj = js.Dynamic.literal(expr = expr)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FilterTransform]
  }
}

