package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQuads extends Quads {
  var name: Term
  var triples: js.Array[Triple]
  var `type`: sparqljsLib.sparqljsLibStrings.graph
}

object GraphQuads {
  @scala.inline
  def apply(name: Term, triples: js.Array[Triple], `type`: sparqljsLib.sparqljsLibStrings.graph): GraphQuads = {
    val __obj = js.Dynamic.literal(name = name, triples = triples, `type` = `type`)
  
    __obj.asInstanceOf[GraphQuads]
  }
}

