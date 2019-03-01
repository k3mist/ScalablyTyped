package typings
package validatorLib.ValidatorJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options for isFQDN
trait IsFQDNOptions extends js.Object {
  var allow_trailing_dot: js.UndefOr[scala.Boolean] = js.undefined
  var allow_underscores: js.UndefOr[scala.Boolean] = js.undefined
  var require_tld: js.UndefOr[scala.Boolean] = js.undefined
}

object IsFQDNOptions {
  @scala.inline
  def apply(
    allow_trailing_dot: js.UndefOr[scala.Boolean] = js.undefined,
    allow_underscores: js.UndefOr[scala.Boolean] = js.undefined,
    require_tld: js.UndefOr[scala.Boolean] = js.undefined
  ): IsFQDNOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_trailing_dot)) __obj.updateDynamic("allow_trailing_dot")(allow_trailing_dot)
    if (!js.isUndefined(allow_underscores)) __obj.updateDynamic("allow_underscores")(allow_underscores)
    if (!js.isUndefined(require_tld)) __obj.updateDynamic("require_tld")(require_tld)
    __obj.asInstanceOf[IsFQDNOptions]
  }
}

