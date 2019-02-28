package typings
package falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRoute
  extends Route
     with RouteDefinition {
  def get(pathset: RoutePathSet): RouteResult | js.Promise[RouteResult]
}

