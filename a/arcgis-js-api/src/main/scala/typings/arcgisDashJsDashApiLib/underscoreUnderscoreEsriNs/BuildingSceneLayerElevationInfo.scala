package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingSceneLayerElevationInfo
  extends stdLib.Object {
  /**
    * Defines how features are placed on the vertical axis (z). Currently only `absolute-height` mode is supported.
    *
    * Mode | Description
    * ------|------------
    * absolute-height | Features are placed at an absolute elevation (z-value) above sea level. This z-value is determined by summing up the `offset` value and the point's z-value. It doesn't take the elevation of the terrain into account. This is the only supported elevation mode for a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#elevationInfo)
    */
  var mode: java.lang.String
  /**
    * An elevation offset, which is added to the vertical position of each feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#elevationInfo)
    *
    * @default 0
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The unit for `offset` values.  **Possible Values:** feet | meters | kilometers | miles | us-feet | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#elevationInfo)
    *
    * @default meters
    */
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

