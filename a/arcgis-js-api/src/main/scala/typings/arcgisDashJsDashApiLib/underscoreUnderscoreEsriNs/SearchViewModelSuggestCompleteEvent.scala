package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchViewModelSuggestCompleteEvent extends js.Object {
  var activeSourceIndex: scala.Double
  var errors: js.Array[Error]
  var numResults: scala.Double
  var results: js.Array[SearchViewModelSuggestCompleteEventResults]
  var searchTerm: java.lang.String
}

object SearchViewModelSuggestCompleteEvent {
  @scala.inline
  def apply(
    activeSourceIndex: scala.Double,
    errors: js.Array[Error],
    numResults: scala.Double,
    results: js.Array[SearchViewModelSuggestCompleteEventResults],
    searchTerm: java.lang.String
  ): SearchViewModelSuggestCompleteEvent = {
    val __obj = js.Dynamic.literal(activeSourceIndex = activeSourceIndex, errors = errors, numResults = numResults, results = results, searchTerm = searchTerm)
  
    __obj.asInstanceOf[SearchViewModelSuggestCompleteEvent]
  }
}

