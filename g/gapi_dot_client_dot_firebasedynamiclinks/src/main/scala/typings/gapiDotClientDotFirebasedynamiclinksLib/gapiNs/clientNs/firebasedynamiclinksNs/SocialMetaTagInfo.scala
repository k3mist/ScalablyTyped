package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialMetaTagInfo extends js.Object {
  /** A short description of the link. Optional. */
  var socialDescription: js.UndefOr[java.lang.String] = js.undefined
  /** An image url string. Optional. */
  var socialImageLink: js.UndefOr[java.lang.String] = js.undefined
  /** Title to be displayed. Optional. */
  var socialTitle: js.UndefOr[java.lang.String] = js.undefined
}

object SocialMetaTagInfo {
  @scala.inline
  def apply(
    socialDescription: java.lang.String = null,
    socialImageLink: java.lang.String = null,
    socialTitle: java.lang.String = null
  ): SocialMetaTagInfo = {
    val __obj = js.Dynamic.literal()
    if (socialDescription != null) __obj.updateDynamic("socialDescription")(socialDescription)
    if (socialImageLink != null) __obj.updateDynamic("socialImageLink")(socialImageLink)
    if (socialTitle != null) __obj.updateDynamic("socialTitle")(socialTitle)
    __obj.asInstanceOf[SocialMetaTagInfo]
  }
}

