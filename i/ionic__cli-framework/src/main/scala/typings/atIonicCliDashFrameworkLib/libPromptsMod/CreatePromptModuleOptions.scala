package typings
package atIonicCliDashFrameworkLib.libPromptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePromptModuleOptions extends js.Object {
  val interactive: js.UndefOr[scala.Boolean] = js.undefined
  val onFallback: js.UndefOr[js.Function1[/* question */ PromptQuestion, PromptValue | scala.Unit]] = js.undefined
}

object CreatePromptModuleOptions {
  @scala.inline
  def apply(
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    onFallback: js.Function1[/* question */ PromptQuestion, PromptValue | scala.Unit] = null
  ): CreatePromptModuleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (onFallback != null) __obj.updateDynamic("onFallback")(onFallback)
    __obj.asInstanceOf[CreatePromptModuleOptions]
  }
}

