package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMSLayerProperties
  extends LayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties {
  /**
    * Copyright information for the WMS service. This defaults to the value of the AccessConstraints property from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#copyright)
    */
  var copyright: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use this to append different custom parameters to the WMS map requests. The custom layer parameters are applied to GetMap and GetFeatureInfo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customLayerParameters)
    */
  var customLayerParameters: js.UndefOr[js.Any] = js.undefined
  /**
    * Use this to append custom parameters to all WMS requests. The custom parameters are applied to GetCapabilities, GetMap and GetFeatureInfo. For example, if an access key is required, the key can be configured as a custom parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customParameters)
    */
  var customParameters: js.UndefOr[js.Any] = js.undefined
  /**
    * Description for the WMS layer. This defaults to the value of the Abstract property from the WMS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#description)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return format of feature information (MIME type).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoFormat)
    */
  var featureInfoFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL for the WMS GetFeatureInfo call.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoUrl)
    */
  var featureInfoUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * All bounding boxes defined for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#fullExtents)
    */
  var fullExtents: js.UndefOr[js.Array[ExtentProperties]] = js.undefined
  /**
    * The map image format (MIME type) to request. Defaults to `image/png` if the WMS service supports it. If not, it defaults to the value of the first `<Format>` in `<GetMap>` in the GetCapabilities response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageFormat)
    */
  var imageFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxHeight)
    *
    * @default 2048
    */
  var imageMaxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxWidth)
    *
    * @default 2048
    */
  var imageMaxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether the background of the image exported by the service is transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageTransparency)
    *
    * @default true
    */
  var imageTransparency: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * List of spatialReference well known ids derived from the CRS elements of the first layer in the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#spatialReferences)
    */
  var spatialReferences: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * A collection of [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[WMSSublayerProperties]] = js.undefined
  /**
    * The URL of the WMS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#url)
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Version of the [WMS specification](http://www.opengeospatial.org/standards/wms) to use. For example, `1.3.0`, `1.1.1`, `1.1` or `1.0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#version)
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object WMSLayerProperties {
  @scala.inline
  def apply(
    copyright: java.lang.String = null,
    customLayerParameters: js.Any = null,
    customParameters: js.Any = null,
    description: java.lang.String = null,
    featureInfoFormat: java.lang.String = null,
    featureInfoUrl: java.lang.String = null,
    fullExtent: ExtentProperties = null,
    fullExtents: js.Array[ExtentProperties] = null,
    id: java.lang.String = null,
    imageFormat: java.lang.String = null,
    imageMaxHeight: scala.Int | scala.Double = null,
    imageMaxWidth: scala.Int | scala.Double = null,
    imageTransparency: js.UndefOr[scala.Boolean] = js.undefined,
    legendEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    listMode: java.lang.String = null,
    maxScale: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    portalItem: PortalItemProperties = null,
    refreshInterval: scala.Int | scala.Double = null,
    spatialReference: SpatialReferenceProperties = null,
    spatialReferences: js.Array[scala.Double] = null,
    sublayers: CollectionProperties[WMSSublayerProperties] = null,
    title: java.lang.String = null,
    url: java.lang.String = null,
    version: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): WMSLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (customLayerParameters != null) __obj.updateDynamic("customLayerParameters")(customLayerParameters)
    if (customParameters != null) __obj.updateDynamic("customParameters")(customParameters)
    if (description != null) __obj.updateDynamic("description")(description)
    if (featureInfoFormat != null) __obj.updateDynamic("featureInfoFormat")(featureInfoFormat)
    if (featureInfoUrl != null) __obj.updateDynamic("featureInfoUrl")(featureInfoUrl)
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (fullExtents != null) __obj.updateDynamic("fullExtents")(fullExtents)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageFormat != null) __obj.updateDynamic("imageFormat")(imageFormat)
    if (imageMaxHeight != null) __obj.updateDynamic("imageMaxHeight")(imageMaxHeight.asInstanceOf[js.Any])
    if (imageMaxWidth != null) __obj.updateDynamic("imageMaxWidth")(imageMaxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(imageTransparency)) __obj.updateDynamic("imageTransparency")(imageTransparency)
    if (!js.isUndefined(legendEnabled)) __obj.updateDynamic("legendEnabled")(legendEnabled)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode)
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (spatialReferences != null) __obj.updateDynamic("spatialReferences")(spatialReferences)
    if (sublayers != null) __obj.updateDynamic("sublayers")(sublayers.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[WMSLayerProperties]
  }
}

