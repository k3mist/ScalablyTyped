package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeepPadding extends js.Object {
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[jointjsLib.jointjsMod.diaNs.Padding] = js.undefined
}

object Anon_DeepPadding {
  @scala.inline
  def apply(
    deep: js.UndefOr[scala.Boolean] = js.undefined,
    padding: jointjsLib.jointjsMod.diaNs.Padding = null
  ): Anon_DeepPadding = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeepPadding]
  }
}

