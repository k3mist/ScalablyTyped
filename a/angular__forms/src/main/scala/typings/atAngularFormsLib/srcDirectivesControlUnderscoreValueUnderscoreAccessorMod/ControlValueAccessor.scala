package typings
package atAngularFormsLib.srcDirectivesControlUnderscoreValueUnderscoreAccessorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlValueAccessor extends js.Object {
  /**
    * @description
    * Function that is called by the forms API when the control status changes to
    * or from 'DISABLED'. Depending on the status, it enables or disables the
    * appropriate DOM element.
    *
    * @usageNotes
    * The following is an example of writing the disabled property to a native DOM element:
    *
    * ```ts
    * setDisabledState(isDisabled: boolean): void {
    *   this._renderer.setProperty(this._elementRef.nativeElement, 'disabled', isDisabled);
    * }
    * ```
    *
    * @param isDisabled The disabled status to set on the element
    */
  var setDisabledState: js.UndefOr[js.Function1[/* isDisabled */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * @description
    * Registers a callback function that is called when the control's value
    * changes in the UI.
    *
    * This method is called by the forms API on initialization to update the form
    * model when values propagate from the view to the model.
    *
    * When implementing the `registerOnChange` method in your own value accessor,
    * save the given function so your class calls it at the appropriate time.
    *
    * @usageNotes
    * ### Store the change function
    *
    * The following example stores the provided function as an internal method.
    *
    * ```ts
    * registerOnChange(fn: (_: any) => void): void {
    *   this._onChange = fn;
    * }
    * ```
    *
    * When the value changes in the UI, call the registered
    * function to allow the forms API to update itself:
    *
    * ```ts
    * host: {
    *    (change): '_onChange($event.target.value)'
    * }
    * ```
    *
    * @param fn The callback function to register
    */
  def registerOnChange(fn: js.Any): scala.Unit
  /**
    * @description
    * Registers a callback function is called by the forms API on initialization
    * to update the form model on blur.
    *
    * When implementing `registerOnTouched` in your own value accessor, save the given
    * function so your class calls it when the control should be considered
    * blurred or "touched".
    *
    * @usageNotes
    * ### Store the callback function
    *
    * The following example stores the provided function as an internal method.
    *
    * ```ts
    * registerOnTouched(fn: any): void {
    *   this._onTouched = fn;
    * }
    * ```
    *
    * On blur (or equivalent), your class should call the registered function to allow
    * the forms API to update itself:
    *
    * ```ts
    * host: {
    *    '(blur)': '_onTouched()'
    * }
    * ```
    *
    * @param fn The callback function to register
    */
  def registerOnTouched(fn: js.Any): scala.Unit
  /**
    * @description
    * Writes a new value to the element.
    *
    * This method is called by the forms API to write to the view when programmatic
    * changes from model to view are requested.
    *
    * @usageNotes
    * ### Write a value to the element
    *
    * The following example writes a value to the native DOM element.
    *
    * ```ts
    * writeValue(value: any): void {
    *   this._renderer.setProperty(this._elementRef.nativeElement, 'value', value);
    * }
    * ```
    *
    * @param obj The new value for the element
    */
  def writeValue(obj: js.Any): scala.Unit
}

object ControlValueAccessor {
  @scala.inline
  def apply(
    registerOnChange: js.Function1[js.Any, scala.Unit],
    registerOnTouched: js.Function1[js.Any, scala.Unit],
    writeValue: js.Function1[js.Any, scala.Unit],
    setDisabledState: js.Function1[/* isDisabled */ scala.Boolean, scala.Unit] = null
  ): ControlValueAccessor = {
    val __obj = js.Dynamic.literal(registerOnChange = registerOnChange, registerOnTouched = registerOnTouched, writeValue = writeValue)
    if (setDisabledState != null) __obj.updateDynamic("setDisabledState")(setDisabledState)
    __obj.asInstanceOf[ControlValueAccessor]
  }
}

