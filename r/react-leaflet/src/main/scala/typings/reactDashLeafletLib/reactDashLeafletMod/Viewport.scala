package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewport extends js.Object {
  var center: js.UndefOr[(js.Tuple2[scala.Double, scala.Double]) | scala.Null]
  var zoom: js.UndefOr[scala.Double | scala.Null]
}

object Viewport {
  @scala.inline
  def apply(center: js.Tuple2[scala.Double, scala.Double] = null, zoom: scala.Int | scala.Double = null): Viewport = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
}

