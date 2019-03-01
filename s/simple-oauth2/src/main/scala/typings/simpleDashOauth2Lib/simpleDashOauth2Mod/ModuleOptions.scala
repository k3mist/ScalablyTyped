package typings
package simpleDashOauth2Lib.simpleDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions[ClientIdName /* <: java.lang.String */] extends js.Object {
  var auth: simpleDashOauth2Lib.Anon_AuthorizeHost
  var client: simpleDashOauth2Lib.Anon_Id[ClientIdName]
  /**
    * Used to set global options to the internal http library (wreck).
    * All options except baseUrl are allowed
    * Defaults to header.Accept = "application/json"
    */
  var http: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[simpleDashOauth2Lib.Anon_AuthorizationMethod] = js.undefined
}

object ModuleOptions {
  @scala.inline
  def apply[ClientIdName /* <: java.lang.String */](
    auth: simpleDashOauth2Lib.Anon_AuthorizeHost,
    client: simpleDashOauth2Lib.Anon_Id[ClientIdName],
    http: js.Object = null,
    options: simpleDashOauth2Lib.Anon_AuthorizationMethod = null
  ): ModuleOptions[ClientIdName] = {
    val __obj = js.Dynamic.literal(auth = auth, client = client)
    if (http != null) __obj.updateDynamic("http")(http)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ModuleOptions[ClientIdName]]
  }
}

