package typings
package saml20Lib.saml20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptionsWithKey extends ValidationOptions {
  var audience: js.UndefOr[js.Any] = js.undefined
  var bypassExpiration: js.UndefOr[scala.Boolean] = js.undefined
  var publicKey: java.lang.String
}

object ValidationOptionsWithKey {
  @scala.inline
  def apply(
    publicKey: java.lang.String,
    audience: js.Any = null,
    bypassExpiration: js.UndefOr[scala.Boolean] = js.undefined
  ): ValidationOptionsWithKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (!js.isUndefined(bypassExpiration)) __obj.updateDynamic("bypassExpiration")(bypassExpiration)
    __obj.asInstanceOf[ValidationOptionsWithKey]
  }
}

