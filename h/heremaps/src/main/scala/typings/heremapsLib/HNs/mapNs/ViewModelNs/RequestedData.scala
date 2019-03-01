package typings
package heremapsLib.HNs.mapNs.ViewModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines currently requested view data, which will be rendered by the map.
  * @property camera {H.map.ViewModel.CameraData=} - The requested camera properties
  * @property zoom {number=} - The requested zoom level
  * @property animate {boolean=} - indicates if the requested transition should be animated
  */
trait RequestedData extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  var camera: js.UndefOr[CameraData] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object RequestedData {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    camera: CameraData = null,
    zoom: scala.Int | scala.Double = null
  ): RequestedData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (camera != null) __obj.updateDynamic("camera")(camera)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestedData]
  }
}

