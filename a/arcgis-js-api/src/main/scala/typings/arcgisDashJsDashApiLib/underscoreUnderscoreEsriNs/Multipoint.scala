package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multipoint
  extends Geometry
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.geometryNs.Geometry
     with geometryGeometry {
  /**
    * An array of points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#points)
    */
  var points: js.Array[js.Array[scala.Double]] = js.native
  /**
    * For Multipoint, the type is always `multipoint`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#type)
    */
  @JSName("type")
  val type_Multipoint: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.multipoint = js.native
  /**
    * Adds a point to the Multipoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#addPoint)
    *
    * @param point The point to add to the multipoint. The point can either be a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) or an array of numbers representing XY coordinates.
    *
    */
  def addPoint(point: Point): Multipoint = js.native
  def addPoint(point: js.Array[scala.Double]): Multipoint = js.native
  /**
    * Returns the point at the specified index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#getPoint)
    *
    * @param index The index of the point in the [points](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#points) property.
    *
    */
  def getPoint(index: scala.Double): Point = js.native
  /**
    * Removes a point from the Multipoint. The index specifies which point to remove.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#removePoint)
    *
    * @param index The index of the point to remove.
    *
    */
  def removePoint(index: scala.Double): Point = js.native
  /**
    * Updates the point at the specified index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#setPoint)
    *
    * @param index The index of the point in the [points](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#points) property.
    * @param point Point geometry that specifies the new location.
    *
    */
  def setPoint(index: scala.Double, point: Point): Multipoint = js.native
}

