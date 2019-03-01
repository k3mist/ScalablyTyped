package typings
package gapiDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait channelBanners extends js.Object {
  /**
    * Uploads a channel banner to YouTube.
    */
  def insert(`object`: gapiDotYoutubeLib.Anon_OnBehalfOfContentOwner): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeChannelBannerResource]
}

object channelBanners {
  @scala.inline
  def apply(
    insert: js.Function1[
      gapiDotYoutubeLib.Anon_OnBehalfOfContentOwner, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeChannelBannerResource]
    ]
  ): channelBanners = {
    val __obj = js.Dynamic.literal(insert = insert)
  
    __obj.asInstanceOf[channelBanners]
  }
}

