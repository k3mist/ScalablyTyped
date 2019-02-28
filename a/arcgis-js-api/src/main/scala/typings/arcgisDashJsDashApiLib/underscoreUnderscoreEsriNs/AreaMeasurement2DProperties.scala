package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaMeasurement2DProperties extends WidgetProperties {
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.  **Possible Values:** metric | imperial | square-inches | square-feet | square-us-feet | square-yards | square-miles | square-meters | square-kilometers | acres | ares | hectares
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#unit)
    */
  var unit: js.UndefOr[
    arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.metric | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.imperial | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-inches` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-feet` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-us-feet` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-yards` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-miles` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-meters` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-kilometers` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.acres | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.ares | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.hectares
  ] = js.undefined
  /**
    * List of available units and unit systems (imperial, metric) for displaying the area values. By default, the following units are included: `metric`, `imperial`, `square-inches`, `square-feet`, `square-us-feet`, `square-yards`, `square-miles`, `square-meters`, `square-kilometers`, `acres`, `ares`, `hectares`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#unitOptions)
    */
  var unitOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [AreaMeasurement2DViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#viewModel)
    */
  var viewModel: js.UndefOr[AreaMeasurement2DViewModel] = js.undefined
}

