package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaMeasurement2DViewModel extends js.Object {
  /**
    * The threshold distance used by the "auto" mode to switch between planar and geodesic linear computations. The threshold is measured in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#geodesicDistanceThreshold)
    *
    * @default 100000
    */
  var geodesicDistanceThreshold: scala.Double
  /**
    * The area and perimeter of the measurement polygon in square meters and meters respectively.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement)
    */
  val measurement: AreaMeasurement2DViewModelMeasurement
  /**
    * This property returns the locale specific representation of the area and perimeter. Areas and perimeters are rounded to two decimal places. Areas are sourced from the [measurement](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurement) property (in square meters) and converted to the user defined units/system and mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#measurementLabel)
    */
  val measurementLabel: AreaMeasurement2DViewModelMeasurementLabel
  /**
    * The mode used to calculate the area and perimeter of a polygon.  **Possible Values:** auto | planar | geodesic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#mode)
    *
    * @default auto
    */
  var mode: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.auto | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.planar | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.geodesic
  /**
    * An array of valid mode values. By default, the following units are included: `auto`, `planar`, `geodesic`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#modes)
    */
  val modes: js.Array[java.lang.String]
  /**
    * The ViewModel's state.  **Possible Values:** disabled | ready | measuring
    *
    *    Value    | Description
    * ------------|-------------
    * disabled    | not ready yet
    * ready       | ready for measuring
    * measuring   | measuring has started
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#state)
    *
    * @default disabled
    */
  val state: java.lang.String
  /**
    * Unit system (imperial, metric) or specific unit used for displaying the area values.  **Possible Values:** metric | imperial | square-inches | square-feet | square-us-feet | square-yards | square-miles | square-meters | square-kilometers | acres | ares | hectares
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unit)
    */
  var unit: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.metric | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.imperial | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-inches` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-feet` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-us-feet` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-yards` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-miles` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-meters` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`square-kilometers` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.acres | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.ares | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.hectares
  /**
    * List of available units and unit systems (imperial, metric) for displaying the area values. By default, the following units are included: `metric`, `imperial`, `square-inches`, `square-feet`, `square-us-feet`, `square-yards`, `square-miles`, `square-meters`, `square-kilometers`, `acres`, `ares`, `hectares`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#unitOptions)
    */
  var unitOptions: js.Array[java.lang.String]
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#view)
    */
  var view: MapView
  /**
    * Clears the current measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#clearMeasurement)
    *
    *
    */
  def clearMeasurement(): scala.Unit
  /**
    * Starts a new measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D-AreaMeasurement2DViewModel.html#newMeasurement)
    *
    *
    */
  def newMeasurement(): scala.Unit
}

