package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreasAndLengthsParametersProperties extends js.Object {
  /**
    * The area unit in which areas of polygons will be calculated. Use the strings listed below or [any other valid area unit](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.AreaUnit.Code.ACRE).  **Possible Values:** acres | hectares | square-miles | square-kilometers | square-meters | square-feet | square-yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#areaUnit)
    */
  var areaUnit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the type of calculation for the geometry. The type can be one of the following:
    *
    * Value | Description
    * ------|------------
    * planar | Planar measurements use 2D Cartesian mathematics to calculate length. Use this type if the length needs to be calculated in the input spatial reference. Otherwise use `preserveShape`.
    * geodesic | Use this type to calculate an area or length using only the vertices of the polygon to define the lines connecting the vertices as geodesic segments independent of the actual shape of the polygon. **Note:** a geodesic segment is the shortest path between two points on an ellipsoid.
    * preserve-shape | Calculate the area or length of the geometry on the surface of the Earth ellipsoid (for geometries defined in a projected or geographic coordinate system). This method preserves the shape of the geometry in its coordinate system, which means the true area or length will be calculated for the geometry that is displayed on the map.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#calculationType)
    */
  var calculationType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The length unit in which perimeters of polygons will be calculated. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER).  **Possible Values:** feet | kilometers | meters | miles | nautical-miles | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Polygon geometries for which to compute areas and lengths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#polygons)
    */
  var polygons: js.UndefOr[js.Array[PolygonProperties]] = js.undefined
}

object AreasAndLengthsParametersProperties {
  @scala.inline
  def apply(
    areaUnit: java.lang.String = null,
    calculationType: java.lang.String = null,
    lengthUnit: java.lang.String = null,
    polygons: js.Array[PolygonProperties] = null
  ): AreasAndLengthsParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (areaUnit != null) __obj.updateDynamic("areaUnit")(areaUnit)
    if (calculationType != null) __obj.updateDynamic("calculationType")(calculationType)
    if (lengthUnit != null) __obj.updateDynamic("lengthUnit")(lengthUnit)
    if (polygons != null) __obj.updateDynamic("polygons")(polygons)
    __obj.asInstanceOf[AreasAndLengthsParametersProperties]
  }
}

