package typings
package ejDotWebDotAllLib.ejNs.RatingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Enables the rating control with reset button.It can be used to reset the rating control value.
    * @Default {true}
    */
  var allowReset: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when Rating value changes.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires when Rating control is clicked successfully.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Fires when Rating control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Specify the CSS class to achieve custom theme.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when Rating control is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Save current model value to browser cookies for state maintenance. While refresh the page Rating control values are retained.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** When this property is set to false, it disables the rating control.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the height of the Rating control wrapper.
    * @Default {null}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the list of HTML attributes to be added to rating control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specifies the value to be increased while navigating between shapes(stars) in Rating control.
    * @Default {1}
    */
  var incrementStep: js.UndefOr[scala.Double] = js.undefined
  /** Allow to render the maximum number of Rating shape(star).
    * @Default {5}
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** Allow to render the minimum number of Rating shape(star).
    * @Default {0}
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** Fires when mouse move is moving the Rating control.
    */
  var mousemove: js.UndefOr[js.Function1[/* e */ MousemoveEventArgs, scala.Unit]] = js.undefined
  /** Fires when mouse hover is removed from Rating control.
    */
  var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, scala.Unit]] = js.undefined
  /** Fires when mouse hovered over the Rating control.
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, scala.Unit]] = js.undefined
  /** Specifies the orientation of Rating control. See Orientation
    * @Default {ej.Rating.Orientation.Horizontal}
    */
  var orientation: js.UndefOr[ejDotWebDotAllLib.ejNs.Orientation | java.lang.String] = js.undefined
  /** Helps to provide more precise ratings.Rating control supports three precision modes - full, half, and exact. See Precision
    * @Default {full}
    */
  var precision: js.UndefOr[Precision | java.lang.String] = js.undefined
  /** Interaction with Rating control can be prevented by enabling this API.
    * @Default {false}
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** To specify the height of each shape in Rating control.
    * @Default {23}
    */
  var shapeHeight: js.UndefOr[scala.Double] = js.undefined
  /** To specify the width of each shape in Rating control.
    * @Default {23}
    */
  var shapeWidth: js.UndefOr[scala.Double] = js.undefined
  /** Enables the tooltip option.Currently selected value will be displayed in tooltip.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** To specify the number of stars to be selected while rendering.
    * @Default {1}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the width of the Rating control wrapper.
    * @Default {null}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowReset: js.UndefOr[scala.Boolean] = js.undefined,
    change: js.Function1[/* e */ ChangeEventArgs, scala.Unit] = null,
    click: js.Function1[/* e */ ClickEventArgs, scala.Unit] = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String = null,
    htmlAttributes: js.Any = null,
    incrementStep: scala.Int | scala.Double = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    mousemove: js.Function1[/* e */ MousemoveEventArgs, scala.Unit] = null,
    mouseout: js.Function1[/* e */ MouseoutEventArgs, scala.Unit] = null,
    mouseover: js.Function1[/* e */ MouseoverEventArgs, scala.Unit] = null,
    orientation: ejDotWebDotAllLib.ejNs.Orientation | java.lang.String = null,
    precision: Precision | java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    shapeHeight: scala.Int | scala.Double = null,
    shapeWidth: scala.Int | scala.Double = null,
    showTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    value: scala.Int | scala.Double = null,
    width: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowReset)) __obj.updateDynamic("allowReset")(allowReset)
    if (change != null) __obj.updateDynamic("change")(change)
    if (click != null) __obj.updateDynamic("click")(click)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (incrementStep != null) __obj.updateDynamic("incrementStep")(incrementStep.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (mousemove != null) __obj.updateDynamic("mousemove")(mousemove)
    if (mouseout != null) __obj.updateDynamic("mouseout")(mouseout)
    if (mouseover != null) __obj.updateDynamic("mouseover")(mouseover)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (shapeHeight != null) __obj.updateDynamic("shapeHeight")(shapeHeight.asInstanceOf[js.Any])
    if (shapeWidth != null) __obj.updateDynamic("shapeWidth")(shapeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Model]
  }
}

