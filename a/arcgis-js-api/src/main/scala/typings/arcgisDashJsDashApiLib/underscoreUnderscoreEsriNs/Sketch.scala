package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sketch extends Widget {
  /**
    * Returns the name of the active tool associated with the Sketch widget instance.  **Possible Values:** point | polyline | polygon | circle | rectangle | move | transform | reshape
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#activeTool)
    */
  val activeTool: java.lang.String = js.native
  /**
    * The graphic that is being created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#createGraphic)
    */
  val createGraphic: Graphic = js.native
  /**
    * The Sketch widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#iconClass)
    */
  val iconClass: java.lang.String = js.native
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the Sketch widget. The Sketch widget adds new [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) to this layer or can only update graphics stored in this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layer)
    */
  var layer: GraphicsLayer = js.native
  /**
    * Determines the layout/orientation of the Sketch widget.  **Possible Values:** vertical | horizontal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layout)
    *
    * @default horizontal
    */
  var layout: java.lang.String = js.native
  /**
    * The Sketch widget's state.  **Possible Values:** ready | disabled | active
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#state)
    */
  val state: java.lang.String = js.native
  /**
    * An array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) that are being updated by the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#updateGraphics)
    */
  val updateGraphics: Collection[Graphic] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Set this to link the Sketch widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#view)
    */
  var view: MapView = js.native
  /**
    * The view model for the Sketch widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [SketchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html) class to access all properties and methods on the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#viewModel)
    */
  var viewModel: SketchViewModel = js.native
  /**
    * The Sketch widget's default label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#widgetLabel)
    */
  val widgetLabel: java.lang.String = js.native
  /**
    * Cancels the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event:create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event:update) event and changes the event's state to `cancel`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#cancel)
    *
    *
    */
  def cancel(): scala.Unit = js.native
  /**
    * Completes the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event:create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event:update) event and changes the event's state to `complete`. If called in midst of create operation, `complete()` finishes the active create operation and keeps the valid geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#complete)
    *
    *
    */
  def complete(): scala.Unit = js.native
  /**
    * Create a graphic with a geometry specified in `tool`. When first vertex of the graphic is added, [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event:create) event will start firing.  **Note:** Creating a circle geometry does not work in all spatial references.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create)
    *
    * @param tool Name of the create tool. Specifies the geometry type for the graphic to be created.  **Possible Values:** point | polyline | polygon | rectangle | circle
    * @param createOptions Options for the graphic to be created.
    * @param createOptions.mode
    * Specifies how the graphic can be created. The create mode applies only when creating `polygon`, `polyline`, `rectangle` and `circle` geometries.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | Vertices are added while the pointer is clicked or dragged. Applies to and is the default for `polygon` and `polyline`.
    * freehand | Vertices are added while the pointer is dragged. Applies to `polygon`, `polyline` `rectangle` and `circle`. Default for `rectangle` and `circle`.
    * click | Vertices are added when the pointer is clicked.
    *
    */
  def create(tool: java.lang.String): scala.Unit = js.native
  def create(tool: java.lang.String, createOptions: SketchCreateCreateOptions): scala.Unit = js.native
  /**
    * Incrementally redo actions recorded in the stack. Calling this method will fire the [redo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event:redo) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#redo)
    *
    *
    */
  def redo(): scala.Unit = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#render)
    *
    *
    */
  def render(): js.Any = js.native
  /**
    * Resets the Sketch widget to prepare for another create operation. Reset discards the current sketch, if called in middle of create operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#reset)
    *
    *
    */
  def reset(): scala.Unit = js.native
  /**
    * Incrementally undo actions recorded in the stack. Calling this method will fire the [undo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event:undo) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#undo)
    *
    *
    */
  def undo(): scala.Unit = js.native
  /**
    * Initializes an update operation for the specified graphic(s) and fires [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event:update) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @param graphics An array of graphics to be updated. Only graphics added to the Sketch widget's [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layer) property can be updated.
    * @param updateOptions Update options for the graphics to be updated.
    * @param updateOptions.tool
    * Name of the update tool. Specifies the update operation for the selected graphics.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * transform | The *default* tool for graphics with [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) and [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries. It allows one or multiple graphics to be scaled, rotated and moved by default. Its default behavior can be changed by setting `enableRotation`, `enableScaling` or `preserveAspectRatio` properties when calling `update` method or setting them on [defaultUpdateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions) property when the Sketch widget initializes. This tool does not apply if selected graphics have only [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries.
    * reshape | It allows the entire graphic or individual vertices of the graphic to be moved. Vertices can be added or removed. This tool can only be used with one graphic and the graphic's geometry has to be [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) or [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html).
    * move | The *default* tool for graphics with [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries. It should be used for specific cases where you just want to move selected `polygon` and `polyline` graphics without additional options. Additionally, the `move` tool does not support toggling to different modes, since `move` operation is already built into both `transform` and `reshape` tools by default.
    * @param updateOptions.enableRotation Indicates if the `rotation` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    * @param updateOptions.enableScaling Indicates if the `scale` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    * @param updateOptions.preserveAspectRatio Indicates if the uniform scale operation will be enabled when updating graphics. `enableScaling` must be set `true` when setting this property to `true`. Only applies if `tool` is `transform`.
    * @param updateOptions.toggleToolOnClick Indicates if the graphic being updated can be toggled between `transform` and `reshape` update options.
    *
    */
  def update(graphics: js.Array[Graphic]): scala.Unit = js.native
  def update(graphics: js.Array[Graphic], updateOptions: SketchUpdateUpdateOptions): scala.Unit = js.native
}

