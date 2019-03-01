package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignupInfo extends js.Object {
  /** An opaque token that will be required, along with the Enterprise Token, for obtaining the enterprise resource from CompleteSignup. */
  var completionToken: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#signupInfo". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A URL under which the Admin can sign up for an enterprise. The page pointed to cannot be rendered in an iframe. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object SignupInfo {
  @scala.inline
  def apply(
    completionToken: java.lang.String = null,
    kind: java.lang.String = null,
    url: java.lang.String = null
  ): SignupInfo = {
    val __obj = js.Dynamic.literal()
    if (completionToken != null) __obj.updateDynamic("completionToken")(completionToken)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SignupInfo]
  }
}

