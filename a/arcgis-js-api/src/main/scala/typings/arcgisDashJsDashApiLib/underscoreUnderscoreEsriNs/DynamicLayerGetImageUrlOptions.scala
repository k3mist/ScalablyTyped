package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicLayerGetImageUrlOptions
  extends stdLib.Object {
  /**
    * The ratio of the resolution in physical pixels of the image to the resolution it will be displayed at.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DynamicLayer.html#getImageUrl)
    */
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * The rotation in degrees of the exported image. Available since ArcGIS Server 10.3.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DynamicLayer.html#getImageUrl)
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
}

