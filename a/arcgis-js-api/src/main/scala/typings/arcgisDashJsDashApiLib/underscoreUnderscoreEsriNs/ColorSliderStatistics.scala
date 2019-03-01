package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSliderStatistics
  extends stdLib.Object {
  /**
    * The average of all data values represented in the color visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#statistics)
    */
  var avg: scala.Double
  /**
    * The maximum of all data values represented in the color visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#statistics)
    */
  var max: scala.Double
  /**
    * The minimum of all data values represented in the color visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#statistics)
    */
  var min: scala.Double
  /**
    * The standard deviation calculated from all data values represented in the color visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#statistics)
    */
  var stddev: scala.Double
}

object ColorSliderStatistics {
  @scala.inline
  def apply(
    avg: scala.Double,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    max: scala.Double,
    min: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    stddev: scala.Double
  ): ColorSliderStatistics = {
    val __obj = js.Dynamic.literal(avg = avg, constructor = constructor, hasOwnProperty = hasOwnProperty, max = max, min = min, propertyIsEnumerable = propertyIsEnumerable, stddev = stddev)
  
    __obj.asInstanceOf[ColorSliderStatistics]
  }
}

