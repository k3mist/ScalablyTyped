package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePlayAnalytics extends js.Object {
  /**
    * [AdWords autotagging parameter](https://support.google.com/analytics/answer/1033981?hl=en);
    * used to measure Google AdWords ads. This value is generated dynamically
    * and should never be modified.
    */
  var gclid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Campaign name; used for keyword analysis to identify a specific product
    * promotion or strategic campaign.
    */
  var utmCampaign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Campaign content; used for A/B testing and content-targeted ads to
    * differentiate ads or links that point to the same URL.
    */
  var utmContent: js.UndefOr[java.lang.String] = js.undefined
  /** Campaign medium; used to identify a medium such as email or cost-per-click. */
  var utmMedium: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Campaign source; used to identify a search engine, newsletter, or other
    * source.
    */
  var utmSource: js.UndefOr[java.lang.String] = js.undefined
  /** Campaign term; used with paid search to supply the keywords for ads. */
  var utmTerm: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePlayAnalytics {
  @scala.inline
  def apply(
    gclid: java.lang.String = null,
    utmCampaign: java.lang.String = null,
    utmContent: java.lang.String = null,
    utmMedium: java.lang.String = null,
    utmSource: java.lang.String = null,
    utmTerm: java.lang.String = null
  ): GooglePlayAnalytics = {
    val __obj = js.Dynamic.literal()
    if (gclid != null) __obj.updateDynamic("gclid")(gclid)
    if (utmCampaign != null) __obj.updateDynamic("utmCampaign")(utmCampaign)
    if (utmContent != null) __obj.updateDynamic("utmContent")(utmContent)
    if (utmMedium != null) __obj.updateDynamic("utmMedium")(utmMedium)
    if (utmSource != null) __obj.updateDynamic("utmSource")(utmSource)
    if (utmTerm != null) __obj.updateDynamic("utmTerm")(utmTerm)
    __obj.asInstanceOf[GooglePlayAnalytics]
  }
}

