package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleEventInfo
  extends stdLib.Object
     with UpdateToolEventInfo {
  /**
    * Returns information indicating the stage of the scale operation.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * scale-start | The type changes to `scale-start` at the start of scale or resize operation.
    * scale | The type changes to `scale` while graphics are being scaled or resized.
    * scale-stop | The type changes to `scale-stop` once graphics are scaled or resized.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var `type`: java.lang.String
  /**
    * The x scale factor used to enlarge or shrink the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var xScale: scala.Double
  /**
    * The y scale factor used to enlarge or shrink the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var yScale: scala.Double
}

