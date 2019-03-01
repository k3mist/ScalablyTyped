package typings
package formstateLib.libCoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposibleValidatable[TValue] extends Validatable[TValue] {
  /** Used to tell the parent about validation */
  @JSName("on$ChangeAfterValidation")
  def on$ChangeAfterValidation(): scala.Unit
  @JSName("on$Reinit")
  def on$Reinit(): scala.Unit
  /** Allows a convinient reset for all fields */
  def reset(): scala.Unit
  /** Used by the parent to register listeners */
  def setCompositionParent(config: formstateLib.Anon_OnChangeAfterValidation): scala.Unit
}

object ComposibleValidatable {
  @scala.inline
  def apply[TValue](
    $: TValue,
    enableAutoValidation: js.Function0[scala.Unit],
    hasError: scala.Boolean,
    on$ChangeAfterValidation: js.Function0[scala.Unit],
    on$Reinit: js.Function0[scala.Unit],
    reset: js.Function0[scala.Unit],
    setCompositionParent: js.Function1[formstateLib.Anon_OnChangeAfterValidation, scala.Unit],
    validate: js.Function0[js.Promise[formstateLib.Anon_HasError | formstateLib.Anon_False[TValue]]],
    validating: scala.Boolean,
    error: java.lang.String = null
  ): ComposibleValidatable[TValue] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], enableAutoValidation = enableAutoValidation, hasError = hasError, on$ChangeAfterValidation = on$ChangeAfterValidation, on$Reinit = on$Reinit, reset = reset, setCompositionParent = setCompositionParent, validate = validate, validating = validating)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[ComposibleValidatable[TValue]]
  }
}

