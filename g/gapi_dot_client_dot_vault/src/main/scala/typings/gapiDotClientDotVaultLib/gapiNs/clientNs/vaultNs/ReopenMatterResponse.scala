package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReopenMatterResponse extends js.Object {
  /** The updated matter, with state OPEN. */
  var matter: js.UndefOr[Matter] = js.undefined
}

object ReopenMatterResponse {
  @scala.inline
  def apply(matter: Matter = null): ReopenMatterResponse = {
    val __obj = js.Dynamic.literal()
    if (matter != null) __obj.updateDynamic("matter")(matter)
    __obj.asInstanceOf[ReopenMatterResponse]
  }
}

