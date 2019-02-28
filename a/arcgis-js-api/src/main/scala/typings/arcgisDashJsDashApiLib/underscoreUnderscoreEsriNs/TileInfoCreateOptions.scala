package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileInfoCreateOptions
  extends stdLib.Object {
  /**
    * An array of scale values to use for the TileInfo. If none are specified, the scales from the [ArcGIS Online basemaps](https://www.arcgis.com/home/group.html?id=702026e41f6641fb85da88efe79dc166#overview) are used from level 0 through 24.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    *
    * @default The scales provided by ArcGIS Online basemaps
    */
  var scales: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The size of each tile in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    *
    * @default 256
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * The spatial reference for the new TileInfo instance. If the spatial reference is not WGS84 nor WebMercator, the origin of the TileInfo is `0.0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    *
    * @default WebMercator
    */
  var spatialReference: js.UndefOr[SpatialReference] = js.undefined
}

