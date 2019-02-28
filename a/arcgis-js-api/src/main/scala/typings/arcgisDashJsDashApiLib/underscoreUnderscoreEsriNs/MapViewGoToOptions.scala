package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewGoToOptions
  extends stdLib.Object {
  /**
    * Indicates if the transition to the new view should be animated. If set to false, `duration` and `easing` properties are ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo)
    *
    * @default true
    */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The duration of the animation in milliseconds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo)
    *
    * @default 200
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * The easing function used for the animation. See [easing functions](https://easings.net/) for graphical representations of these functions.  **Possible Values:** linear | ease | ease-in | ease-out | ease-in-out
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo)
    *
    * @default ease
    */
  var easing: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

