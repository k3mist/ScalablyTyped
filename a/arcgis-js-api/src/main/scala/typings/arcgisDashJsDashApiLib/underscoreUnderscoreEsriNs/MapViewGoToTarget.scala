package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewGoToTarget
  extends stdLib.Object {
  /**
    * The [MapView.center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo)
    */
  var center: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The [MapView.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo)
    */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
    * The target of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo)
    */
  var target: js.UndefOr[
    js.Array[scala.Double] | Geometry | js.Array[Geometry] | Graphic | js.Array[Graphic] | Viewpoint
  ] = js.undefined
  /**
    * The [MapView.zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo)
    */
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

