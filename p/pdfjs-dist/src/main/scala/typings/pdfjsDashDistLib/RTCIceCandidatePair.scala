package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceCandidatePair extends js.Object {
  var local: js.UndefOr[RTCIceCandidate] = js.undefined
  var remote: js.UndefOr[RTCIceCandidate] = js.undefined
}

object RTCIceCandidatePair {
  @scala.inline
  def apply(local: RTCIceCandidate = null, remote: RTCIceCandidate = null): RTCIceCandidatePair = {
    val __obj = js.Dynamic.literal()
    if (local != null) __obj.updateDynamic("local")(local)
    if (remote != null) __obj.updateDynamic("remote")(remote)
    __obj.asInstanceOf[RTCIceCandidatePair]
  }
}

