package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessPolicy extends js.Object {
  /** The value of allowed indicates whether the access to the policy is allowed or denied by default. */
  var allowed: js.UndefOr[scala.Boolean] = js.undefined
  /** A list of region codes that identify countries where the default policy do not apply. */
  var exception: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AccessPolicy {
  @scala.inline
  def apply(allowed: js.UndefOr[scala.Boolean] = js.undefined, exception: js.Array[java.lang.String] = null): AccessPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowed)) __obj.updateDynamic("allowed")(allowed)
    if (exception != null) __obj.updateDynamic("exception")(exception)
    __obj.asInstanceOf[AccessPolicy]
  }
}

