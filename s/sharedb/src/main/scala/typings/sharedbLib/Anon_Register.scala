package typings
package sharedbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Register extends js.Object {
  def register(`type`: Anon_Key): scala.Unit
}

object Anon_Register {
  @scala.inline
  def apply(register: js.Function1[Anon_Key, scala.Unit]): Anon_Register = {
    val __obj = js.Dynamic.literal(register = register)
  
    __obj.asInstanceOf[Anon_Register]
  }
}

