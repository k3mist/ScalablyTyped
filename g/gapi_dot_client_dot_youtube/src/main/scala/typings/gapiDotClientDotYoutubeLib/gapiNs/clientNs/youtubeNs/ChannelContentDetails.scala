package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelContentDetails extends js.Object {
  var relatedPlaylists: js.UndefOr[gapiDotClientDotYoutubeLib.Anon_Favorites] = js.undefined
}

object ChannelContentDetails {
  @scala.inline
  def apply(relatedPlaylists: gapiDotClientDotYoutubeLib.Anon_Favorites = null): ChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    if (relatedPlaylists != null) __obj.updateDynamic("relatedPlaylists")(relatedPlaylists)
    __obj.asInstanceOf[ChannelContentDetails]
  }
}

