package typings
package osrmLib.osrmMod.OSRMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchResults extends js.Object {
  var matchings: js.Array[MatchRoute]
  var tracepoints: js.Array[MatchWaypoint]
}

object MatchResults {
  @scala.inline
  def apply(matchings: js.Array[MatchRoute], tracepoints: js.Array[MatchWaypoint]): MatchResults = {
    val __obj = js.Dynamic.literal(matchings = matchings, tracepoints = tracepoints)
  
    __obj.asInstanceOf[MatchResults]
  }
}

