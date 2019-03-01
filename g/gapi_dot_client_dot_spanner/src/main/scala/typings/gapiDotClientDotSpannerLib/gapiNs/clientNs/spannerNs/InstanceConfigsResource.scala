package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceConfigsResource extends js.Object {
  /** Gets information about a particular instance configuration. */
  def get(request: gapiDotClientDotSpannerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[InstanceConfig]
  /** Lists the supported instance configurations for a given project. */
  def list(request: gapiDotClientDotSpannerLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListInstanceConfigsResponse]
}

object InstanceConfigsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotSpannerLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[InstanceConfig]
    ],
    list: js.Function1[
      gapiDotClientDotSpannerLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListInstanceConfigsResponse]
    ]
  ): InstanceConfigsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[InstanceConfigsResource]
  }
}

