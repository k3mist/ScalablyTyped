package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueProperties extends js.Object {
  /**
    * An array of strings, with each string containing the name of a field to display in the chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Value.html#fields)
    */
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A string containing the name of a field. The values of all fields in the chart will be normalized (divided) by the value of this field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Value.html#normalizeField)
    */
  var normalizeField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of [Series](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Series.html) objects which provide information of x/y data data that is plotted in a chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Value.html#series)
    */
  var series: js.UndefOr[js.Array[SeriesProperties]] = js.undefined
  /**
    * Used for chart values. Defines a new Dojo theme, only valid for chart types. View the [Dojox Charting Theme Preview](https://download.dojotoolkit.org/release-1.10.0/dojo-release-1.10.0/dojox/charting/tests/theme_preview.html) to see some of the theme options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Value.html#theme)
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * String value indicating the tooltip for a chart specified from another field. This field is needed when related records are not used. It is used for showing tooltips from another field in the same layer or related layer/table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart-Value.html#tooltipField)
    */
  var tooltipField: js.UndefOr[java.lang.String] = js.undefined
}

