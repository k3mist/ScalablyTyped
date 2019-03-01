package typings
package reduxDashFirstDashRoutingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash[P /* <: historyLib.historyMod.Pathname */, S /* <: historyLib.historyMod.Search */, H /* <: historyLib.historyMod.Hash */] extends js.Object {
  var hash: H
  var pathname: P
  var queries: js.Any
  var search: S
}

object Anon_Hash {
  @scala.inline
  def apply[P /* <: historyLib.historyMod.Pathname */, S /* <: historyLib.historyMod.Search */, H /* <: historyLib.historyMod.Hash */](hash: H, pathname: P, queries: js.Any, search: S): Anon_Hash[P, S, H] = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], queries = queries, search = search.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Hash[P, S, H]]
  }
}

