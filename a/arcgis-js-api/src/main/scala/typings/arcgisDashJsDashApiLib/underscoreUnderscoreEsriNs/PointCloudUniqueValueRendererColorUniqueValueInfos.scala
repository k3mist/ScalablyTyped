package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudUniqueValueRendererColorUniqueValueInfos
  extends stdLib.Object {
  /**
    * The color used to represent points whose value matches `values`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var color: Color
  /**
    * Label used to describe points matched to the unique value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A unique combination of values that will be represented with the given `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var values: js.Array[java.lang.String]
}

