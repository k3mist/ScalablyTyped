package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerFromPortalItemParams
  extends stdLib.Object {
  /**
    * The object representing an ArcGIS Online or ArcGIS Enterprise portal item from which to load the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromPortalItem)
    */
  var portalItem: PortalItem
}

object LayerFromPortalItemParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    portalItem: PortalItem,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): LayerFromPortalItemParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, portalItem = portalItem, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[LayerFromPortalItemParams]
  }
}

