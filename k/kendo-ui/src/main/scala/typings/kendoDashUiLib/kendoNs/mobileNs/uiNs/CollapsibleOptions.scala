package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleOptions extends js.Object {
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  var collapse: js.UndefOr[js.Function1[/* e */ CollapsibleEvent, scala.Unit]] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var expand: js.UndefOr[js.Function1[/* e */ CollapsibleEvent, scala.Unit]] = js.undefined
  var expandIcon: js.UndefOr[java.lang.String] = js.undefined
  var iconPosition: js.UndefOr[java.lang.String] = js.undefined
  var inset: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object CollapsibleOptions {
  @scala.inline
  def apply(
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    collapse: js.Function1[/* e */ CollapsibleEvent, scala.Unit] = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    expand: js.Function1[/* e */ CollapsibleEvent, scala.Unit] = null,
    expandIcon: java.lang.String = null,
    iconPosition: java.lang.String = null,
    inset: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null
  ): CollapsibleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (collapse != null) __obj.updateDynamic("collapse")(collapse)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon)
    if (iconPosition != null) __obj.updateDynamic("iconPosition")(iconPosition)
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CollapsibleOptions]
  }
}

