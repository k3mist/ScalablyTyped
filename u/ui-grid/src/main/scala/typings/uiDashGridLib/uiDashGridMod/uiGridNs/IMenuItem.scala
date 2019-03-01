package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuItem extends js.Object {
  /** the method to call when the menu is clicked */
  var action: js.UndefOr[
    js.Function1[/* $event */ angularLib.angularMod.angularNs.IAngularEvent, scala.Unit]
  ] = js.undefined
  /** a function to evaluate to determine whether or not the item is currently selected */
  var active: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** context to pass to the action function, available in this.context in your handler */
  var context: js.UndefOr[js.Any] = js.undefined
  /** the icon shown alongside that title */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** if set to true, the menu should stay open after the action, defaults to false */
  var leaveOpen: js.UndefOr[scala.Boolean] = js.undefined
  /** a function to evaluate to determine whether or not to show the item */
  var shown: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** controls the title that is displayed in the menu */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IMenuItem {
  @scala.inline
  def apply(
    action: js.Function1[/* $event */ angularLib.angularMod.angularNs.IAngularEvent, scala.Unit] = null,
    active: js.Function0[scala.Boolean] = null,
    context: js.Any = null,
    icon: java.lang.String = null,
    leaveOpen: js.UndefOr[scala.Boolean] = js.undefined,
    shown: js.Function0[scala.Boolean] = null,
    title: java.lang.String = null
  ): IMenuItem = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (active != null) __obj.updateDynamic("active")(active)
    if (context != null) __obj.updateDynamic("context")(context)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(leaveOpen)) __obj.updateDynamic("leaveOpen")(leaveOpen)
    if (shown != null) __obj.updateDynamic("shown")(shown)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IMenuItem]
  }
}

