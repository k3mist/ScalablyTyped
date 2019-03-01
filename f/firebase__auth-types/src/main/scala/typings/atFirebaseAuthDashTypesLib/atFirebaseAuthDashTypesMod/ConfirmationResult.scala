package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmationResult extends js.Object {
  var verificationId: java.lang.String
  def confirm(verificationCode: java.lang.String): js.Promise[UserCredential]
}

object ConfirmationResult {
  @scala.inline
  def apply(
    confirm: js.Function1[java.lang.String, js.Promise[UserCredential]],
    verificationId: java.lang.String
  ): ConfirmationResult = {
    val __obj = js.Dynamic.literal(confirm = confirm, verificationId = verificationId)
  
    __obj.asInstanceOf[ConfirmationResult]
  }
}

