package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleRendererProperties
  extends RendererProperties
     with VisualVariablesRendererProperties {
  /**
    * The label for the renderer. This describes what features with the given [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#symbol) represent in the real world. This will display next to the layer's [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#symbol) inside the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.  This text is not displayed in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) when [visualVariables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#visualVariables) are used. When the renderer contains [visualVariables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#visualVariables), you should set the `title` property in `legendOptions` on each visual variable to describe the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#label)
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The symbol used by the renderer to visualize all features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#symbol)
    */
  var symbol: js.UndefOr[SymbolProperties] = js.undefined
}

object SimpleRendererProperties {
  @scala.inline
  def apply(
    authoringInfo: AuthoringInfoProperties = null,
    label: java.lang.String = null,
    symbol: SymbolProperties = null,
    visualVariables: js.Array[VisualVariableProperties] = null
  ): SimpleRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (authoringInfo != null) __obj.updateDynamic("authoringInfo")(authoringInfo)
    if (label != null) __obj.updateDynamic("label")(label)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (visualVariables != null) __obj.updateDynamic("visualVariables")(visualVariables)
    __obj.asInstanceOf[SimpleRendererProperties]
  }
}

