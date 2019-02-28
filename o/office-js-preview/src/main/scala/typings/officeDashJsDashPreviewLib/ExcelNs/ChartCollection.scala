package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A collection of all the chart objects on a worksheet.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartCollection")
@js.native
class ChartCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartCollection: RequestContext = js.native
  /**
    *
    * Returns the number of charts in the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val count: scala.Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Chart] = js.native
  /**
    *
    * Occurs when a chart is activated.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onActivated: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ChartActivatedEventArgs] = js.native
  /**
    *
    * Occurs when a new chart is added to the worksheet.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onAdded: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ChartAddedEventArgs] = js.native
  /**
    *
    * Occurs when a chart is deactivated.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onDeactivated: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ChartDeactivatedEventArgs] = js.native
  /**
    *
    * Occurs when a chart is deleted.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onDeleted: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[ChartDeletedEventArgs] = js.native
  /**
    *
    * Creates a new chart.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param type Represents the type of a chart. See Excel.ChartType for details.
    * @param sourceData The Range object corresponding to the source data.
    * @param seriesBy Optional. Specifies the way columns or rows are used as data series on the chart. See Excel.ChartSeriesBy for details.
    */
  def add(
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 82 */ js.Any,
    sourceData: Range
  ): Chart = js.native
  def add(
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 82 */ js.Any,
    sourceData: Range,
    seriesBy: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Auto
  ): Chart = js.native
  def add(
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 82 */ js.Any,
    sourceData: Range,
    seriesBy: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Columns
  ): Chart = js.native
  def add(
    `type`: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 82 */ js.Any,
    sourceData: Range,
    seriesBy: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Rows
  ): Chart = js.native
  /**
    *
    * Creates a new chart.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param type Represents the type of a chart. See Excel.ChartType for details.
    * @param sourceData The Range object corresponding to the source data.
    * @param seriesBy Optional. Specifies the way columns or rows are used as data series on the chart. See Excel.ChartSeriesBy for details.
    */
  def add(`type`: ChartType, sourceData: Range): Chart = js.native
  def add(`type`: ChartType, sourceData: Range, seriesBy: ChartSeriesBy): Chart = js.native
  /**
    *
    * Returns the number of charts in the worksheet.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets a chart using its name. If there are multiple charts with the same name, the first one will be returned.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param name Name of the chart to be retrieved.
    */
  def getItem(name: java.lang.String): Chart = js.native
  /**
    *
    * Gets a chart based on its position in the collection.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: scala.Double): Chart = js.native
  /**
    *
    * Gets a chart using its name. If there are multiple charts with the same name, the first one will be returned.
    If the chart does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param name Name of the chart to be retrieved.
    */
  def getItemOrNullObject(name: java.lang.String): Chart = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): ChartCollection = js.native
  def load(option: java.lang.String): ChartCollection = js.native
  def load(option: js.Array[java.lang.String]): ChartCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): ChartCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ChartCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartCollectionData = js.native
}

