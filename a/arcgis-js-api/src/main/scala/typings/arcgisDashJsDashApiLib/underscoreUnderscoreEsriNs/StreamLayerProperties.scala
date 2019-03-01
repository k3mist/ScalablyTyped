package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerProperties extends FeatureLayerProperties {
  /**
    * Contains the attribute and spatial filters used to filter messages sent to the client by a Stream Service. This property can be set in the constructor but is `read-only` after the layer is created. To change the filter after the layer is created, use the [updateFilter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#updateFilter) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#filter)
    */
  var filter: js.UndefOr[StreamLayerFilter] = js.undefined
  /**
    * An extent object used to filter features. Only features intersecting the extent are displayed in the view. Instead of using this property, use [StreamLayer.filter.geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#filter) when creating the service or [StreamLayer.updateFilter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#updateFilter) when changing the spatial filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#geometryDefinition)
    */
  var geometryDefinition: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * Maximum number of features to show per [trackId](https://enterprise.arcgis.com/en/geoevent/latest/get-started/essential-geoevent-server-vocabulary.htm#ESRI_SECTION1_F45BBCE9ADFA4E57AF38DD225921EFCD).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#maximumTrackPoints)
    */
  var maximumTrackPoints: js.UndefOr[scala.Double] = js.undefined
  /**
    * Options for purging stale features. Use these options to avoid overloading the browser with graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var purgeOptions: js.UndefOr[StreamLayerPurgeOptions] = js.undefined
}

object StreamLayerProperties {
  @scala.inline
  def apply(
    copyright: java.lang.String = null,
    definitionExpression: java.lang.String = null,
    displayField: java.lang.String = null,
    dynamicDataSource: DynamicMapLayer | DynamicDataLayer = null,
    elevationInfo: FeatureLayerElevationInfo = null,
    featureReduction: FeatureLayerFeatureReduction = null,
    fields: js.Array[FieldProperties] = null,
    filter: StreamLayerFilter = null,
    fullExtent: ExtentProperties = null,
    geometryDefinition: ExtentProperties = null,
    geometryType: java.lang.String = null,
    historicMoment: DateProperties = null,
    id: java.lang.String = null,
    labelingInfo: js.Array[LabelClassProperties] = null,
    labelsVisible: js.UndefOr[scala.Boolean] = js.undefined,
    layerId: scala.Int | scala.Double = null,
    legendEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    listMode: java.lang.String = null,
    maxScale: scala.Int | scala.Double = null,
    maximumTrackPoints: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null,
    objectIdField: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    outFields: js.Array[java.lang.String] = null,
    popupEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    portalItem: PortalItemProperties = null,
    purgeOptions: StreamLayerPurgeOptions = null,
    refreshInterval: scala.Int | scala.Double = null,
    renderer: RendererProperties = null,
    returnM: js.UndefOr[scala.Boolean] = js.undefined,
    returnZ: js.UndefOr[scala.Boolean] = js.undefined,
    screenSizePerspectiveEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    source: CollectionProperties[GraphicProperties] = null,
    spatialReference: SpatialReferenceProperties = null,
    templates: js.Array[FeatureTemplateProperties] = null,
    title: java.lang.String = null,
    types: js.Array[FeatureTypeProperties] = null,
    url: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): StreamLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (definitionExpression != null) __obj.updateDynamic("definitionExpression")(definitionExpression)
    if (displayField != null) __obj.updateDynamic("displayField")(displayField)
    if (dynamicDataSource != null) __obj.updateDynamic("dynamicDataSource")(dynamicDataSource.asInstanceOf[js.Any])
    if (elevationInfo != null) __obj.updateDynamic("elevationInfo")(elevationInfo)
    if (featureReduction != null) __obj.updateDynamic("featureReduction")(featureReduction)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (geometryDefinition != null) __obj.updateDynamic("geometryDefinition")(geometryDefinition)
    if (geometryType != null) __obj.updateDynamic("geometryType")(geometryType)
    if (historicMoment != null) __obj.updateDynamic("historicMoment")(historicMoment.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelingInfo != null) __obj.updateDynamic("labelingInfo")(labelingInfo)
    if (!js.isUndefined(labelsVisible)) __obj.updateDynamic("labelsVisible")(labelsVisible)
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (!js.isUndefined(legendEnabled)) __obj.updateDynamic("legendEnabled")(legendEnabled)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode)
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (maximumTrackPoints != null) __obj.updateDynamic("maximumTrackPoints")(maximumTrackPoints.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (objectIdField != null) __obj.updateDynamic("objectIdField")(objectIdField)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (outFields != null) __obj.updateDynamic("outFields")(outFields)
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled)
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate)
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (purgeOptions != null) __obj.updateDynamic("purgeOptions")(purgeOptions)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (!js.isUndefined(returnM)) __obj.updateDynamic("returnM")(returnM)
    if (!js.isUndefined(returnZ)) __obj.updateDynamic("returnZ")(returnZ)
    if (!js.isUndefined(screenSizePerspectiveEnabled)) __obj.updateDynamic("screenSizePerspectiveEnabled")(screenSizePerspectiveEnabled)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (templates != null) __obj.updateDynamic("templates")(templates)
    if (title != null) __obj.updateDynamic("title")(title)
    if (types != null) __obj.updateDynamic("types")(types)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StreamLayerProperties]
  }
}

