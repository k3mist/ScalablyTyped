package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionsResource extends js.Object {
  /** List the metadata for the dimensions available to this AdSense account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Metadata]
}

object DimensionsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAdsenseLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Metadata]
    ]
  ): DimensionsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[DimensionsResource]
  }
}

