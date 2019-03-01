package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait widgetsSearchProperties
  extends WidgetProperties
     with GoToProperties {
  /**
    * The selected source's index. This value is `-1` when all sources are selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#activeSourceIndex)
    *
    * @default 0
    */
  var activeSourceIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * String value used as a hint for input text when searching on multiple sources. See the image below to view the location and style of this text in the context of the widget.  ![search-allPlaceholder](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-allplaceholder.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#allPlaceholder)
    *
    * @default "Find address or place"
    */
  var allPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether to automatically select and zoom to the first geocoded result. If `false`, the [findAddressCandidates](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-find-address-candidates.htm) operation will still geocode the input string, but the top result will not be selected. To work with the geocoded results, you can set up a [search-complete](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#event:search-complete) event handler and get the results through the event object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#autoSelect)
    *
    * @default true
    */
  var autoSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether or not to include [defaultSources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#defaultSources) in the Search UI. This can be a boolean value or a function that returns an array of Search [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#sources).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#includeDefaultSources)
    *
    * @default true
    */
  var includeDefaultSources: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  /**
    * Enables location services within the widget.  ![locationEnabled](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-locationEnabled.png)
    * > The use of this property is only supported on secure origins. To use it, switch your application to a secure origin, such as HTTPS. Note that localhost is considered "potentially secure" and can be used for easy testing in browsers that supports [Window.isSecureContext](https://developer.mozilla.org/en-US/docs/Web/API/Window/isSecureContext#Browser_compatibility) (currently Chrome and Firefox).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#locationEnabled)
    *
    * @default true
    */
  var locationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum number of results returned by the widget if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#maxResults)
    *
    * @default 6
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of suggestions returned by the widget if not specified by the source.  If working with the default [ArcGIS Online Geocoding service](https://developers.arcgis.com/rest/geocode/api-reference/overview-world-geocoding-service.htm), the default remains at `5`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#maxSuggestions)
    *
    * @default 6
    */
  var maxSuggestions: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum number of characters needed for the search if not specified by the source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#minSuggestCharacters)
    *
    * @default 1
    */
  var minSuggestCharacters: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) on feature click. The graphic can be clicked to display a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A customized PopupTemplate for the selected feature. Note that specifying a wildcard {*} for the popupTemplate will return all fields in addition to search-specific fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#popupTemplate)
    *
    * @default null
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  /**
    * It is possible to search a specified portal instance's [locator services](http://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-portal-to-geocode-addresses.htm) Use this property to set this [ArcGIS Portal](https://enterprise.arcgis.com/en/portal/) instance to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  /**
    * Indicates if the [resultGraphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#resultGraphic) will display at the location of the selected feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#resultGraphicEnabled)
    *
    * @default true
    */
  var resultGraphicEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to display the option to search all sources. When `true`, the "All" option is displayed by default:  ![search-searchAllEnabled-true](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-enablesearchingall-true.png)  When `false`, no option to search all sources at once is available:  ![search-searchAllEnabled-false](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/search-enablesearchingall-false.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#searchAllEnabled)
    *
    * @default true
    */
  var searchAllEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The value of the search box input text string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#searchTerm)
    */
  var searchTerm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Search widget may be used to search features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or geocode locations with a [Locator](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html). The `sources` property defines the sources from which to search for the [view](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#view) specified by the Search widget instance. There are two types of sources:
    *   * [FeatureLayerSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-FeatureLayerSearchSource.html)
    *   * [LocatorSearchSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html)
    *
    *
    * Any combination of these sources may be used together in the same instance of the Search widget.
    * > Feature layers created from client-side graphics are not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources)
    */
  var sources: js.UndefOr[
    CollectionProperties[FeatureLayerSearchSourceProperties | LocatorSearchSourceProperties]
  ] = js.undefined
  /**
    * Enable suggestions for the widget.  This is only available if working with a 10.3 or greater geocoding service that has [suggest capability loaded](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-suggest.htm) or a 10.3 or greater feature layer that supports pagination, i.e. `supportsPagination = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#suggestionsEnabled)
    *
    * @default true
    */
  var suggestionsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [SearchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#viewModel)
    */
  var viewModel: js.UndefOr[SearchViewModelProperties] = js.undefined
}

object widgetsSearchProperties {
  @scala.inline
  def apply(
    activeSourceIndex: scala.Int | scala.Double = null,
    allPlaceholder: java.lang.String = null,
    autoSelect: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String | stdLib.HTMLElement = null,
    destroyed: js.UndefOr[scala.Boolean] = js.undefined,
    goToOverride: GoToOverride = null,
    id: java.lang.String = null,
    includeDefaultSources: scala.Boolean | js.Function = null,
    locationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    maxResults: scala.Int | scala.Double = null,
    maxSuggestions: scala.Int | scala.Double = null,
    minSuggestCharacters: scala.Int | scala.Double = null,
    popupEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    portal: PortalProperties = null,
    resultGraphicEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    searchAllEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    searchTerm: java.lang.String = null,
    sources: CollectionProperties[FeatureLayerSearchSourceProperties | LocatorSearchSourceProperties] = null,
    suggestionsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: SearchViewModelProperties = null
  ): widgetsSearchProperties = {
    val __obj = js.Dynamic.literal()
    if (activeSourceIndex != null) __obj.updateDynamic("activeSourceIndex")(activeSourceIndex.asInstanceOf[js.Any])
    if (allPlaceholder != null) __obj.updateDynamic("allPlaceholder")(allPlaceholder)
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(goToOverride)
    if (id != null) __obj.updateDynamic("id")(id)
    if (includeDefaultSources != null) __obj.updateDynamic("includeDefaultSources")(includeDefaultSources.asInstanceOf[js.Any])
    if (!js.isUndefined(locationEnabled)) __obj.updateDynamic("locationEnabled")(locationEnabled)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (maxSuggestions != null) __obj.updateDynamic("maxSuggestions")(maxSuggestions.asInstanceOf[js.Any])
    if (minSuggestCharacters != null) __obj.updateDynamic("minSuggestCharacters")(minSuggestCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled)
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate)
    if (portal != null) __obj.updateDynamic("portal")(portal)
    if (!js.isUndefined(resultGraphicEnabled)) __obj.updateDynamic("resultGraphicEnabled")(resultGraphicEnabled)
    if (!js.isUndefined(searchAllEnabled)) __obj.updateDynamic("searchAllEnabled")(searchAllEnabled)
    if (searchTerm != null) __obj.updateDynamic("searchTerm")(searchTerm)
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestionsEnabled)) __obj.updateDynamic("suggestionsEnabled")(suggestionsEnabled)
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[widgetsSearchProperties]
  }
}

