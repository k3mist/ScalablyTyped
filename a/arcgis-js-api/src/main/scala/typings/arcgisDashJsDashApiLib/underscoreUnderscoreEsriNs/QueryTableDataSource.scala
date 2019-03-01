package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTableDataSource
  extends stdLib.Object {
  /**
    * The geometry type of each record in the table. **Possible Values:** point | multipoint | polyline | polygon | multipatch
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var geometryType: java.lang.String
  /**
    * The field name(s) containing the unique IDs for each record in the table. This can be a comma separated list if the query table is used in a [JoinTableDataSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinDataTableSource).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var oidFields: java.lang.String
  /**
    * The SQL query used to filter records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var query: java.lang.String
  /**
    * The spatial reference of the geometry of each feature in the table source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var spatialReference: SpatialReference
  /**
    * This value is always `query-table` and is inferred when the `query` property of this object is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var `type`: java.lang.String
  /**
    * The workspace where the data resides (defined in ArcGIS Server Manager).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var workspaceId: java.lang.String
}

object QueryTableDataSource {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometryType: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    oidFields: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    query: java.lang.String,
    spatialReference: SpatialReference,
    `type`: java.lang.String,
    workspaceId: java.lang.String
  ): QueryTableDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor, geometryType = geometryType, hasOwnProperty = hasOwnProperty, oidFields = oidFields, propertyIsEnumerable = propertyIsEnumerable, query = query, spatialReference = spatialReference, `type` = `type`, workspaceId = workspaceId)
  
    __obj.asInstanceOf[QueryTableDataSource]
  }
}

