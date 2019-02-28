package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelClassProperties extends js.Object {
  /**
    * Defines the content of label text for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html). If working with [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), use [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) instead.  Attribute values may be included in labels using SQL syntax. To include an attribute value in a label, wrap the name of the field in square brackets `[]`. See the example snippet below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression)
    */
  var labelExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the content of label text for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). If working with [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html), use [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    */
  var labelExpressionInfo: js.UndefOr[LabelClassLabelExpressionInfo] = js.undefined
  /**
    * The position of the label. Possible values are based on the feature type. This property requires a value.  **Possible Values (Points):** above-center | above-left | above-right | below-center | below-left | below-right | center-center | center-left | center-right  **Possible Values (Polylines):**  above-after | above-along | above-before | above-start | above-end | below-after | below-along | below-before | below-start | below-end | center-after | center-along | center-before | center-start | center-end  **Possible Values (Polygons):** always-horizontal
    * > **Known Limitations**
    *   * Currently, if the label has a [line callout](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html) in a 3D SceneView, then only `above-center` is supported.
    *   * Label placement only applies to [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) layers in 3D SceneViews.
    *   * [Polylines](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) only support `center-along` label placement in 2D MapViews.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPlacement)
    *
    * @default null
    */
  var labelPlacement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum scale (most zoomed in) at which labels are visible in the view. A value of `0` means the label's visibility does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale)
    *
    * @default 0
    */
  var maxScale: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum scale (most zoomed out) at which labels are visible in the view. A value of `0` means the label's visibility does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale)
    *
    * @default 0
    */
  var minScale: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines the symbol used for rendering the label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#symbol)
    */
  var symbol: js.UndefOr[TextSymbolProperties | LabelSymbol3DProperties] = js.undefined
  /**
    * Indicates whether to use domain names if the fields in the [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) or [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) have domains.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#useCodedValues)
    */
  var useCodedValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A SQL where clause used to determine the features to which the label class should be applied. When specified, only features evaluating to `true` based on this expression will be labeled.
    * > **Known Limitations**  Only very basic SQL is currently supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where)
    */
  var where: js.UndefOr[java.lang.String] = js.undefined
}

