package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FanFundingEventsResource extends js.Object {
  /** Lists fan funding events for a channel. */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsHl): gapiDotClientLib.gapiNs.clientNs.Request[FanFundingEventListResponse]
}

object FanFundingEventsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltFieldsHl, 
      gapiDotClientLib.gapiNs.clientNs.Request[FanFundingEventListResponse]
    ]
  ): FanFundingEventsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[FanFundingEventsResource]
  }
}

