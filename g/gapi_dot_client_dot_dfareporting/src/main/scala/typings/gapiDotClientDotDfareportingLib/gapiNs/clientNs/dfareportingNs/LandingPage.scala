package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LandingPage extends js.Object {
  /**
    * Whether or not this landing page will be assigned to any ads or creatives that do not have a landing page assigned explicitly. Only one default landing
    * page is allowed per campaign.
    */
  var default: js.UndefOr[scala.Boolean] = js.undefined
  /** ID of this landing page. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#landingPage". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of this landing page. This is a required field. It must be less than 256 characters long, and must be unique among landing pages of the same
    * campaign.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** URL of this landing page. This is a required field. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object LandingPage {
  @scala.inline
  def apply(
    default: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    url: java.lang.String = null
  ): LandingPage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[LandingPage]
  }
}

