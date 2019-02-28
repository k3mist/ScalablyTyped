package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowArrayMutation
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode
  var node: CallExpression | BinaryExpression
}

