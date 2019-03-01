package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizedKeysView extends js.Object {
  /** [Output Only] The list of authorized public keys in SSH format. */
  var keys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** [Output Only] Whether the user has the ability to elevate on the instance that requested the authorized keys. */
  var sudoer: js.UndefOr[scala.Boolean] = js.undefined
}

object AuthorizedKeysView {
  @scala.inline
  def apply(keys: js.Array[java.lang.String] = null, sudoer: js.UndefOr[scala.Boolean] = js.undefined): AuthorizedKeysView = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (!js.isUndefined(sudoer)) __obj.updateDynamic("sudoer")(sudoer)
    __obj.asInstanceOf[AuthorizedKeysView]
  }
}

