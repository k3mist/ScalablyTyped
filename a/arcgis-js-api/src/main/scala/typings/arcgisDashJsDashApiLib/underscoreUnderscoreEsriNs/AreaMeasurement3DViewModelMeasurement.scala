package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaMeasurement3DViewModelMeasurement
  extends stdLib.Object {
  /**
    * The area of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var area: MeasurementValue
  /**
    * Describes the mode in which the measurement was taken. In `euclidean` mode, the area and perimeter length are computed from a flat polygon with straight segments on the perimeter in the [ECEF](https://en.wikipedia.org/wiki/ECEF) coordinate system. In `geodesic` mode, the area and perimeter length are computed from a geodesic polygon on the WGS84 ellipsoid.  **Possible Values:** euclidean | geodesic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var measurementMode: java.lang.String
  /**
    * The perimeter length of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var perimeterLength: MeasurementValue
}

object AreaMeasurement3DViewModelMeasurement {
  @scala.inline
  def apply(
    area: MeasurementValue,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    measurementMode: java.lang.String,
    perimeterLength: MeasurementValue,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): AreaMeasurement3DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(area = area, constructor = constructor, hasOwnProperty = hasOwnProperty, measurementMode = measurementMode, perimeterLength = perimeterLength, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[AreaMeasurement3DViewModelMeasurement]
  }
}

