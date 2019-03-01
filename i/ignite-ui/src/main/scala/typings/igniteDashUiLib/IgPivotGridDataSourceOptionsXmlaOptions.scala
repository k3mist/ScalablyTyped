package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotGridDataSourceOptionsXmlaOptions
  extends /**
	 * Option for IgPivotGridDataSourceOptionsXmlaOptions
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * The catalog name.
  	 */
  var catalog: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The name of the cube in the data source.
  	 */
  var cube: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Additional properties sent with every discover request.
  	 * The object is treated as a key/value store where each property name is used as the key and the property value as the value.
  	 */
  var discoverProperties: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Enables/disables caching of the XMLA result object.
  	 */
  var enableResultCache: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Additional properties sent with every execute request.
  	 * The object is treated as a key/value store where each property name is used as the key and the property value as the value.
  	 */
  var executeProperties: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Optional="true" a javascript object containing information about how the request to the xmla server should be processed
  	 */
  var mdxSettings: js.UndefOr[IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings] = js.undefined
  /**
  	 * The name of the measure group in the data source.
  	 */
  var measureGroup: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * An object containing information about how the request to the XMLA server should be processed.
  	 */
  var requestOptions: js.UndefOr[IgPivotGridDataSourceOptionsXmlaOptionsRequestOptions] = js.undefined
  /**
  	 * Optional="false" The URL of the XMLA server.
  	 */
  var serverUrl: js.UndefOr[java.lang.String] = js.undefined
}

object IgPivotGridDataSourceOptionsXmlaOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotGridDataSourceOptionsXmlaOptions
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    catalog: java.lang.String = null,
    cube: java.lang.String = null,
    discoverProperties: js.Any = null,
    enableResultCache: js.UndefOr[scala.Boolean] = js.undefined,
    executeProperties: js.Any = null,
    mdxSettings: IgPivotGridDataSourceOptionsXmlaOptionsMdxSettings = null,
    measureGroup: java.lang.String = null,
    requestOptions: IgPivotGridDataSourceOptionsXmlaOptionsRequestOptions = null,
    serverUrl: java.lang.String = null
  ): IgPivotGridDataSourceOptionsXmlaOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (catalog != null) __obj.updateDynamic("catalog")(catalog)
    if (cube != null) __obj.updateDynamic("cube")(cube)
    if (discoverProperties != null) __obj.updateDynamic("discoverProperties")(discoverProperties)
    if (!js.isUndefined(enableResultCache)) __obj.updateDynamic("enableResultCache")(enableResultCache)
    if (executeProperties != null) __obj.updateDynamic("executeProperties")(executeProperties)
    if (mdxSettings != null) __obj.updateDynamic("mdxSettings")(mdxSettings)
    if (measureGroup != null) __obj.updateDynamic("measureGroup")(measureGroup)
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (serverUrl != null) __obj.updateDynamic("serverUrl")(serverUrl)
    __obj.asInstanceOf[IgPivotGridDataSourceOptionsXmlaOptions]
  }
}

