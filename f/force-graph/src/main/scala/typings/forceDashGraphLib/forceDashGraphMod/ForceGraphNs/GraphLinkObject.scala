package typings
package forceDashGraphLib.forceDashGraphMod.ForceGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphLinkObject extends GraphLink {
  @JSName("source")
  var source_GraphLinkObject: GraphNode
  @JSName("target")
  var target_GraphLinkObject: GraphNode
}

object GraphLinkObject {
  @scala.inline
  def apply(id: java.lang.String, source: GraphNode, target: GraphNode, `type`: java.lang.String): GraphLinkObject = {
    val __obj = js.Dynamic.literal(id = id, source = source, target = target, `type` = `type`)
  
    __obj.asInstanceOf[GraphLinkObject]
  }
}

