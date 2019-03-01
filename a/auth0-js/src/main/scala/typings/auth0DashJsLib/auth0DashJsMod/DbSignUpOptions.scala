package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbSignUpOptions extends js.Object {
  var connection: java.lang.String
  var email: java.lang.String
  var password: java.lang.String
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var user_metadata: js.UndefOr[js.Any] = js.undefined
}

object DbSignUpOptions {
  @scala.inline
  def apply(
    connection: java.lang.String,
    email: java.lang.String,
    password: java.lang.String,
    scope: java.lang.String = null,
    user_metadata: js.Any = null
  ): DbSignUpOptions = {
    val __obj = js.Dynamic.literal(connection = connection, email = email, password = password)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (user_metadata != null) __obj.updateDynamic("user_metadata")(user_metadata)
    __obj.asInstanceOf[DbSignUpOptions]
  }
}

