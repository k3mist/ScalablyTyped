package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerApplyEditsEdits
  extends stdLib.Object {
  /**
    * Array of features to be added. Values of non nullable fields must be provided when adding new features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var addFeatures: js.UndefOr[js.Array[Graphic]] = js.undefined
  /**
    * An array of features or objects to be deleted. When an array of features is passed, each feature must have a valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField). When an array of objects is used, each object must have a valid `objectId` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var deleteFeatures: js.UndefOr[js.Array[Graphic] | js.Array[_]] = js.undefined
  /**
    * Array of features to be updated. Each feature must have valid [objectId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#objectIdField). Values of non nullable fields must be provided when updating features. Date fields must have [numeric](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getTime) values representing universal time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var updateFeatures: js.UndefOr[js.Array[Graphic]] = js.undefined
}

object FeatureLayerApplyEditsEdits {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    addFeatures: js.Array[Graphic] = null,
    deleteFeatures: js.Array[Graphic] | js.Array[_] = null,
    updateFeatures: js.Array[Graphic] = null
  ): FeatureLayerApplyEditsEdits = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (addFeatures != null) __obj.updateDynamic("addFeatures")(addFeatures)
    if (deleteFeatures != null) __obj.updateDynamic("deleteFeatures")(deleteFeatures.asInstanceOf[js.Any])
    if (updateFeatures != null) __obj.updateDynamic("updateFeatures")(updateFeatures)
    __obj.asInstanceOf[FeatureLayerApplyEditsEdits]
  }
}

