package typings
package reactDashMaterialDashUiDashFormDashValidatorLib.reactDashMaterialDashUiDashFormDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorFormProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var debounceTime: js.UndefOr[scala.Double] = js.undefined
  var instantValidate: js.UndefOr[scala.Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* errors */ js.Array[_], scala.Unit]] = js.undefined
  def onSubmit(event: reactLib.reactMod.ReactNs.FormEventHandler[reactLib.Element]): scala.Unit
}

object ValidatorFormProps {
  @scala.inline
  def apply(
    onSubmit: js.Function1[reactLib.reactMod.ReactNs.FormEventHandler[reactLib.Element], scala.Unit],
    className: java.lang.String = null,
    debounceTime: scala.Int | scala.Double = null,
    instantValidate: js.UndefOr[scala.Boolean] = js.undefined,
    onError: js.Function1[/* errors */ js.Array[_], scala.Unit] = null
  ): ValidatorFormProps = {
    val __obj = js.Dynamic.literal(onSubmit = onSubmit)
    if (className != null) __obj.updateDynamic("className")(className)
    if (debounceTime != null) __obj.updateDynamic("debounceTime")(debounceTime.asInstanceOf[js.Any])
    if (!js.isUndefined(instantValidate)) __obj.updateDynamic("instantValidate")(instantValidate)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    __obj.asInstanceOf[ValidatorFormProps]
  }
}

