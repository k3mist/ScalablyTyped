package typings
package reactDashToolboxLib.libDropdownDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownTheme extends js.Object {
  /**
    * Added to the root element when the dropdown is active.
    */
  var active: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element when it's disabled.
    */
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Root element class.
    */
  var dropdown: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the error element.
    */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the inner wrapper if it's errored.
    */
  var errored: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the inner wrapper of the component.
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the the label element.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used when dropdown has required attribute.
    */
  var required: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to highlight the selected value.
    */
  var selected: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used as a wrapper for the given template value.
    */
  var templateValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element when it's opening up.
    */
  var up: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for each value in the dropdown component.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the list of values.
    */
  var values: js.UndefOr[java.lang.String] = js.undefined
}

object DropdownTheme {
  @scala.inline
  def apply(
    active: java.lang.String = null,
    disabled: java.lang.String = null,
    dropdown: java.lang.String = null,
    error: java.lang.String = null,
    errored: java.lang.String = null,
    field: java.lang.String = null,
    label: java.lang.String = null,
    required: java.lang.String = null,
    selected: java.lang.String = null,
    templateValue: java.lang.String = null,
    up: java.lang.String = null,
    value: java.lang.String = null,
    values: java.lang.String = null
  ): DropdownTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown)
    if (error != null) __obj.updateDynamic("error")(error)
    if (errored != null) __obj.updateDynamic("errored")(errored)
    if (field != null) __obj.updateDynamic("field")(field)
    if (label != null) __obj.updateDynamic("label")(label)
    if (required != null) __obj.updateDynamic("required")(required)
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (templateValue != null) __obj.updateDynamic("templateValue")(templateValue)
    if (up != null) __obj.updateDynamic("up")(up)
    if (value != null) __obj.updateDynamic("value")(value)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DropdownTheme]
  }
}

