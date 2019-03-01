package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathElevationRequest extends js.Object {
  var path: js.UndefOr[js.Array[LatLng]] = js.undefined
  var samples: js.UndefOr[scala.Double] = js.undefined
}

object PathElevationRequest {
  @scala.inline
  def apply(path: js.Array[LatLng] = null, samples: scala.Int | scala.Double = null): PathElevationRequest = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    if (samples != null) __obj.updateDynamic("samples")(samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathElevationRequest]
  }
}

