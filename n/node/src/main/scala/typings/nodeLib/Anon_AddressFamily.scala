package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressFamily extends js.Object {
  var address: java.lang.String
  var family: scala.Double
}

object Anon_AddressFamily {
  @scala.inline
  def apply(address: java.lang.String, family: scala.Double): Anon_AddressFamily = {
    val __obj = js.Dynamic.literal(address = address, family = family)
  
    __obj.asInstanceOf[Anon_AddressFamily]
  }
}

