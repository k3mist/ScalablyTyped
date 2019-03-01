package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemStatus extends js.Object {
  /** This resource's privacy status. */
  var privacyStatus: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistItemStatus {
  @scala.inline
  def apply(privacyStatus: java.lang.String = null): PlaylistItemStatus = {
    val __obj = js.Dynamic.literal()
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus)
    __obj.asInstanceOf[PlaylistItemStatus]
  }
}

