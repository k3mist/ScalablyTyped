package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowInInput extends js.Object {
  var allowInInput: scala.Boolean
  var disabled: scala.Boolean
  var global: scala.Boolean
  var preventDefault: scala.Boolean
  var stopPropagation: scala.Boolean
}

object Anon_AllowInInput {
  @scala.inline
  def apply(
    allowInInput: scala.Boolean,
    disabled: scala.Boolean,
    global: scala.Boolean,
    preventDefault: scala.Boolean,
    stopPropagation: scala.Boolean
  ): Anon_AllowInInput = {
    val __obj = js.Dynamic.literal(allowInInput = allowInInput, disabled = disabled, global = global, preventDefault = preventDefault, stopPropagation = stopPropagation)
  
    __obj.asInstanceOf[Anon_AllowInInput]
  }
}

