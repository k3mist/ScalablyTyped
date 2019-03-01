package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgCheckboxEditor
  extends /**
	 * Option for igCheckboxEditor
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var allowNullValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Fired when the input field of the editor loses focus.
  	 */
  var blur: js.UndefOr[BlurEvent] = js.undefined
  /**
  	 * Gets/Sets whether the checkbox is checked.
  	 *
  	 */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
  	 *
  	 */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Fired when the input field of the editor gets focus.
  	 */
  var focus: js.UndefOr[IgFocusEvent] = js.undefined
  /**
  	 * Gets/Sets the height of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will fit the editor inside its parent container, if no other heights are defined.
  	 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Gets/Sets a custom class on the checkbox. Custom image can be used this way.
  	 * The following jQuery classes can be used in addition http://api.jqueryui.com/theming/icons/
  	 *
  	 */
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
  	 *
  	 */
  var inputName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Fired on keydown event.
  	 * Return false in order to cancel key action.
  	 */
  var keydown: js.UndefOr[KeydownEvent] = js.undefined
  /**
  	 * Fired on keypress event.
  	 * Return false in order to cancel key action.
  	 */
  var keypress: js.UndefOr[KeypressEvent] = js.undefined
  /**
  	 * Fired on keyup event.
  	 */
  var keyup: js.UndefOr[KeyupEvent] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired on mousedown event.
  	 */
  var mousedown: js.UndefOr[MousedownEvent] = js.undefined
  /**
  	 * Fired on mousemove at any part of editor including the drop-down list.
  	 */
  var mousemove: js.UndefOr[MousemoveEvent] = js.undefined
  /**
  	 * Fired on mouseleave at any part of editor including the drop-down list.
  	 */
  var mouseout: js.UndefOr[MouseoutEvent] = js.undefined
  /**
  	 * Fired on mouseover at any part of editor including the drop-down list.
  	 */
  var mouseover: js.UndefOr[MouseoverEvent] = js.undefined
  /**
  	 * Fired on mouseup event.
  	 */
  var mouseup: js.UndefOr[MouseupEvent] = js.undefined
  var nullValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets the readonly attribute. Does not allow editing. Disables changing the checkbox state as an interaction, but it still can be changed programmatically. On submit the current value is sent into the request.
  	 *
  	 */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Fired after rendering of the editor has finished.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  /**
  	 * Fired before rendering of the editor has finished.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
  /**
  	 * Gets/Sets size of the checkbox based on preset styles.For different sizes, define 'width' and 'height' options instead.
  	 *
  	 *
  	 * Valid values:
  	 * "verysmall" The size of the Checkbox editor is very small.
  	 * "small" The size of the Checkbox editor is small.
  	 * "normal" The size of the Checkbox editor is normal.
  	 * "large" The size of the Checkbox editor is large.
  	 */
  var size: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets tabIndex attribute for the editor input.
  	 *
  	 */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets/Sets options supported by the [igValidator](ui.igvalidator#options) widget.
  	 * Note: Validation rules of [igValidator](ui.igvalidator#options), such as min and max value/length are applied separately triggering errors,
  	 * while the corresponding options of the editor prevent values violating the defined rules from being entered.
  	 *
  	 */
  var validatorOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets value in editor. The effect of setting/getting that option depends on type of editor and on dataMode options for every type of editor.
  	 *
  	 */
  var value: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after the editor's value has been changed.
  	 */
  var valueChanged: js.UndefOr[ValueChangedEvent] = js.undefined
  /**
  	 * Fired before changing the editor's value.
  	 * Return false in order to cancel change.
  	 */
  var valueChanging: js.UndefOr[ValueChangingEvent] = js.undefined
  /**
  	 * Gets/Sets the width of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will stretch to fit data, if no other widths are defined.
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object IgCheckboxEditor {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igCheckboxEditor
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    allowNullValue: js.UndefOr[scala.Boolean] = js.undefined,
    blur: BlurEvent = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    focus: IgFocusEvent = null,
    height: java.lang.String | scala.Double = null,
    iconClass: java.lang.String = null,
    inputName: java.lang.String = null,
    keydown: KeydownEvent = null,
    keypress: KeypressEvent = null,
    keyup: KeyupEvent = null,
    language: java.lang.String = null,
    locale: js.Any = null,
    mousedown: MousedownEvent = null,
    mousemove: MousemoveEvent = null,
    mouseout: MouseoutEvent = null,
    mouseover: MouseoverEvent = null,
    mouseup: MouseupEvent = null,
    nullValue: js.Any = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    regional: java.lang.String | js.Object = null,
    rendered: RenderedEvent = null,
    rendering: RenderingEvent = null,
    size: java.lang.String = null,
    tabIndex: scala.Int | scala.Double = null,
    validatorOptions: js.Any = null,
    value: js.Any = null,
    valueChanged: ValueChangedEvent = null,
    valueChanging: ValueChangingEvent = null,
    width: java.lang.String | scala.Double = null
  ): IgCheckboxEditor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowNullValue)) __obj.updateDynamic("allowNullValue")(allowNullValue)
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (keydown != null) __obj.updateDynamic("keydown")(keydown)
    if (keypress != null) __obj.updateDynamic("keypress")(keypress)
    if (keyup != null) __obj.updateDynamic("keyup")(keyup)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mousedown != null) __obj.updateDynamic("mousedown")(mousedown)
    if (mousemove != null) __obj.updateDynamic("mousemove")(mousemove)
    if (mouseout != null) __obj.updateDynamic("mouseout")(mouseout)
    if (mouseover != null) __obj.updateDynamic("mouseover")(mouseover)
    if (mouseup != null) __obj.updateDynamic("mouseup")(mouseup)
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(rendered)
    if (rendering != null) __obj.updateDynamic("rendering")(rendering)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (validatorOptions != null) __obj.updateDynamic("validatorOptions")(validatorOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueChanged != null) __obj.updateDynamic("valueChanged")(valueChanged)
    if (valueChanging != null) __obj.updateDynamic("valueChanging")(valueChanging)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgCheckboxEditor]
  }
}

