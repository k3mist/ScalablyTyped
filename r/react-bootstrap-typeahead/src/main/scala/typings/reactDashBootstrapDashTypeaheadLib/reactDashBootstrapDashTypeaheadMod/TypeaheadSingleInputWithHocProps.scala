package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps, keyof react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps>> ]: react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps[P]} */ trait TypeaheadSingleInputWithHocProps[T /* <: TypeaheadModel */] extends InputContainerPropsSingle[T]

object TypeaheadSingleInputWithHocProps {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    `aria-activedescendant`: java.lang.String,
    `aria-autocomplete`: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.list | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.both,
    `aria-expanded`: scala.Boolean | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.`true` | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.`false`,
    `aria-haspopup`: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.listbox,
    `aria-owns`: java.lang.String,
    autoComplete: java.lang.String,
    disabled: scala.Boolean,
    inputRef: reactLib.reactMod.ReactNs.LegacyRef[reactLib.HTMLInputElement],
    onBlur: js.Function1[reactLib.Event, scala.Unit],
    onChange: js.Function1[js.Array[T], scala.Unit],
    onClick: js.Function1[reactLib.Event, scala.Unit],
    onFocus: js.Function1[reactLib.Event, scala.Unit],
    onKeyDown: js.Function1[reactLib.Event, scala.Unit],
    role: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.combobox,
    value: java.lang.String,
    placeholder: java.lang.String = null
  ): TypeaheadSingleInputWithHocProps[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete, disabled = disabled, inputRef = inputRef.asInstanceOf[js.Any], onBlur = onBlur, onChange = onChange, onClick = onClick, onFocus = onFocus, onKeyDown = onKeyDown, role = role, value = value)
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`)
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`)
    __obj.updateDynamic("aria-owns")(`aria-owns`)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[TypeaheadSingleInputWithHocProps[T]]
  }
}

