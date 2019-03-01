package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupDockOptions
  extends stdLib.Object {
  /**
    * Defines the dimensions of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) at which to dock the popup. Set to `false` to disable docking at a breakpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    *
    * @default true
    */
  var breakpoint: js.UndefOr[scala.Boolean | PopupDockOptionsBreakpoint] = js.undefined
  /**
    * If `true`, displays the dock button. If `false`, hides the dock button from the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    */
  var buttonEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The position in the view at which to dock the popup. Can be set as either a string or function. See the table below for known string values and their position in the view based on the view's size.
    *
    * Known Value | View size > breakpoint | View size < breakpoint
    * --------------- | ------------------------------- | -------------
    * auto | top-right | bottom 100%
    * top-left | top-left | top 100%
    * top-center | top-center | top 100%
    * top-right | top-right | top 100%
    * bottom-left | bottom-left | bottom 100%
    * bottom-center | bottom-center | bottom 100%
    * bottom-right | bottom-right | bottom 100%
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    *
    * @default auto
    */
  var position: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object PopupDockOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    breakpoint: scala.Boolean | PopupDockOptionsBreakpoint = null,
    buttonEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String | js.Function = null
  ): PopupDockOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonEnabled)) __obj.updateDynamic("buttonEnabled")(buttonEnabled)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupDockOptions]
  }
}

