package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var authTokens: js.UndefOr[js.Array[AuthToken]] = js.undefined
  var features: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var userData: js.UndefOr[js.Array[UserData]] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    authTokens: js.Array[AuthToken] = null,
    features: js.Array[java.lang.String] = null,
    password: java.lang.String = null,
    userData: js.Array[UserData] = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (authTokens != null) __obj.updateDynamic("authTokens")(authTokens)
    if (features != null) __obj.updateDynamic("features")(features)
    if (password != null) __obj.updateDynamic("password")(password)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[Account]
  }
}

