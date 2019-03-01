package typings
package angularDashJwtLib.angularMod.jwtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthManagerServiceProvider extends js.Object {
  def authenticate(): scala.Unit
  def checkAuthOnRefresh(): scala.Unit
  def redirectWhenUnauthenticated(): scala.Unit
  def unauthenticate(): scala.Unit
}

object IAuthManagerServiceProvider {
  @scala.inline
  def apply(
    authenticate: js.Function0[scala.Unit],
    checkAuthOnRefresh: js.Function0[scala.Unit],
    redirectWhenUnauthenticated: js.Function0[scala.Unit],
    unauthenticate: js.Function0[scala.Unit]
  ): IAuthManagerServiceProvider = {
    val __obj = js.Dynamic.literal(authenticate = authenticate, checkAuthOnRefresh = checkAuthOnRefresh, redirectWhenUnauthenticated = redirectWhenUnauthenticated, unauthenticate = unauthenticate)
  
    __obj.asInstanceOf[IAuthManagerServiceProvider]
  }
}

