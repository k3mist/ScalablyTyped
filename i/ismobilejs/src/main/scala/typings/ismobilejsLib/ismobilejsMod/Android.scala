package typings
package ismobilejsLib.ismobilejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Android extends js.Object {
  var device: scala.Boolean
  var phone: scala.Boolean
  var tablet: scala.Boolean
}

object Android {
  @scala.inline
  def apply(device: scala.Boolean, phone: scala.Boolean, tablet: scala.Boolean): Android = {
    val __obj = js.Dynamic.literal(device = device, phone = phone, tablet = tablet)
  
    __obj.asInstanceOf[Android]
  }
}

