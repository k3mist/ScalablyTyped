package typings
package apostropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackData extends js.Object {
  def form(
    req: js.Any,
    data: js.Any,
    name: java.lang.String,
    `object`: apostropheLib.apostropheMod.apostropheNs.AposObject,
    field: js.Any,
    callback: js.Function0[_]
  ): scala.Unit
  def string(
    req: js.Any,
    data: js.Any,
    name: java.lang.String,
    `object`: apostropheLib.apostropheMod.apostropheNs.AposObject,
    field: js.Any,
    callback: js.Function0[_]
  ): scala.Unit
}

object Anon_CallbackData {
  @scala.inline
  def apply(
    form: js.Function6[
      js.Any, 
      js.Any, 
      java.lang.String, 
      apostropheLib.apostropheMod.apostropheNs.AposObject, 
      js.Any, 
      js.Function0[_], 
      scala.Unit
    ],
    string: js.Function6[
      js.Any, 
      js.Any, 
      java.lang.String, 
      apostropheLib.apostropheMod.apostropheNs.AposObject, 
      js.Any, 
      js.Function0[_], 
      scala.Unit
    ]
  ): Anon_CallbackData = {
    val __obj = js.Dynamic.literal(form = form, string = string)
  
    __obj.asInstanceOf[Anon_CallbackData]
  }
}

