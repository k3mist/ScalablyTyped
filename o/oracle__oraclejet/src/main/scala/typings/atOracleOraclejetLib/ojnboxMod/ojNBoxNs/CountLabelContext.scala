package typings
package atOracleOraclejetLib.ojnboxMod.ojNBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CountLabelContext extends js.Object {
  var column: java.lang.String
  var highlightedNodeCount: scala.Double
  var nodeCount: scala.Double
  var row: java.lang.String
  var totalNodeCount: scala.Double
}

object CountLabelContext {
  @scala.inline
  def apply(
    column: java.lang.String,
    highlightedNodeCount: scala.Double,
    nodeCount: scala.Double,
    row: java.lang.String,
    totalNodeCount: scala.Double
  ): CountLabelContext = {
    val __obj = js.Dynamic.literal(column = column, highlightedNodeCount = highlightedNodeCount, nodeCount = nodeCount, row = row, totalNodeCount = totalNodeCount)
  
    __obj.asInstanceOf[CountLabelContext]
  }
}

