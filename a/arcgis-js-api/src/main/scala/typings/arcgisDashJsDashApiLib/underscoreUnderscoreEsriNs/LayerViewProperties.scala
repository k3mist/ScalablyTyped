package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerViewProperties extends js.Object {
  /**
    * When `true`, the layer is visible in the view. Set this property to `false` to hide the layer from the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#visible)
    *
    * @default true
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object LayerViewProperties {
  @scala.inline
  def apply(visible: js.UndefOr[scala.Boolean] = js.undefined): LayerViewProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[LayerViewProperties]
  }
}

