package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LocationMsg extends js.Object {
  var location: expressDashValidatorLib.checkLocationMod.Location
  var msg: js.Any
  var param: java.lang.String
  var value: js.Any
}

object Anon_LocationMsg {
  @scala.inline
  def apply(
    location: expressDashValidatorLib.checkLocationMod.Location,
    msg: js.Any,
    param: java.lang.String,
    value: js.Any
  ): Anon_LocationMsg = {
    val __obj = js.Dynamic.literal(location = location, msg = msg, param = param, value = value)
  
    __obj.asInstanceOf[Anon_LocationMsg]
  }
}

