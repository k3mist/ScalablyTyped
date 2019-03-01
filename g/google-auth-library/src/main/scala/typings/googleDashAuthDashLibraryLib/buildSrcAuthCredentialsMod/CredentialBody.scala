package typings
package googleDashAuthDashLibraryLib.buildSrcAuthCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialBody extends js.Object {
  var client_email: js.UndefOr[java.lang.String] = js.undefined
  var private_key: js.UndefOr[java.lang.String] = js.undefined
}

object CredentialBody {
  @scala.inline
  def apply(client_email: java.lang.String = null, private_key: java.lang.String = null): CredentialBody = {
    val __obj = js.Dynamic.literal()
    if (client_email != null) __obj.updateDynamic("client_email")(client_email)
    if (private_key != null) __obj.updateDynamic("private_key")(private_key)
    __obj.asInstanceOf[CredentialBody]
  }
}

