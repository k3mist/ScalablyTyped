package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the attributes for a chart trendline object.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTrendline")
@js.native
class ChartTrendline ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the number of periods that the trendline extends backward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var backwardPeriod: scala.Double = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartTrendline: RequestContext = js.native
  /**
    *
    * Represents the formatting of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  val format: ChartTrendlineFormat = js.native
  /**
    *
    * Represents the number of periods that the trendline extends forward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var forwardPeriod: scala.Double = js.native
  /**
    *
    * Represents the intercept value of the trendline. Can be set to a numeric value or an empty string (for automatic values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var intercept: js.Any = js.native
  /**
    *
    * Represents the label of a chart trendline.
    *
    * [Api set: ExcelApi 1.8]
    */
  val label: ChartTrendlineLabel = js.native
  /**
    *
    * Represents the period of a chart trendline. Only applicable for trendline with MovingAverage type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var movingAveragePeriod: scala.Double = js.native
  /**
    *
    * Represents the name of the trendline. Can be set to a string value, or can be set to null value represents automatic values. The returned value is always a string
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: java.lang.String = js.native
  /**
    *
    * Represents the order of a chart trendline. Only applicable for trendline with Polynomial type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var polynomialOrder: scala.Double = js.native
  /**
    *
    * True if the equation for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showEquation: scala.Boolean = js.native
  /**
    *
    * True if the R-squared for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRSquared: scala.Boolean = js.native
  /**
    *
    * Represents the type of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: ChartTrendlineType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Linear | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Exponential | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Logarithmic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MovingAverage | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Polynomial | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Power = js.native
  /**
    *
    * Delete the trendline object.
    *
    * [Api set: ExcelApi 1.7]
    */
  def delete(): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartTrendline` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartTrendline` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartTrendline` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTrendline = js.native
  def load(option: java.lang.String): ChartTrendline = js.native
  def load(option: js.Array[java.lang.String]): ChartTrendline = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): ChartTrendline = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartTrendlineLoadOptions): ChartTrendline = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartTrendline): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartTrendline): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartTrendlineUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartTrendlineUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartTrendline object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTrendlineData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartTrendlineData = js.native
}

