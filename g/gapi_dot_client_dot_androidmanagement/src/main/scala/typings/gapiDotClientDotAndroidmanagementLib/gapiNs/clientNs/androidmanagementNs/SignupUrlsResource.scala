package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignupUrlsResource extends js.Object {
  /** Creates an enterprise signup URL. */
  def create(request: gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackCallbackUrl): gapiDotClientLib.gapiNs.clientNs.Request[SignupUrl]
}

object SignupUrlsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotAndroidmanagementLib.Anon_AccesstokenAltBearertokenCallbackCallbackUrl, 
      gapiDotClientLib.gapiNs.clientNs.Request[SignupUrl]
    ]
  ): SignupUrlsResource = {
    val __obj = js.Dynamic.literal(create = create)
  
    __obj.asInstanceOf[SignupUrlsResource]
  }
}

