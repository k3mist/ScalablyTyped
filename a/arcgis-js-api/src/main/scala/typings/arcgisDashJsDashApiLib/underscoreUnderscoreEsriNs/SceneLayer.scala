package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneLayer
  extends Layer
     with SceneService
     with PortalLayer {
  /**
    * The SQL where clause used to filter features on the client. Only the features that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). Setting a definition expression is useful when only a subset of the data in the layer should be displayed.  Setting the definition expression of a layer automatically updates all layer views.  If the definition expression is set after the layer has been added to the map, the view will automatically refresh itself to display the features that satisfy the new definition expression.  Important to note is that the initial loading time of the features remains unchanged, even if they are filtered. This happens because, as opposed to Feature Layers, feature filtering is done client-side. As a result all features need to be downloaded always for filter evaluation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#definitionExpression)
    */
  var definitionExpression: java.lang.String = js.native
  /**
    * Specifies how graphics are placed on the vertical axis (z). See the [ElevationInfo sample](https://developers.arcgis.com/javascript/latest/sample-code/scene-elevationinfo/index.html) for an example of how this property may be used.  This property only affects 3D Object [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) when using the `absolute-height` mode. [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) with [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries support all the elevation modes listed below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#elevationInfo)
    */
  var elevationInfo: SceneLayerElevationInfo = js.native
  /**
    * Configures the method for decluttering overlapping features in the view. If this property is not set (or set to `null`), every feature is drawn individually.  This property is only supported for point scene layers with non-draped [Icon](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html) or [Text](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html) symbol layers.  [![declutter](https://developers.arcgis.com/javascript/assets/img/samples/city-points-declutter.gif)](https://developers.arcgis.com/javascript/latest/sample-code/visualization-point-styles/index.html)
    * > **Known Limitation**  When applying featureReduction on a point SceneLayer layer updates are slow. This will be addressed in upcoming releases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#featureReduction)
    */
  var featureReduction: SceneLayerFeatureReduction = js.native
  /**
    * An array of fields accessible in the layer. Depending on the scene service, fields may have limited support for certain capabilities. Use [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) to query the contexts (rendering, labeling, popups or querying) for which a particular field may be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#fields)
    */
  var fields: js.Array[Field] = js.native
  /**
    * The geometry type of features in the layer.  **Possible Values:** point | mesh
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType)
    */
  var geometryType: java.lang.String = js.native
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html). Use this property to specify labeling properties for the layer such as label expression, placement, and size.  For labels to display in the view, the [labelsVisible](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelsVisible) property of this layer must be set to `true`.
    * > **Known Limitations**  This property is only relevant to SceneLayers with [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries. This property has no effect on SceneLayers with other geometry types.  Each point can have only one label. Multiple [Label classes](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) with different [where](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where) clauses can be used to have different label styles on different features that belong to the same layer (for example blue labels for lakes and green labels for parks).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  /**
    * Indicates whether to display labels for this layer. If `true`, labels will appear as defined in the [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelingInfo) property.  This property is only relevant to SceneLayers with [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries. This property has no effect on SceneLayers with other geometry types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: scala.Boolean = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: scala.Boolean = js.native
  /**
    * The name of the field containing each graphic's Object ID. If this is not explicitly specified, this is automatically derived from the [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#fields) of the service by taking the first field of type `oid`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#objectIdField)
    */
  var objectIdField: java.lang.String = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: scala.Boolean = js.native
  /**
    * The popup template for the layer. When set on the layer, the `popupTemplate` allows users to access attributes and display their values in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a feature is selected using text and/or charts. See the [PopupTemplate sample](https://developers.arcgis.com/javascript/latest/sample-code/intro-popuptemplate/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Setting a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) on this layer type is done in the same way as a FeatureLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize each feature in the layer. Depending on the renderer type, features may be visualized with the same symbol, or with varying symbols based on the values of provided attribute fields or functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#renderer)
    */
  var renderer: Renderer = js.native
  /**
    * Apply perspective scaling to screen-size point symbols in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). When `true`, screen sized objects such as [icons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [labels](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html) or [callouts](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html) integrate better in the 3D scene by applying a certain perspective projection to the sizing of features. This only applies when using a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).  `layer.screenSizePerspectiveEnabled = true`  ![screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-screenSize-perspective.png)  `layer.screenSizePerspectiveEnabled = false`  ![no-screen-size-perspective](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-no-screenSize-perspective.png)
    * > **Known Limitations**  Screen size perspective is currently not optimized for situations where the camera is very near the ground, or for scenes with point features located far from the ground surface. In these cases it may be better to turn off screen size perspective. As screen size perspective changes the size based on distance to the camera, it should be set to false when using {@link module:esri/renderers/Renderer#SizeVisualVariable size visual variables}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#screenSizePerspectiveEnabled)
    *
    * @default true
    */
  var screenSizePerspectiveEnabled: scala.Boolean = js.native
  /**
    * Creates a query object that can be used to fetch features that satisfy the layer's current definition expression. The query should only be used on the layer and not on the layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#createQuery)
    *
    *
    */
  def createQuery(): Query = js.native
  /**
    * Gets field usage information. The usage of a field depends on whether it is stored as part of the scene service cache. The returned object contains the following usage information:
    *
    * Property              | Type    | Description
    * ----------------------|---------|------------
    * supportsRenderer      | boolean | Indicates that a field can be used in a renderer (e.g. in visual variables), [see renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#renderer).
    * supportsLabelingInfo  | boolean | Indicates that a field can be used for labeling, [see labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#labelingInfo).
    * supportsPopupTemplate | boolean | Indicates that a field can be used in a popup template, [see popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#popupTemplate).
    * supportsLayerQuery    | boolean | Indicates that a field can be used in layer queries, [see queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryFeatures).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo)
    *
    * @param fieldName The name of the field to get usage info for.
    *
    */
  def getFieldUsageInfo(fieldName: java.lang.String): js.Any = js.native
  @JSName("on")
  def `on_layerview-create`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: SceneLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_layerview-destroy`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: SceneLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the service and returns the 2D [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query. At the moment the 3D Extent can be returned by using [SceneLayerView.queryExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryExtent), but this will return the 3D extent only for features currently in the view. The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `scenelayer:query-not-available` is thrown. Read more about queries in the Query section of the class description above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryExtent)
    *
    * @param params Specifies the query parameters.
    *
    */
  def queryExtent(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def queryExtent(params: Query): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the service and returns the number of the features that satisfy the query. The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `scenelayer:query-not-available` is thrown. Read more about queries in the Query section of the class description above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryFeatureCount)
    *
    * @param params Specifies the query parameters.
    *
    */
  def queryFeatureCount(): arcgisDashJsDashApiLib.IPromise[scala.Double] = js.native
  def queryFeatureCount(params: Query): arcgisDashJsDashApiLib.IPromise[scala.Double] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `scenelayer:query-not-available` is thrown. Read more about queries in the Query section of the class description above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryFeatures)
    *
    * @param params Specifies the query parameters.
    *
    */
  def queryFeatures(): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  def queryFeatures(params: Query): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the service and returns an array of the ObjectIDs of features that satisfy the input query. The query succeeds only if the layer's `supportsLayerQuery` capability is enabled. Use the [getFieldUsageInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#getFieldUsageInfo) method to check if the layer supports queries. If querying is not enabled, then an error with the name `scenelayer:query-not-available` is thrown. Read more about queries in the Query section of the class description above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryObjectIds)
    *
    * @param params Specifies the query parameters.
    *
    */
  def queryObjectIds(): arcgisDashJsDashApiLib.IPromise[js.Array[scala.Double]] = js.native
  def queryObjectIds(params: Query): arcgisDashJsDashApiLib.IPromise[js.Array[scala.Double]] = js.native
}

