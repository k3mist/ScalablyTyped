package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsLayer
  extends Layer
     with ScaleRangeLayer {
  /**
    * Specifies how graphics are placed on the vertical axis (z). This property may only be used in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [ElevationInfo sample](https://developers.arcgis.com/javascript/latest/sample-code/scene-elevationinfo/index.html) for an example of how this property may be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var elevationInfo: GraphicsLayerElevationInfo = js.native
  /**
    * A collection of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the layer. Each graphic is a vector representation of the location of a real-world feature. Each graphic in a single GraphicsLayer may contain either a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), or [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#geometry). In addition, each [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the collection may contain its own [attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#attributes), [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html), and [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).  To add a graphic to the GraphicsLayer use [add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#add), or [GraphicsLayer.graphics.add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#add).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#graphics)
    */
  var graphics: Collection[Graphic] = js.native
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). When `true`, screen sized objects such as [icons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html) or [callouts](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html) integrate better in the 3D scene by applying a certain perspective projection to the sizing of features. This only applies when using a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).  `layer.screenSizePerspectiveEnabled = true`  ![screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-screenSize-perspective.png)  `layer.screenSizePerspectiveEnabled = false`  ![no-screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-no-screenSize-perspective.png)
    * > **Known Limitations**  Screen size perspective is currently not optimized for situations where the camera is very near the ground, or for scenes with point features located far from the ground surface. In these cases it may be better to turn off screen size perspective.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#screenSizePerspectiveEnabled)
    *
    * @default true
    */
  var screenSizePerspectiveEnabled: scala.Boolean = js.native
  /**
    * For [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) the type is `graphics`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#type)
    */
  @JSName("type")
  val type_GraphicsLayer: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.graphics = js.native
  /**
    * Adds a graphic to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#add)
    *
    * @param graphic The graphic to add to the layer.
    *
    */
  def add(graphic: Graphic): scala.Unit = js.native
  /**
    * Adds an array of graphics to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#addMany)
    *
    * @param graphics The graphic(s) to add to the layer.
    *
    */
  def addMany(graphics: js.Array[Graphic]): scala.Unit = js.native
  @JSName("on")
  def `on_layerview-create`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: GraphicsLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_layerview-destroy`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: GraphicsLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * Removes a graphic from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#remove)
    *
    * @param graphic The graphic to remove from the layer.
    *
    */
  def remove(graphic: Graphic): scala.Unit = js.native
  /**
    * Clears all the graphics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#removeAll)
    *
    *
    */
  def removeAll(): scala.Unit = js.native
  /**
    * Removes an array of graphics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#removeMany)
    *
    * @param graphics The graphics to remove from the layer.
    *
    */
  def removeMany(graphics: js.Array[Graphic]): scala.Unit = js.native
}

