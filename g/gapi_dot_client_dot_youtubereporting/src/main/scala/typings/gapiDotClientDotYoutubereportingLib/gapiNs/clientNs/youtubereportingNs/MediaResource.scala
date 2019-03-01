package typings
package gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaResource extends js.Object {
  /**
    * Method for media download. Download is supported
    * on the URI `/v1/media/{+name}?alt=media`.
    */
  def download(request: gapiDotClientDotYoutubereportingLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Media]
}

object MediaResource {
  @scala.inline
  def apply(
    download: js.Function1[
      gapiDotClientDotYoutubereportingLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Media]
    ]
  ): MediaResource = {
    val __obj = js.Dynamic.literal(download = download)
  
    __obj.asInstanceOf[MediaResource]
  }
}

