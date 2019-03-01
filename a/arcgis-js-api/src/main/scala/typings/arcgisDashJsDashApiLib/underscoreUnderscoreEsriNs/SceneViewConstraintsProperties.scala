package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewConstraintsProperties
  extends stdLib.Object {
  /**
    * Specifies a constraint on the minimum and maximum allowed camera altitude.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var altitude: js.UndefOr[SceneViewConstraintsAltitudeProperties] = js.undefined
  /**
    * Specifies the near and far webgl clip distances.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var clipDistance: js.UndefOr[SceneViewConstraintsClipDistanceProperties] = js.undefined
  /**
    * When enabled, prevents the user from navigating below the surface in a local SceneView. This property is deprecated, please use [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#navigationConstraint) instead.  **Deprecated since version 4.8**
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var collision: js.UndefOr[SceneViewConstraintsCollision] = js.undefined
  /**
    * Specifies a constraint on the amount of allowed tilting of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var tilt: js.UndefOr[SceneViewConstraintsTiltProperties] = js.undefined
}

object SceneViewConstraintsProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    altitude: SceneViewConstraintsAltitudeProperties = null,
    clipDistance: SceneViewConstraintsClipDistanceProperties = null,
    collision: SceneViewConstraintsCollision = null,
    tilt: SceneViewConstraintsTiltProperties = null
  ): SceneViewConstraintsProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (altitude != null) __obj.updateDynamic("altitude")(altitude)
    if (clipDistance != null) __obj.updateDynamic("clipDistance")(clipDistance)
    if (collision != null) __obj.updateDynamic("collision")(collision)
    if (tilt != null) __obj.updateDynamic("tilt")(tilt)
    __obj.asInstanceOf[SceneViewConstraintsProperties]
  }
}

