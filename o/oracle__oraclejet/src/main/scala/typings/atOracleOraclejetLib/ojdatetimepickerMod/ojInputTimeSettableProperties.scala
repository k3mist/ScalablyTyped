package typings
package atOracleOraclejetLib.ojdatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojInputTimeSettableProperties
  extends atOracleOraclejetLib.ojinputtextMod.inputBaseSettableProperties[java.lang.String, java.lang.String, java.lang.String] {
  var converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter
  var keyboardEdit: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  var max: java.lang.String | scala.Null
  var min: java.lang.String | scala.Null
  var pickerAttributes: atOracleOraclejetLib.Anon_Class
  var renderMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native
  var timePicker: atOracleOraclejetLib.Anon_Focus
  @JSName("translations")
  var translations_ojInputTimeSettableProperties: atOracleOraclejetLib.Anon_AmpmWheelLabel
}

object ojInputTimeSettableProperties {
  @scala.inline
  def apply(
    asyncValidators: js.Array[atOracleOraclejetLib.ojvalidationDashBaseMod.AsyncValidator[java.lang.String]],
    autocomplete: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | java.lang.String,
    autofocus: scala.Boolean,
    converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredConverter,
    disabled: scala.Boolean,
    displayOptions: atOracleOraclejetLib.Anon_ConverterHint,
    help: atOracleOraclejetLib.Anon_Instruction,
    helpHints: atOracleOraclejetLib.Anon_Definition,
    keyboardEdit: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled,
    labelHint: java.lang.String,
    messagesCustom: js.Array[atOracleOraclejetLib.ojmessagingMod.namespaced],
    pickerAttributes: atOracleOraclejetLib.Anon_Class,
    placeholder: java.lang.String,
    rawValue: java.lang.String,
    readonly: scala.Boolean,
    renderMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.jet | atOracleOraclejetLib.atOracleOraclejetLibStrings.native,
    required: scala.Boolean,
    timePicker: atOracleOraclejetLib.Anon_Focus,
    translations: atOracleOraclejetLib.Anon_AmpmWheelLabel,
    valid: atOracleOraclejetLib.atOracleOraclejetLibStrings.valid | atOracleOraclejetLib.atOracleOraclejetLibStrings.pending | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidHidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.invalidShown,
    value: java.lang.String,
    describedBy: java.lang.String = null,
    max: java.lang.String = null,
    min: java.lang.String = null,
    validators: js.Array[
      atOracleOraclejetLib.ojvalidationDashBaseMod.Validator[java.lang.String] | atOracleOraclejetLib.ojvalidationDashBaseMod.ValidationNs.RegisteredValidator
    ] = null
  ): ojInputTimeSettableProperties = {
    val __obj = js.Dynamic.literal(asyncValidators = asyncValidators, autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus, converter = converter.asInstanceOf[js.Any], disabled = disabled, displayOptions = displayOptions, help = help, helpHints = helpHints, keyboardEdit = keyboardEdit.asInstanceOf[js.Any], labelHint = labelHint, messagesCustom = messagesCustom, pickerAttributes = pickerAttributes, placeholder = placeholder, rawValue = rawValue, readonly = readonly, renderMode = renderMode.asInstanceOf[js.Any], required = required, timePicker = timePicker, translations = translations, valid = valid.asInstanceOf[js.Any], value = value)
    if (describedBy != null) __obj.updateDynamic("describedBy")(describedBy)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (validators != null) __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[ojInputTimeSettableProperties]
  }
}

