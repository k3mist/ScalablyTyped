package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudLayerProperties
  extends LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties {
  /**
    * Specifies how points are placed on the vertical axis (z). This property only affects [PointCloudLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) when using the `absolute-height` mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[PointCloudLayerElevationInfo] = js.undefined
  /**
    * An array of fields accessible in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.undefined
  /**
    * An array of [pointCloudFilters](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html) used to filter points. Only the points that satisfy all the filters are displayed in the view. There are two types of filters that can be set: [PointCloudValueFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html) filters points based on classification values and [PointCloudReturnFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html) filters points based on return values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#filters)
    */
  var filters: js.UndefOr[js.Array[PointCloudFilterProperties]] = js.undefined
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize each point in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#renderer)
    */
  var renderer: js.UndefOr[PointCloudRendererProperties] = js.undefined
}

