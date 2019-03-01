package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/dropdown.html#optional-javascript-configuration
trait DropdownOptions extends js.Object {
  var active_class: js.UndefOr[java.lang.String] = js.undefined
  var align: js.UndefOr[java.lang.String] = js.undefined
  var closed: js.UndefOr[js.Function0[_]] = js.undefined
  var disabled_class: js.UndefOr[java.lang.String] = js.undefined
  var hover_timeout: js.UndefOr[scala.Double] = js.undefined
  var is_hover: js.UndefOr[scala.Boolean] = js.undefined
  var mega_class: js.UndefOr[java.lang.String] = js.undefined
  var opened: js.UndefOr[js.Function0[_]] = js.undefined
}

object DropdownOptions {
  @scala.inline
  def apply(
    active_class: java.lang.String = null,
    align: java.lang.String = null,
    closed: js.Function0[_] = null,
    disabled_class: java.lang.String = null,
    hover_timeout: scala.Int | scala.Double = null,
    is_hover: js.UndefOr[scala.Boolean] = js.undefined,
    mega_class: java.lang.String = null,
    opened: js.Function0[_] = null
  ): DropdownOptions = {
    val __obj = js.Dynamic.literal()
    if (active_class != null) __obj.updateDynamic("active_class")(active_class)
    if (align != null) __obj.updateDynamic("align")(align)
    if (closed != null) __obj.updateDynamic("closed")(closed)
    if (disabled_class != null) __obj.updateDynamic("disabled_class")(disabled_class)
    if (hover_timeout != null) __obj.updateDynamic("hover_timeout")(hover_timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(is_hover)) __obj.updateDynamic("is_hover")(is_hover)
    if (mega_class != null) __obj.updateDynamic("mega_class")(mega_class)
    if (opened != null) __obj.updateDynamic("opened")(opened)
    __obj.asInstanceOf[DropdownOptions]
  }
}

