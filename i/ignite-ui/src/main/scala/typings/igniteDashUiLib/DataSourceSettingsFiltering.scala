package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettingsFiltering
  extends /**
	 * Option for DataSourceSettingsFiltering
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * If the type of paging/sorting/filtering is local and applyToAllData is true, filtering will be performed on the whole data source that's present locally, otherwise only on the current dataView. if type is remote, this setting doesn't have any effect.
  	 *
  	 */
  var applyToAllData: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Enables or disables case sensitive filtering on the data. Works only for local filtering
  	 *
  	 */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * An object containing custom defined filtering conditions as objects.
  	 *
  	 */
  var customConditions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Can point to either a string or a function object. The parameters that are passed are 1) the data array to be filtered, 2) the filtering expression definitions. Should return an array of the filtered data
  	 *
  	 */
  var customFunc: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Data will be initially filtered accordingly, directly after dataBind()
  	 *
  	 */
  var defaultFields: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * An "SQL-like' encoded expressions string. Takes precedence over "expressions". Example: col2 > 100; col2 LIKE %test%
  	 *
  	 */
  var exprString: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A list of expression objects, containing the following key-value pairs: fieldName, expression (search string), condition , and logic (AND/OR)
  	 *
  	 */
  var expressions: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Url key that will be encoded in the request if remote filtering is performed. Default value of null implies OData-style URL encoding. Please see http://www.odata.org/developers/protocols/uri-conventions for details
  	 *
  	 */
  var filterExprUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Url key that will be encoded in the request, specifying if the filtering logic will be AND or OR
  	 *
  	 */
  var filterLogicUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Filtering type.
  	 *
  	 * Valid values:
  	 * "remote" Parameters will be encoded and it's up to the backend to interpred them from the response.
  	 * "local" The data will be filtered automatically client-side
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceSettingsFiltering {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for DataSourceSettingsFiltering
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    applyToAllData: js.UndefOr[scala.Boolean] = js.undefined,
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    customConditions: js.Any = null,
    customFunc: js.Any = null,
    defaultFields: js.Array[_] = null,
    exprString: java.lang.String = null,
    expressions: js.Array[_] = null,
    filterExprUrlKey: java.lang.String = null,
    filterLogicUrlKey: java.lang.String = null,
    `type`: java.lang.String = null
  ): DataSourceSettingsFiltering = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(applyToAllData)) __obj.updateDynamic("applyToAllData")(applyToAllData)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (customConditions != null) __obj.updateDynamic("customConditions")(customConditions)
    if (customFunc != null) __obj.updateDynamic("customFunc")(customFunc)
    if (defaultFields != null) __obj.updateDynamic("defaultFields")(defaultFields)
    if (exprString != null) __obj.updateDynamic("exprString")(exprString)
    if (expressions != null) __obj.updateDynamic("expressions")(expressions)
    if (filterExprUrlKey != null) __obj.updateDynamic("filterExprUrlKey")(filterExprUrlKey)
    if (filterLogicUrlKey != null) __obj.updateDynamic("filterLogicUrlKey")(filterLogicUrlKey)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DataSourceSettingsFiltering]
  }
}

