package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocatorSearchSourceProperties extends SearchSourceProperties {
  /**
    * A string array which limits the results to one or more categories. For example, `Populated Place` or `airport`. Only applicable when using the World Geocode Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#categories)
    */
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Constricts search results to a specified country code. For example, `US` for United States or `SE` for Sweden. Only applies to the World Geocode Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#countryCode)
    */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the sources for local `distance` and `minScale` for searching. See the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#localSearchOptions)
    */
  var localSearchOptions: js.UndefOr[LocatorSearchSourceLocalSearchOptions] = js.undefined
  /**
    * When reverse geocoding a result, use this distance in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locationToAddressDistance)
    *
    * @default 1500
    */
  var locationToAddressDistance: js.UndefOr[scala.Double] = js.undefined
  /**
    * The locator task used to search. This is **required** and defaults to the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#locator)
    */
  var locator: js.UndefOr[LocatorProperties] = js.undefined
  /**
    * The name of the source for display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#name)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A template string used to display multiple fields in a defined order when results are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#searchTemplate)
    */
  var searchTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The field name of the Single Line Address Field in the REST services directory for the locator service. Common values are `SingleLine` and `SingleLineFieldName`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#singleLineFieldName)
    */
  var singleLineFieldName: js.UndefOr[java.lang.String] = js.undefined
}

object LocatorSearchSourceProperties {
  @scala.inline
  def apply(
    autoNavigate: js.UndefOr[scala.Boolean] = js.undefined,
    categories: js.Array[java.lang.String] = null,
    countryCode: java.lang.String = null,
    filter: SearchSourceFilter = null,
    localSearchOptions: LocatorSearchSourceLocalSearchOptions = null,
    locationToAddressDistance: scala.Int | scala.Double = null,
    locator: LocatorProperties = null,
    maxResults: scala.Int | scala.Double = null,
    maxSuggestions: scala.Int | scala.Double = null,
    minSuggestCharacters: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    outFields: js.Array[java.lang.String] = null,
    placeholder: java.lang.String = null,
    popupEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    prefix: java.lang.String = null,
    resultGraphicEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    resultSymbol: SymbolProperties = null,
    searchTemplate: java.lang.String = null,
    singleLineFieldName: java.lang.String = null,
    suffix: java.lang.String = null,
    suggestionsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    withinViewEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    zoomScale: scala.Int | scala.Double = null
  ): LocatorSearchSourceProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoNavigate)) __obj.updateDynamic("autoNavigate")(autoNavigate)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (localSearchOptions != null) __obj.updateDynamic("localSearchOptions")(localSearchOptions)
    if (locationToAddressDistance != null) __obj.updateDynamic("locationToAddressDistance")(locationToAddressDistance.asInstanceOf[js.Any])
    if (locator != null) __obj.updateDynamic("locator")(locator)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxSuggestions != null) __obj.updateDynamic("maxSuggestions")(maxSuggestions.asInstanceOf[js.Any])
    if (minSuggestCharacters != null) __obj.updateDynamic("minSuggestCharacters")(minSuggestCharacters.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (outFields != null) __obj.updateDynamic("outFields")(outFields)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled)
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(resultGraphicEnabled)) __obj.updateDynamic("resultGraphicEnabled")(resultGraphicEnabled)
    if (resultSymbol != null) __obj.updateDynamic("resultSymbol")(resultSymbol)
    if (searchTemplate != null) __obj.updateDynamic("searchTemplate")(searchTemplate)
    if (singleLineFieldName != null) __obj.updateDynamic("singleLineFieldName")(singleLineFieldName)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (!js.isUndefined(suggestionsEnabled)) __obj.updateDynamic("suggestionsEnabled")(suggestionsEnabled)
    if (!js.isUndefined(withinViewEnabled)) __obj.updateDynamic("withinViewEnabled")(withinViewEnabled)
    if (zoomScale != null) __obj.updateDynamic("zoomScale")(zoomScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocatorSearchSourceProperties]
  }
}

