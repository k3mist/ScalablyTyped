package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamLayerView
  extends LayerView
     with Evented {
  /**
    * The error that explains an unsuccessful attempt to connect to the stream service or an unexpected disconnection from the stream service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#connectionError)
    */
  val connectionError: Error = js.native
  /**
    * The status of the Web Socket connection with the stream service. This property can be watched to see if the connection is lost unexpectedly.  **Possible Values:** connected | disconnected
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#connectionStatus)
    */
  val connectionStatus: java.lang.String = js.native
  /**
    * Contains the attribute and spatial filters used to filter messages sent to the given layer view by a stream service. To change the filter for only a single layer view, use the [updateFilter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#updateFilter) method. The layer view's filter is always updated when the [updateFilter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#updateFilter) method of the associated stream layer instance is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#filter)
    */
  val filter: StreamLayerViewFilter = js.native
  /**
    * Contains the collection of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) visible in the layer view for the live stream. Graphics may be removed from the layer view by calling the [removeAll()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#removeAll) method from [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#graphics)
    */
  var graphics: Collection[Graphic] = js.native
  /**
    * Opens a web socket connection with the stream service to start receiving messages. This is called internally when the StreamLayer is added to a view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#connect)
    *
    *
    */
  def connect(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Closes the web socket connection with the stream service. This is called internally when the StreamLayer is removed from a view. To verify when the connection is closed, watch the [connectionStatus](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#connectionStatus) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#disconnect)
    *
    *
    */
  def disconnect(): scala.Unit = js.native
  @JSName("on")
  def `on_data-received`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`data-received`,
    eventHandler: StreamLayerViewDataReceivedEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * Updates the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#filter) on the StreamLayerView. The filter is updated only on the layer view from which it is called. To update the filter on all layer views generated from a common layer, use the [StreamLayer.updateFilter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#updateFilter) method. If the input `filter` object is `undefined` or `null`, the spatial and attribute filters are removed.  Filter changes only apply to incoming features. Features already displayed in the view will be removed automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#updateFilter)
    *
    * @param filter Updates the spatial and attribute [filters](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#filter). If `null`, all filters are cleared.
    * @param filter.geometry A spatial filter for filtering features. Only features that intersect the given geometry are displayed in the view. If `null`, the spatial filter is cleared.
    * @param filter.where A SQL where clause used to filter features by attributes. If `null`, the attribute filter is cleared.
    *
    */
  def updateFilter(filter: StreamLayerViewUpdateFilterFilter): arcgisDashJsDashApiLib.IPromise[_] = js.native
}

