package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifyResultProperties extends js.Object {
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#displayFieldName)
    */
  var displayFieldName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An identified feature from the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#feature)
    */
  var feature: js.UndefOr[GraphicProperties] = js.undefined
  /**
    * Unique ID of the layer that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#layerId)
    */
  var layerId: js.UndefOr[scala.Double] = js.undefined
  /**
    * The layer name that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#layerName)
    */
  var layerName: js.UndefOr[java.lang.String] = js.undefined
}

object IdentifyResultProperties {
  @scala.inline
  def apply(
    displayFieldName: java.lang.String = null,
    feature: GraphicProperties = null,
    layerId: scala.Int | scala.Double = null,
    layerName: java.lang.String = null
  ): IdentifyResultProperties = {
    val __obj = js.Dynamic.literal()
    if (displayFieldName != null) __obj.updateDynamic("displayFieldName")(displayFieldName)
    if (feature != null) __obj.updateDynamic("feature")(feature)
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (layerName != null) __obj.updateDynamic("layerName")(layerName)
    __obj.asInstanceOf[IdentifyResultProperties]
  }
}

