package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uniqueValuesUniqueValuesParams
  extends stdLib.Object {
  /**
    * A subset of features for which to generate the unique values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var features: js.UndefOr[js.Array[Graphic]] = js.undefined
  /**
    * The name of the numeric or string field from which the unique values will be obtained. This property is ignored if a `valueExpression` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The layer from which to query for unique values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer
  /**
    * Indicates that all domain codes should be returned if the given field has domain values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var returnAllCodedValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A SQL expression evaluating to a number or string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var sqlExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var sqlWhere: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number or string. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html#uniqueValues)
    */
  var valueExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance is required when a `valueExpression` is specified.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.undefined
}

