package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationDefaults extends js.Object {
  var response: Variables
  var variables: Variables
}

object OperationDefaults {
  @scala.inline
  def apply(response: Variables, variables: Variables): OperationDefaults = {
    val __obj = js.Dynamic.literal(response = response, variables = variables)
  
    __obj.asInstanceOf[OperationDefaults]
  }
}

