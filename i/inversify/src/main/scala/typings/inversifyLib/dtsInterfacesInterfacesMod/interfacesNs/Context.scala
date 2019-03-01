package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var container: Container
  var currentRequest: Request
  var id: scala.Double
  var plan: Plan
  def addPlan(plan: Plan): scala.Unit
  def setCurrentRequest(request: Request): scala.Unit
}

object Context {
  @scala.inline
  def apply(
    addPlan: js.Function1[Plan, scala.Unit],
    container: Container,
    currentRequest: Request,
    id: scala.Double,
    plan: Plan,
    setCurrentRequest: js.Function1[Request, scala.Unit]
  ): Context = {
    val __obj = js.Dynamic.literal(addPlan = addPlan, container = container, currentRequest = currentRequest, id = id, plan = plan, setCurrentRequest = setCurrentRequest)
  
    __obj.asInstanceOf[Context]
  }
}

