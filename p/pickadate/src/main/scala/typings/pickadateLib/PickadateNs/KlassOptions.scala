package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// KlassOptions shared between date and time pickers
trait KlassOptions extends js.Object {
   // default 'picker__input'
  var active: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__wrap'
  var box: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__day--today' or 'picker__list-item--now'
  // Clear button
  var buttonClear: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__box'
  // Day/Time states
  var disabled: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker--opened'
  var focused: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__holder'
  // The picker frame, wrapper, and box
  var frame: js.UndefOr[java.lang.String] = js.undefined
  // default 'picker__day--selected' or 'picker__list-item--selected'
  var highlighted: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker--focused'
  // The picker holder
  var holder: js.UndefOr[java.lang.String] = js.undefined
  // The element states
  var input: js.UndefOr[java.lang.String] = js.undefined
  // default 'picker__day--highlighted' or 'picker__list-item--highlighted'
  var now: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker' or 'picker picker--time'
  var opened: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__input--active'
  // The root picker and states
  var picker: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__day--disabled' or 'picker__list-item--disabled'
  var selected: js.UndefOr[java.lang.String] = js.undefined
   // default 'picker__frame'
  var wrap: js.UndefOr[java.lang.String] = js.undefined
}

object KlassOptions {
  @scala.inline
  def apply(
    active: java.lang.String = null,
    box: java.lang.String = null,
    buttonClear: java.lang.String = null,
    disabled: java.lang.String = null,
    focused: java.lang.String = null,
    frame: java.lang.String = null,
    highlighted: java.lang.String = null,
    holder: java.lang.String = null,
    input: java.lang.String = null,
    now: java.lang.String = null,
    opened: java.lang.String = null,
    picker: java.lang.String = null,
    selected: java.lang.String = null,
    wrap: java.lang.String = null
  ): KlassOptions = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (box != null) __obj.updateDynamic("box")(box)
    if (buttonClear != null) __obj.updateDynamic("buttonClear")(buttonClear)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (focused != null) __obj.updateDynamic("focused")(focused)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (highlighted != null) __obj.updateDynamic("highlighted")(highlighted)
    if (holder != null) __obj.updateDynamic("holder")(holder)
    if (input != null) __obj.updateDynamic("input")(input)
    if (now != null) __obj.updateDynamic("now")(now)
    if (opened != null) __obj.updateDynamic("opened")(opened)
    if (picker != null) __obj.updateDynamic("picker")(picker)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[KlassOptions]
  }
}

