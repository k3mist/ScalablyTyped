package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonProperties extends GeometryProperties {
  /**
    * The centroid of the polygon. For a polygon with multiple rings, it represents the centroid of the largest ring.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#centroid)
    */
  var centroid: js.UndefOr[PointProperties] = js.undefined
  /**
    * Checks to see if polygon rings cross each other and indicates if the polygon is self-intersecting, which means the ring of the polygon crosses itself.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#isSelfIntersecting)
    */
  var isSelfIntersecting: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of rings. Each ring is a two-dimensional array of numbers representing the coordinates of each vertex in the ring in the spatial reference of the view. The first vertex of each ring should always be the same as the last vertex. Each vertex is an array of two, three, or four numbers. The table below shows the various structures of a vertex array.
    *
    * Case | Vertex array
    * --- | ---
    * [without z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) and [without m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM)| [x, y]
    * [without z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) and [with m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) | [x, y, m]
    * [with z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) and [without m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) | [x, y, z]
    * [with z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) and [with m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) | [x, y, z, m]
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings)
    */
  var rings: js.UndefOr[js.Array[js.Array[js.Array[scala.Double]]]] = js.undefined
}

object PolygonProperties {
  @scala.inline
  def apply(
    centroid: PointProperties = null,
    hasM: js.UndefOr[scala.Boolean] = js.undefined,
    hasZ: js.UndefOr[scala.Boolean] = js.undefined,
    isSelfIntersecting: js.UndefOr[scala.Boolean] = js.undefined,
    rings: js.Array[js.Array[js.Array[scala.Double]]] = null,
    spatialReference: SpatialReferenceProperties = null
  ): PolygonProperties = {
    val __obj = js.Dynamic.literal()
    if (centroid != null) __obj.updateDynamic("centroid")(centroid)
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM)
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ)
    if (!js.isUndefined(isSelfIntersecting)) __obj.updateDynamic("isSelfIntersecting")(isSelfIntersecting)
    if (rings != null) __obj.updateDynamic("rings")(rings)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[PolygonProperties]
  }
}

