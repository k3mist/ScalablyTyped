package typings
package officeDashJsDashPreviewLib.OfficeExtensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides an option for suppressing an error when the object that is used to set multiple properties tries to set read-only properties.
  */
trait UpdateOptions extends js.Object {
  /**
    * Throw an error if the passed-in property list includes read-only properties (default = true).
    */
  var throwOnReadOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object UpdateOptions {
  @scala.inline
  def apply(throwOnReadOnly: js.UndefOr[scala.Boolean] = js.undefined): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(throwOnReadOnly)) __obj.updateDynamic("throwOnReadOnly")(throwOnReadOnly)
    __obj.asInstanceOf[UpdateOptions]
  }
}

