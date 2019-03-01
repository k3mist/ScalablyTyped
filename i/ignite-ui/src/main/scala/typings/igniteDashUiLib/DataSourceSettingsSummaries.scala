package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettingsSummaries
  extends /**
	 * Option for DataSourceSettingsSummaries
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * A list of column settings that specifies custom summaries options per column basis
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Key for retrieving data from the summaries response - used only when summaries are remote
  	 *
  	 */
  var summariesResponseKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Determines when the summary values are calculated
  	 *
  	 *
  	 * Valid values:
  	 * "priortofilteringandpaging"
  	 * "afterfilteringbeforepaging"
  	 * "afterfilteringandpaging"
  	 */
  var summaryExecution: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Url key for retrieving data from response - used only when summaries are remote
  	 *
  	 */
  var summaryExprUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies whether summaries will be applied locally or remotely (via a remote request)
  	 *
  	 *
  	 * Valid values:
  	 * "remote" A remote request is done and URL params encoded
  	 * "local" Data is paged client-side.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceSettingsSummaries {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for DataSourceSettingsSummaries
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    columnSettings: js.Array[_] = null,
    summariesResponseKey: java.lang.String = null,
    summaryExecution: java.lang.String = null,
    summaryExprUrlKey: java.lang.String = null,
    `type`: java.lang.String = null
  ): DataSourceSettingsSummaries = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings)
    if (summariesResponseKey != null) __obj.updateDynamic("summariesResponseKey")(summariesResponseKey)
    if (summaryExecution != null) __obj.updateDynamic("summaryExecution")(summaryExecution)
    if (summaryExprUrlKey != null) __obj.updateDynamic("summaryExprUrlKey")(summaryExprUrlKey)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataSourceSettingsSummaries]
  }
}

