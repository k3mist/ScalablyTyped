package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowLabel
  extends FlowNodeBase
     with FlowNode {
  var antecedents: js.UndefOr[js.Array[FlowNode]]
}

object FlowLabel {
  @scala.inline
  def apply(flags: FlowFlags, antecedents: js.Array[FlowNode] = null, id: scala.Int | scala.Double = null): FlowLabel = {
    val __obj = js.Dynamic.literal(flags = flags)
    if (antecedents != null) __obj.updateDynamic("antecedents")(antecedents)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLabel]
  }
}

