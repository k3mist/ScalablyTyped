package typings
package reactDashRouterLib.reactDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
}

object RouterProps {
  @scala.inline
  def apply(history: historyLib.historyMod.History[historyLib.historyMod.LocationState]): RouterProps = {
    val __obj = js.Dynamic.literal(history = history)
  
    __obj.asInstanceOf[RouterProps]
  }
}

