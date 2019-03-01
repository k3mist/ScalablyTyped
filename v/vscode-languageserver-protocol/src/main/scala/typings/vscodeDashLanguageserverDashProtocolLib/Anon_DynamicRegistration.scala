package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DynamicRegistration extends js.Object {
  /**
    * Whether implementation supports dynamic registration for selection range providers. If this is set to `true`
    * the client supports the new `(SelectionRangeProviderOptions & TextDocumentRegistrationOptions & StaticRegistrationOptions)`
    * return value for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DynamicRegistration {
  @scala.inline
  def apply(dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined): Anon_DynamicRegistration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration)
    __obj.asInstanceOf[Anon_DynamicRegistration]
  }
}

