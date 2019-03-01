package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStylesOptions extends js.Object {
  /** Sets the options for all polygons. */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.undefined
  /** Sets the options for all polylines. */
  var polylineOptions: js.UndefOr[IPolylineOptions] = js.undefined
  /** Sets the options for all pushpins. */
  var pushpinOptions: js.UndefOr[IPushpinOptions] = js.undefined
}

object IStylesOptions {
  @scala.inline
  def apply(
    polygonOptions: IPolygonOptions = null,
    polylineOptions: IPolylineOptions = null,
    pushpinOptions: IPushpinOptions = null
  ): IStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions)
    if (polylineOptions != null) __obj.updateDynamic("polylineOptions")(polylineOptions)
    if (pushpinOptions != null) __obj.updateDynamic("pushpinOptions")(pushpinOptions)
    __obj.asInstanceOf[IStylesOptions]
  }
}

