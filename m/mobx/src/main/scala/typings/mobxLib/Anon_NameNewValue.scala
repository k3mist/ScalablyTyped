package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNewValue
  extends mobxLib.libTypesObservableobjectMod.IObjectDidChange {
  var name: java.lang.String
  var newValue: js.Any
  var `object`: js.Any
  var oldValue: js.Any
  var `type`: mobxLib.mobxLibStrings.update
}

object Anon_NameNewValue {
  @scala.inline
  def apply(
    name: java.lang.String,
    newValue: js.Any,
    `object`: js.Any,
    oldValue: js.Any,
    `type`: mobxLib.mobxLibStrings.update
  ): Anon_NameNewValue = {
    val __obj = js.Dynamic.literal(name = name, newValue = newValue, `object` = `object`, oldValue = oldValue, `type` = `type`)
  
    __obj.asInstanceOf[Anon_NameNewValue]
  }
}

