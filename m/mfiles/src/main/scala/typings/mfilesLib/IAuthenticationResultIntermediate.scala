package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthenticationResultIntermediate extends js.Object {
  val AttemptIdentifier: java.lang.String
  val AuthenticationData: INamedValues
}

object IAuthenticationResultIntermediate {
  @scala.inline
  def apply(AttemptIdentifier: java.lang.String, AuthenticationData: INamedValues): IAuthenticationResultIntermediate = {
    val __obj = js.Dynamic.literal(AttemptIdentifier = AttemptIdentifier, AuthenticationData = AuthenticationData)
  
    __obj.asInstanceOf[IAuthenticationResultIntermediate]
  }
}

