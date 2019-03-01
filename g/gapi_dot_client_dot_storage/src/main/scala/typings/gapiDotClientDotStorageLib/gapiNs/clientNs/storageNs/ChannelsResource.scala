package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Stop watching resources through this channel */
  def stop(request: gapiDotClientDotStorageLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object ChannelsResource {
  @scala.inline
  def apply(
    stop: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ]
  ): ChannelsResource = {
    val __obj = js.Dynamic.literal(stop = stop)
  
    __obj.asInstanceOf[ChannelsResource]
  }
}

