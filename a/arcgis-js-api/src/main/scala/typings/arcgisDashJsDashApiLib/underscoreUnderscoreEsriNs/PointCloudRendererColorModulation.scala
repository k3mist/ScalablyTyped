package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudRendererColorModulation
  extends stdLib.Object {
  /**
    * Field to use for the color modulation. Commonly modulation is used with the `intensity` field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#colorModulation)
    */
  var field: java.lang.String
  /**
    * Field value at which the point color will be left unchanged.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#colorModulation)
    *
    * @default 255
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Field value at which the point color becomes darkest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#colorModulation)
    *
    * @default 0
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
}

