package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributionProperties extends WidgetProperties {
  /**
    * Text used to split attribution by [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html#itemDelimiter)
    *
    * @default |
    */
  var itemDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [AttributionViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html#viewModel)
    */
  var viewModel: js.UndefOr[AttributionViewModelProperties] = js.undefined
}

