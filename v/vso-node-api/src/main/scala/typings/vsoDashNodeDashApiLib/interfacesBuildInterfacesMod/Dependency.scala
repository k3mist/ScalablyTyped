package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dependency extends js.Object {
  /**
    * The event. The dependency is satisfied when the referenced object emits this event.
    */
  var event: java.lang.String
  /**
    * The scope. This names the object referenced by the dependency.
    */
  var scope: java.lang.String
}

object Dependency {
  @scala.inline
  def apply(event: java.lang.String, scope: java.lang.String): Dependency = {
    val __obj = js.Dynamic.literal(event = event, scope = scope)
  
    __obj.asInstanceOf[Dependency]
  }
}

