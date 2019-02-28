package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitTestResult
  extends stdLib.Object {
  /**
    * An array of result objects returned from the [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest). Results are returned when the location of the input screen coordinates intersect a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the view. See the table below for the specification of each object in this array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#HitTestResult)
    */
  var results: js.Array[HitTestResultResults]
}

