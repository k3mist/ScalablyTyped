package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/accordion.html#optional-javascript-configuration
trait AccordionOptions extends js.Object {
  var active_class: js.UndefOr[java.lang.String] = js.undefined
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  var content_class: js.UndefOr[java.lang.String] = js.undefined
  var multi_expand: js.UndefOr[scala.Boolean] = js.undefined
  var toggleable: js.UndefOr[scala.Boolean] = js.undefined
}

object AccordionOptions {
  @scala.inline
  def apply(
    active_class: java.lang.String = null,
    callback: js.Function0[_] = null,
    content_class: java.lang.String = null,
    multi_expand: js.UndefOr[scala.Boolean] = js.undefined,
    toggleable: js.UndefOr[scala.Boolean] = js.undefined
  ): AccordionOptions = {
    val __obj = js.Dynamic.literal()
    if (active_class != null) __obj.updateDynamic("active_class")(active_class)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (content_class != null) __obj.updateDynamic("content_class")(content_class)
    if (!js.isUndefined(multi_expand)) __obj.updateDynamic("multi_expand")(multi_expand)
    if (!js.isUndefined(toggleable)) __obj.updateDynamic("toggleable")(toggleable)
    __obj.asInstanceOf[AccordionOptions]
  }
}

