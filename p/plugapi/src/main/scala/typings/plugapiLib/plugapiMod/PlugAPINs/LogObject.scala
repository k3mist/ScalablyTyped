package typings
package plugapiLib.plugapiMod.PlugAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogObject extends js.Object {
  def log(): scala.Unit
}

object LogObject {
  @scala.inline
  def apply(log: js.Function0[scala.Unit]): LogObject = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[LogObject]
  }
}

