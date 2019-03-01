package typings
package selectizeLib.SelectizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearch extends js.Object {
  /**
    * A list of matched results. Each result is an object containing two properties: "score" and "id".
    */
  var items: js.Array[ISearchResult]
  /**
    * Original search options.
    */
  var options: js.Any
  /**
    * The raw user input
    */
  var query: java.lang.String
  /**
    * An array containing parsed search tokens. A token is an object containing two properties: "string" and "regex".
    */
  var tokens: js.Array[ISearchToken]
  /**
    * The total number of results.
    */
  var total: scala.Double
}

object ISearch {
  @scala.inline
  def apply(
    items: js.Array[ISearchResult],
    options: js.Any,
    query: java.lang.String,
    tokens: js.Array[ISearchToken],
    total: scala.Double
  ): ISearch = {
    val __obj = js.Dynamic.literal(items = items, options = options, query = query, tokens = tokens, total = total)
  
    __obj.asInstanceOf[ISearch]
  }
}

