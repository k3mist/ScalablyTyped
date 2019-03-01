package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchViewModelSearchResponse
  extends stdLib.Object {
  /**
    * The index of the source from which the search result was obtained.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SearchResponse)
    */
  var activeSourceIndex: scala.Double
  /**
    * An array of error objects returned from the search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SearchResponse)
    */
  var errors: js.Array[Error]
  /**
    * The number of search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SearchResponse)
    */
  var numResults: scala.Double
  /**
    * An array of objects representing the results of search. See object specification table below for more information about the result object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SearchResponse)
    */
  var results: js.Array[SearchViewModelSearchResponseResults]
  /**
    * The searched expression
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html#SearchResponse)
    */
  var searchTerm: java.lang.String
}

object SearchViewModelSearchResponse {
  @scala.inline
  def apply(
    activeSourceIndex: scala.Double,
    constructor: js.Function,
    errors: js.Array[Error],
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    numResults: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    results: js.Array[SearchViewModelSearchResponseResults],
    searchTerm: java.lang.String
  ): SearchViewModelSearchResponse = {
    val __obj = js.Dynamic.literal(activeSourceIndex = activeSourceIndex, constructor = constructor, errors = errors, hasOwnProperty = hasOwnProperty, numResults = numResults, propertyIsEnumerable = propertyIsEnumerable, results = results, searchTerm = searchTerm)
  
    __obj.asInstanceOf[SearchViewModelSearchResponse]
  }
}

