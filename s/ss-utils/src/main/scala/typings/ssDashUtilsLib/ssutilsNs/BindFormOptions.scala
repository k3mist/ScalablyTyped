package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindFormOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var onSubmitDisable: js.UndefOr[java.lang.String] = js.undefined
  var validate: js.UndefOr[js.Function1[/* form */ stdLib.HTMLFormElement, scala.Boolean]] = js.undefined
  var validation: js.UndefOr[ValidationOptional] = js.undefined
}

object BindFormOptions {
  @scala.inline
  def apply(
    complete: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    error: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    onSubmitDisable: java.lang.String = null,
    validate: js.Function1[/* form */ stdLib.HTMLFormElement, scala.Boolean] = null,
    validation: ValidationOptional = null
  ): BindFormOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (error != null) __obj.updateDynamic("error")(error)
    if (onSubmitDisable != null) __obj.updateDynamic("onSubmitDisable")(onSubmitDisable)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    if (validation != null) __obj.updateDynamic("validation")(validation)
    __obj.asInstanceOf[BindFormOptions]
  }
}

