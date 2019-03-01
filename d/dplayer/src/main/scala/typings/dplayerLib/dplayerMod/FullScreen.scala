package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullScreen extends js.Object {
  def cancel(`type`: FullScreenType): scala.Unit
  def request(`type`: FullScreenType): scala.Unit
}

object FullScreen {
  @scala.inline
  def apply(
    cancel: js.Function1[FullScreenType, scala.Unit],
    request: js.Function1[FullScreenType, scala.Unit]
  ): FullScreen = {
    val __obj = js.Dynamic.literal(cancel = cancel, request = request)
  
    __obj.asInstanceOf[FullScreen]
  }
}

