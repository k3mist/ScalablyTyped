package typings
package eurekaDashJsDashClientLib.eurekaDashJsDashClientMod.EurekaClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EurekaMiddlewareConfig extends js.Object {
  def requestMiddleware(requestOpts: js.Any, done: js.Function1[/* opts */ js.Any, scala.Unit]): scala.Unit
}

object EurekaMiddlewareConfig {
  @scala.inline
  def apply(requestMiddleware: js.Function2[js.Any, js.Function1[/* opts */ js.Any, scala.Unit], scala.Unit]): EurekaMiddlewareConfig = {
    val __obj = js.Dynamic.literal(requestMiddleware = requestMiddleware)
  
    __obj.asInstanceOf[EurekaMiddlewareConfig]
  }
}

