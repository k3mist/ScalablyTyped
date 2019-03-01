package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOperation extends ManagementOperation {
  var graph: java.lang.String
  var silent: scala.Boolean
  var `type`: sparqljsLib.sparqljsLibStrings.create
}

object CreateOperation {
  @scala.inline
  def apply(graph: java.lang.String, silent: scala.Boolean, `type`: sparqljsLib.sparqljsLibStrings.create): CreateOperation = {
    val __obj = js.Dynamic.literal(graph = graph, silent = silent, `type` = `type`)
  
    __obj.asInstanceOf[CreateOperation]
  }
}

