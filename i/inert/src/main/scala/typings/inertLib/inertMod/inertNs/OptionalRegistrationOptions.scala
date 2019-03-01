package typings
package inertLib.inertMod.inertNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * inert accepts the following registration options
  * @see {@link https://github.com/hapijs/inert#registration-options}
  */
trait OptionalRegistrationOptions extends js.Object {
  /**
    * sets the maximum number of file etag hash values stored in the etags cache. Defaults to 10000.
    */
  var etagsCacheMaxSize: js.UndefOr[scala.Double] = js.undefined
}

object OptionalRegistrationOptions {
  @scala.inline
  def apply(etagsCacheMaxSize: scala.Int | scala.Double = null): OptionalRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (etagsCacheMaxSize != null) __obj.updateDynamic("etagsCacheMaxSize")(etagsCacheMaxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalRegistrationOptions]
  }
}

