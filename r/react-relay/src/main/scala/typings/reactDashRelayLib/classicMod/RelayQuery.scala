package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayQuery extends js.Object {
  var Fragment: js.Any
  var Node: js.Any
  var Root: js.Any
}

object RelayQuery {
  @scala.inline
  def apply(Fragment: js.Any, Node: js.Any, Root: js.Any): RelayQuery = {
    val __obj = js.Dynamic.literal(Fragment = Fragment, Node = Node, Root = Root)
  
    __obj.asInstanceOf[RelayQuery]
  }
}

