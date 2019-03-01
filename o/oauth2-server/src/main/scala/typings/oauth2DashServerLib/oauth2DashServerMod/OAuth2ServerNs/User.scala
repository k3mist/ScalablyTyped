package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface representing the user.
  * A user object is completely transparent to oauth2-server and is simply used as input to model functions.
  */
trait User
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object User {
  @scala.inline
  def apply(StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null): User = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[User]
  }
}

