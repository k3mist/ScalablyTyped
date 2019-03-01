package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomChannel extends js.Object {
  /** Code of this custom channel, not necessarily unique across ad clients. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier of this custom channel. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adsensehost#customChannel. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this custom channel. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object CustomChannel {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null
  ): CustomChannel = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CustomChannel]
  }
}

