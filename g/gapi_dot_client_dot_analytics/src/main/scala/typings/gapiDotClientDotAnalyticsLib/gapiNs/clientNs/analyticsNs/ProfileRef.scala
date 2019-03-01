package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileRef extends js.Object {
  /** Account ID to which this view (profile) belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Link for this view (profile). */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** View (Profile) ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Internal ID for the web property to which this view (profile) belongs. */
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** Analytics view (profile) reference. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this view (profile). */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY to which this view (profile) belongs. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object ProfileRef {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    href: java.lang.String = null,
    id: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    webPropertyId: java.lang.String = null
  ): ProfileRef = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (href != null) __obj.updateDynamic("href")(href)
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[ProfileRef]
  }
}

