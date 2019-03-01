package typings
package reactDashSelectLib.libAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncProps[OptionType] extends js.Object {
  /* If cacheOptions is truthy, then the loaded data will be cached. The cache
    will remain until `cacheOptions` changes value.
    Default: false. */
  var cacheOptions: js.UndefOr[js.Any] = js.undefined
  /* The default set of options to show before the user starts searching. When
    set to `true`, the results for loadOptions('') will be autoloaded.
    Default: false. */
  var defaultOptions: js.UndefOr[reactDashSelectLib.libTypesMod.OptionsType[OptionType] | scala.Boolean] = js.undefined
  /* Function that returns a promise, which is the set of options to be used
    once the promise resolves. */
  def loadOptions(
    inputValue: java.lang.String,
    callback: js.Function1[/* options */ reactDashSelectLib.libTypesMod.OptionsType[OptionType], scala.Unit]
  ): js.Promise[_] | scala.Unit
}

object AsyncProps {
  @scala.inline
  def apply[OptionType](
    loadOptions: js.Function2[
      java.lang.String, 
      js.Function1[/* options */ reactDashSelectLib.libTypesMod.OptionsType[OptionType], scala.Unit], 
      js.Promise[_] | scala.Unit
    ],
    cacheOptions: js.Any = null,
    defaultOptions: reactDashSelectLib.libTypesMod.OptionsType[OptionType] | scala.Boolean = null
  ): AsyncProps[OptionType] = {
    val __obj = js.Dynamic.literal(loadOptions = loadOptions)
    if (cacheOptions != null) __obj.updateDynamic("cacheOptions")(cacheOptions)
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncProps[OptionType]]
  }
}

