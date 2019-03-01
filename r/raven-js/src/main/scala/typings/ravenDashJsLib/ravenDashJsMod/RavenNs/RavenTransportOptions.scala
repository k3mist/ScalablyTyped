package typings
package ravenDashJsLib.ravenDashJsMod.RavenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RavenTransportOptions extends js.Object {
  var auth: ravenDashJsLib.Anon_Sentryclient
  var data: js.Any
  var url: java.lang.String
  def onError(error: stdLib.Error with ravenDashJsLib.Anon_Request): scala.Unit
  def onSuccess(): scala.Unit
}

object RavenTransportOptions {
  @scala.inline
  def apply(
    auth: ravenDashJsLib.Anon_Sentryclient,
    data: js.Any,
    onError: js.Function1[stdLib.Error with ravenDashJsLib.Anon_Request, scala.Unit],
    onSuccess: js.Function0[scala.Unit],
    url: java.lang.String
  ): RavenTransportOptions = {
    val __obj = js.Dynamic.literal(auth = auth, data = data, onError = onError, onSuccess = onSuccess, url = url)
  
    __obj.asInstanceOf[RavenTransportOptions]
  }
}

