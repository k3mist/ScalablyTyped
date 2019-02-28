package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIAddComponent
  extends stdLib.Object {
  /**
    * The component to add to the UI. This can be a widget instance, HTML element, a string value representing a DOM node ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var component: Widget | stdLib.HTMLElement | java.lang.String
  /**
    * The placement index of the component. This index shows where to place the component relative to other components. For example a value of `0` would place it topmost when position is top-*, leftmost for bottom-left and right most for bottom-right.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * The position in the view at which to add the component. If not specified, `manual` is used by default. **Possible Values:** top-left | top-right | bottom-left | bottom-right | manual
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#add)
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
}

