package typings
package reactDashSelectLib.libAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[OptionType] extends js.Object {
  var defaultOptions: js.UndefOr[reactDashSelectLib.libTypesMod.OptionsType[OptionType]] = js.undefined
  var inputValue: java.lang.String
  var isLoading: scala.Boolean
  var loadedInputValue: js.UndefOr[java.lang.String] = js.undefined
  var loadedOptions: reactDashSelectLib.libTypesMod.OptionsType[OptionType]
  var passEmptyOptions: scala.Boolean
}

object State {
  @scala.inline
  def apply[OptionType](
    inputValue: java.lang.String,
    isLoading: scala.Boolean,
    loadedOptions: reactDashSelectLib.libTypesMod.OptionsType[OptionType],
    passEmptyOptions: scala.Boolean,
    defaultOptions: reactDashSelectLib.libTypesMod.OptionsType[OptionType] = null,
    loadedInputValue: java.lang.String = null
  ): State[OptionType] = {
    val __obj = js.Dynamic.literal(inputValue = inputValue, isLoading = isLoading, loadedOptions = loadedOptions, passEmptyOptions = passEmptyOptions)
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    if (loadedInputValue != null) __obj.updateDynamic("loadedInputValue")(loadedInputValue)
    __obj.asInstanceOf[State[OptionType]]
  }
}

