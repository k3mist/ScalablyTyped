package typings
package fullcalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventInput extends js.Object {
  def parse(eventInput: js.Any, source: js.Any): js.Any
}

object Anon_EventInput {
  @scala.inline
  def apply(parse: (js.Any, js.Any) => js.Any): Anon_EventInput = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse))
  
    __obj.asInstanceOf[Anon_EventInput]
  }
}

