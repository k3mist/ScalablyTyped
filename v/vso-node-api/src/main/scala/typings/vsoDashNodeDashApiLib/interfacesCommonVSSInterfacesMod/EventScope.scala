package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventScope extends js.Object {
  /**
    * Required: This is the identity of the scope for the type.
    */
  var id: java.lang.String
  /**
    * Optional: The display name of the scope
    */
  var name: java.lang.String
  /**
    * Required: The event specific type of a scope.
    */
  var `type`: java.lang.String
}

object EventScope {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, `type`: java.lang.String): EventScope = {
    val __obj = js.Dynamic.literal(id = id, name = name, `type` = `type`)
  
    __obj.asInstanceOf[EventScope]
  }
}

