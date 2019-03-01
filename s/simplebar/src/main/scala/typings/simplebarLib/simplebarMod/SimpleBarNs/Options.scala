package typings
package simplebarLib.simplebarMod.SimpleBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  var classNames: js.UndefOr[ClassNamesOptions] = js.undefined
  var scrollbarMinSize: js.UndefOr[scala.Double] = js.undefined
  var wrapContent: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    classNames: ClassNamesOptions = null,
    scrollbarMinSize: scala.Int | scala.Double = null,
    wrapContent: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (classNames != null) __obj.updateDynamic("classNames")(classNames)
    if (scrollbarMinSize != null) __obj.updateDynamic("scrollbarMinSize")(scrollbarMinSize.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapContent)) __obj.updateDynamic("wrapContent")(wrapContent)
    __obj.asInstanceOf[Options]
  }
}

