package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigVersionsResource extends js.Object {
  /**
    * Lists the last few versions of the device configuration in descending
    * order (i.e.: newest first).
    */
  def list(request: gapiDotClientDotCloudiotLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListDeviceConfigVersionsResponse]
}

object ConfigVersionsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotCloudiotLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListDeviceConfigVersionsResponse]
    ]
  ): ConfigVersionsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[ConfigVersionsResource]
  }
}

