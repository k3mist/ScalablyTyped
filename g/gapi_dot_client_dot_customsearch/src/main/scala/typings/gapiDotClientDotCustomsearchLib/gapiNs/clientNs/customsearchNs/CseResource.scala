package typings
package gapiDotClientDotCustomsearchLib.gapiNs.clientNs.customsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CseResource extends js.Object {
  /** Returns metadata about the search performed, metadata about the custom search engine used for the search, and the search results. */
  def list(request: gapiDotClientDotCustomsearchLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Search]
}

object CseResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotCustomsearchLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Search]
    ]
  ): CseResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[CseResource]
  }
}

