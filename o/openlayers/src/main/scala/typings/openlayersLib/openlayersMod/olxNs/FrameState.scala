package typings
package openlayersLib.openlayersMod.olxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameState extends js.Object {
  var pixelRatio: scala.Double
  var time: scala.Double
  var viewState: ViewState
}

object FrameState {
  @scala.inline
  def apply(pixelRatio: scala.Double, time: scala.Double, viewState: ViewState): FrameState = {
    val __obj = js.Dynamic.literal(pixelRatio = pixelRatio, time = time, viewState = viewState)
  
    __obj.asInstanceOf[FrameState]
  }
}

