package typings
package luxonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeConfig extends js.Object {
  var includeConfig: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IncludeConfig {
  @scala.inline
  def apply(includeConfig: js.UndefOr[scala.Boolean] = js.undefined): Anon_IncludeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeConfig)) __obj.updateDynamic("includeConfig")(includeConfig)
    __obj.asInstanceOf[Anon_IncludeConfig]
  }
}

