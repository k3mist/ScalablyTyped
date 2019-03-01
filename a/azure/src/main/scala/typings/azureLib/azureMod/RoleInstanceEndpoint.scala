package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleInstanceEndpoint extends js.Object {
  var address: java.lang.String
  var port: scala.Double
  var protocol: java.lang.String
}

object RoleInstanceEndpoint {
  @scala.inline
  def apply(address: java.lang.String, port: scala.Double, protocol: java.lang.String): RoleInstanceEndpoint = {
    val __obj = js.Dynamic.literal(address = address, port = port, protocol = protocol)
  
    __obj.asInstanceOf[RoleInstanceEndpoint]
  }
}

