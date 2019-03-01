package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.setNetworkChangeCallback()
trait NetworkChangeResult extends js.Object {
  var isConnected: scala.Boolean
  var `type`: scala.Double
}

object NetworkChangeResult {
  @scala.inline
  def apply(isConnected: scala.Boolean, `type`: scala.Double): NetworkChangeResult = {
    val __obj = js.Dynamic.literal(isConnected = isConnected, `type` = `type`)
  
    __obj.asInstanceOf[NetworkChangeResult]
  }
}

