package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoJsonObject extends js.Object {
  /** Geometric coordinates of the object */
  var coordinates: js.UndefOr[
    js.Array[scala.Double] | js.Array[js.Array[scala.Double]] | js.Array[js.Array[js.Array[scala.Double]]] | js.Array[js.Array[js.Array[js.Array[scala.Double]]]]
  ] = js.undefined
  /** Set of features (only applicable if the type is 'featurecollection') */
  var features: js.UndefOr[js.Array[IGeoJsonObject]] = js.undefined
  /** Set of geometries (only applicable if the type is 'geometrycollection') */
  var geometries: js.UndefOr[js.Array[IGeoJsonObject]] = js.undefined
  /** Geometry (only applicable if the type is 'feature') */
  var geometry: js.UndefOr[IGeoJsonObject] = js.undefined
  /** identifier of a feature (only applicable if the type is 'feature') */
  var id: js.UndefOr[js.Any] = js.undefined
  /** Additional properties of the object as a key,value pair */
  var properties: js.UndefOr[js.Any] = js.undefined
  /** 
    * Type of the object 
    * could be one of the following: 
    * Point
    * LineString
    * Polygon
    * MultiPoint
    * MultiLineString
    * MultiPolygon
    * GeometryCollection
    * Feature
    * FeatureCollection 
    */
  var `type`: java.lang.String
}

object IGeoJsonObject {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    coordinates: js.Array[scala.Double] | js.Array[js.Array[scala.Double]] | js.Array[js.Array[js.Array[scala.Double]]] | js.Array[js.Array[js.Array[js.Array[scala.Double]]]] = null,
    features: js.Array[IGeoJsonObject] = null,
    geometries: js.Array[IGeoJsonObject] = null,
    geometry: IGeoJsonObject = null,
    id: js.Any = null,
    properties: js.Any = null
  ): IGeoJsonObject = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features)
    if (geometries != null) __obj.updateDynamic("geometries")(geometries)
    if (geometry != null) __obj.updateDynamic("geometry")(geometry)
    if (id != null) __obj.updateDynamic("id")(id)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IGeoJsonObject]
  }
}

