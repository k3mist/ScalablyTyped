package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyDropdown
  extends CustomPropertyCommon
     with CustomProperty {
  var component: qlikLib.qlikLibStrings.dropdown
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[CustomPropertyOptions] = js.undefined
  @JSName("ref")
  var ref_CustomPropertyDropdown: java.lang.String
  @JSName("type")
  var type_CustomPropertyDropdown: qlikLib.qlikLibStrings.string
}

object CustomPropertyDropdown {
  @scala.inline
  def apply(
    component: qlikLib.qlikLibStrings.dropdown,
    ref: java.lang.String,
    `type`: qlikLib.qlikLibStrings.string,
    defaultValue: java.lang.String = null,
    label: java.lang.String = null,
    options: CustomPropertyOptions = null,
    show: scala.Boolean | ShowFunction = null
  ): CustomPropertyDropdown = {
    val __obj = js.Dynamic.literal(component = component, ref = ref, `type` = `type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (label != null) __obj.updateDynamic("label")(label)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyDropdown]
  }
}

