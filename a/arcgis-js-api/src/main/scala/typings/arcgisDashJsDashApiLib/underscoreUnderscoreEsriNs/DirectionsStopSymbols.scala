package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsStopSymbols
  extends stdLib.Object {
  /**
    * The first stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var first: js.UndefOr[Symbol] = js.undefined
  /**
    * The last stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var last: js.UndefOr[Symbol] = js.undefined
  /**
    * The middle stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var middle: js.UndefOr[Symbol] = js.undefined
  /**
    * An unlocated stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var unlocated: js.UndefOr[Symbol] = js.undefined
  /**
    * A waypoint stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var waypoint: js.UndefOr[Symbol] = js.undefined
}

object DirectionsStopSymbols {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    first: Symbol = null,
    last: Symbol = null,
    middle: Symbol = null,
    unlocated: Symbol = null,
    waypoint: Symbol = null
  ): DirectionsStopSymbols = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (first != null) __obj.updateDynamic("first")(first)
    if (last != null) __obj.updateDynamic("last")(last)
    if (middle != null) __obj.updateDynamic("middle")(middle)
    if (unlocated != null) __obj.updateDynamic("unlocated")(unlocated)
    if (waypoint != null) __obj.updateDynamic("waypoint")(waypoint)
    __obj.asInstanceOf[DirectionsStopSymbols]
  }
}

