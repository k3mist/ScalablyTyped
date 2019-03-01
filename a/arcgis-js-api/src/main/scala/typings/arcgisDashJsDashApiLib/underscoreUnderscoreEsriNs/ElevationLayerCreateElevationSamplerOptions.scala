package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationLayerCreateElevationSamplerOptions
  extends stdLib.Object {
  /**
    * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`). See [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation) for more details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#createElevationSampler)
    *
    * @default auto
    */
  var demResolution: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The value to use when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#createElevationSampler)
    *
    * @default 0
    */
  var noDataValue: js.UndefOr[scala.Double] = js.undefined
}

object ElevationLayerCreateElevationSamplerOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    demResolution: scala.Double | java.lang.String = null,
    noDataValue: scala.Int | scala.Double = null
  ): ElevationLayerCreateElevationSamplerOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (demResolution != null) __obj.updateDynamic("demResolution")(demResolution.asInstanceOf[js.Any])
    if (noDataValue != null) __obj.updateDynamic("noDataValue")(noDataValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationLayerCreateElevationSamplerOptions]
  }
}

