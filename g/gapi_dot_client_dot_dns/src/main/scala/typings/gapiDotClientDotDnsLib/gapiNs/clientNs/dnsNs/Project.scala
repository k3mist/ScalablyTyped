package typings
package gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  /** User assigned unique identifier for the resource (output only). */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dns#project". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Unique numeric identifier for the resource; defined by the server (output only). */
  var number: js.UndefOr[java.lang.String] = js.undefined
  /** Quotas assigned to this project (output only). */
  var quota: js.UndefOr[Quota] = js.undefined
}

object Project {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    kind: java.lang.String = null,
    number: java.lang.String = null,
    quota: Quota = null
  ): Project = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (number != null) __obj.updateDynamic("number")(number)
    if (quota != null) __obj.updateDynamic("quota")(quota)
    __obj.asInstanceOf[Project]
  }
}

