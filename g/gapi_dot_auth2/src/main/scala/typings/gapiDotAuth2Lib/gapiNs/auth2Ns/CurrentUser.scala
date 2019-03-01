package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentUser extends js.Object {
  /**
    * Returns a GoogleUser object that represents the current user. Note that in a newly-initialized
    * GoogleAuth instance, the current user has not been set. Use the currentUser.listen() method or the
    * GoogleAuth.then() to get an initialized GoogleAuth instance.
    */
  def get(): GoogleUser
  /**
    * Listen for changes in currentUser.
    */
  def listen(listener: js.Function1[/* user */ GoogleUser, _]): scala.Unit
}

object CurrentUser {
  @scala.inline
  def apply(
    get: js.Function0[GoogleUser],
    listen: js.Function1[js.Function1[/* user */ GoogleUser, _], scala.Unit]
  ): CurrentUser = {
    val __obj = js.Dynamic.literal(get = get, listen = listen)
  
    __obj.asInstanceOf[CurrentUser]
  }
}

