package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewConstraintsCollision
  extends stdLib.Object {
  /**
    * Set to `false` to permit the user to navigate below the surface in a local SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    *
    * @default true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
}

object SceneViewConstraintsCollision {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    enabled: js.UndefOr[scala.Boolean] = js.undefined
  ): SceneViewConstraintsCollision = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[SceneViewConstraintsCollision]
  }
}

