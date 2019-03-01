package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityDescriptor extends js.Object {
  /**
    * The unique identifier for this identity, not exceeding 256 chars, which will be persisted.
    */
  var identifier: java.lang.String
  /**
    * Type of descriptor (for example, Windows, Passport, etc.).
    */
  var identityType: java.lang.String
}

object IdentityDescriptor {
  @scala.inline
  def apply(identifier: java.lang.String, identityType: java.lang.String): IdentityDescriptor = {
    val __obj = js.Dynamic.literal(identifier = identifier, identityType = identityType)
  
    __obj.asInstanceOf[IdentityDescriptor]
  }
}

