package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSliderProperties extends WidgetteProperties {
  /**
    * Indicates whether to show the handles of the slider that may be dragged by the user. See the image in the [class description](#) to see where handles are typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#handlesVisible)
    *
    * @default true
    */
  var handlesVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The histogram associated with the data represented on the slider. This may be generated using the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) statistics function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#histogram)
    */
  var histogram: js.UndefOr[HistogramResult] = js.undefined
  /**
    * Indicates whether to show the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#histogram) in the slider UI. See the image in the [class description](#) to see where the histogram is typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#histogramVisible)
    *
    * @default true
    */
  var histogramVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The width of the histogram in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#histogramWidth)
    *
    * @default 100
    */
  var histogramWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether to show labels in the slider UI. See the image in the [class description](#) to see where labels are typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum value or upper bound of the slider. This value overrides the `max` property of the [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#statistics), but may not be smaller than the upper value of the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#values) array.  This property may be set programmatically or by the user in the widget's UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#maxValue)
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum value or lower bound of the slider. This value overrides the `min` property of the [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#statistics), but may not be greater than the lower value of the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#values) array.  This property may be set programmatically or by the user in the widget's UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#minValue)
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The summary statistics of the data represented in the slider. This is an object that may be generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) statistics function. The `min` and `max` values in this object determine the [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#minValue) and [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#maxValue) of the slider if values for those properties are not already provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#statistics)
    */
  var statistics: js.UndefOr[SizeSliderStatistics] = js.undefined
  /**
    * Indicates whether to show the average value of features in the dataset in the slider UI. See the image in the [class description](#) to see where this symbol is typically placed. Hover over this symbol to view the average in the tooltip.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#statisticsVisible)
    *
    * @default true
    */
  var statisticsVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The symbol on the slider representing the features in the view. This symbol type should match the symbol type of the appropriate features. This can be an instance of [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), which is the default value, or [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#symbol)
    */
  var symbol: js.UndefOr[SimpleMarkerSymbolProperties | SimpleLineSymbolProperties] = js.undefined
  /**
    * Indicates whether to show tick marks next to the slider handles. See the image in the [class description](#) to see where ticks are typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#ticksVisible)
    *
    * @default true
    */
  var ticksVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The size visual variable represented by the slider. This must be set initially on the slider for it to render in the view. This may be created manually (see snippet below) or generated from the sizeRendererCreator helper methods. A new size visual variable is created each time the user slides handles or changes the [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#minValue) or the [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#maxValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-SizeSlider.html#visualVariable)
    */
  var visualVariable: js.UndefOr[SizeVariableProperties] = js.undefined
}

