package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewEnvironmentAtmosphere extends AnonymousAccessor {
  /**
    * Indicates the quality of the atmosphere visualization. The quality of the atmosphere may have a significant impact on performance. This setting does not have any effect in [local scenes](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode).
    *
    *   Known Value | Example
    *   ------------|---------
    *   low | ![scene-atmosphere](https://developers.arcgis.com/javascript/assets/img/apiref/views/scene-atmosphere.png)
    *   high | ![scene-atmosphere](https://developers.arcgis.com/javascript/assets/img/apiref/views/scene-atmosphere-realistic.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default low
    */
  var quality: js.UndefOr[java.lang.String] = js.undefined
}

