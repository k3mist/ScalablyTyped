package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  val location: HistoryLocation = js.native
  @JSName("navigate")
  var navigate_Original: NavigateFn = js.native
  val transitioning: scala.Boolean = js.native
  def listen(listener: HistoryListener): HistoryUnsubscribe = js.native
  def navigate(to: java.lang.String): scala.Unit = js.native
  def navigate(to: java.lang.String, options: NavigateOptions[js.Object]): scala.Unit = js.native
}

