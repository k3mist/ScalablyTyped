package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// scheduler/Tracing
trait Interaction extends js.Object {
  var __count: scala.Double
  var id: scala.Double
  var name: java.lang.String
  var timestamp: scala.Double
}

object Interaction {
  @scala.inline
  def apply(__count: scala.Double, id: scala.Double, name: java.lang.String, timestamp: scala.Double): Interaction = {
    val __obj = js.Dynamic.literal(__count = __count, id = id, name = name, timestamp = timestamp)
  
    __obj.asInstanceOf[Interaction]
  }
}

