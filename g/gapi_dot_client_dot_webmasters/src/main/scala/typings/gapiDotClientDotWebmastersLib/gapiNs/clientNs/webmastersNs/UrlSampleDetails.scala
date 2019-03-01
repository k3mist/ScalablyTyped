package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlSampleDetails extends js.Object {
  /** List of sitemaps pointing at this URL. */
  var containingSitemaps: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A sample set of URLs linking to this URL. */
  var linkedFromUrls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object UrlSampleDetails {
  @scala.inline
  def apply(
    containingSitemaps: js.Array[java.lang.String] = null,
    linkedFromUrls: js.Array[java.lang.String] = null
  ): UrlSampleDetails = {
    val __obj = js.Dynamic.literal()
    if (containingSitemaps != null) __obj.updateDynamic("containingSitemaps")(containingSitemaps)
    if (linkedFromUrls != null) __obj.updateDynamic("linkedFromUrls")(linkedFromUrls)
    __obj.asInstanceOf[UrlSampleDetails]
  }
}

