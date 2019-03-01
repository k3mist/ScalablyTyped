package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagSetting extends js.Object {
  /**
    * Additional key-values to be included in tags. Each key-value pair must be of the form key=value, and pairs must be separated by a semicolon (;). Keys
    * and values must not contain commas. For example, id=2;color=red is a valid value for this field.
    */
  var additionalKeyValues: js.UndefOr[java.lang.String] = js.undefined
  /** Whether static landing page URLs should be included in the tags. This setting applies only to placements. */
  var includeClickThroughUrls: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether click-tracking string should be included in the tags. */
  var includeClickTracking: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Option specifying how keywords are embedded in ad tags. This setting can be used to specify whether keyword placeholders are inserted in placement tags
    * for this site. Publishers can then add keywords to those placeholders.
    */
  var keywordOption: js.UndefOr[java.lang.String] = js.undefined
}

object TagSetting {
  @scala.inline
  def apply(
    additionalKeyValues: java.lang.String = null,
    includeClickThroughUrls: js.UndefOr[scala.Boolean] = js.undefined,
    includeClickTracking: js.UndefOr[scala.Boolean] = js.undefined,
    keywordOption: java.lang.String = null
  ): TagSetting = {
    val __obj = js.Dynamic.literal()
    if (additionalKeyValues != null) __obj.updateDynamic("additionalKeyValues")(additionalKeyValues)
    if (!js.isUndefined(includeClickThroughUrls)) __obj.updateDynamic("includeClickThroughUrls")(includeClickThroughUrls)
    if (!js.isUndefined(includeClickTracking)) __obj.updateDynamic("includeClickTracking")(includeClickTracking)
    if (keywordOption != null) __obj.updateDynamic("keywordOption")(keywordOption)
    __obj.asInstanceOf[TagSetting]
  }
}

