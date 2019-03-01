package typings
package atVueComponentDashCompilerDashUtilsLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTemplateCompilerOptions extends js.Object {
  var modules: js.UndefOr[js.Array[js.Object]] = js.undefined
  var outputSourceRange: js.UndefOr[scala.Boolean] = js.undefined
}

object VueTemplateCompilerOptions {
  @scala.inline
  def apply(modules: js.Array[js.Object] = null, outputSourceRange: js.UndefOr[scala.Boolean] = js.undefined): VueTemplateCompilerOptions = {
    val __obj = js.Dynamic.literal()
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (!js.isUndefined(outputSourceRange)) __obj.updateDynamic("outputSourceRange")(outputSourceRange)
    __obj.asInstanceOf[VueTemplateCompilerOptions]
  }
}

