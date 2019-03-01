package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User in context
  */
trait User extends js.Object {
  /**
    * Fetch the current user information from server. The library expects the userId to be of the format "ResourceType/Id"
    */
  def read(): js.Promise[Response]
}

object User {
  @scala.inline
  def apply(read: js.Function0[js.Promise[Response]]): User = {
    val __obj = js.Dynamic.literal(read = read)
  
    __obj.asInstanceOf[User]
  }
}

