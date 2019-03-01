package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettingsPaging
  extends /**
	 * Option for DataSourceSettingsPaging
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Whether when a new page of data is requested we should append the new data to the existing data
  	 *
  	 */
  var appendPage: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Paging is not enabled by default
  	 *
  	 */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Current page index
  	 *
  	 */
  var pageIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested page index
  	 *
  	 */
  var pageIndexUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Number of records on each page
  	 *
  	 */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested page size
  	 *
  	 */
  var pageSizeUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Type for the paging operation
  	 *
  	 *
  	 * Valid values:
  	 * "local" Data is paged client-side.
  	 * "remote" A remote request is done and URL params encoded
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceSettingsPaging {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for DataSourceSettingsPaging
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    appendPage: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    pageIndex: scala.Int | scala.Double = null,
    pageIndexUrlKey: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageSizeUrlKey: java.lang.String = null,
    `type`: java.lang.String = null
  ): DataSourceSettingsPaging = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(appendPage)) __obj.updateDynamic("appendPage")(appendPage)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (pageIndex != null) __obj.updateDynamic("pageIndex")(pageIndex.asInstanceOf[js.Any])
    if (pageIndexUrlKey != null) __obj.updateDynamic("pageIndexUrlKey")(pageIndexUrlKey)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizeUrlKey != null) __obj.updateDynamic("pageSizeUrlKey")(pageSizeUrlKey)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataSourceSettingsPaging]
  }
}

