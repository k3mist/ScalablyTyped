package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait relationshipCreateRendererParamsLegendOptions
  extends stdLib.Object {
  /**
    * Indicates whether to include the renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    */
  var showLegend: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The title used to describe the renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object relationshipCreateRendererParamsLegendOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    showLegend: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): relationshipCreateRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[relationshipCreateRendererParamsLegendOptions]
  }
}

