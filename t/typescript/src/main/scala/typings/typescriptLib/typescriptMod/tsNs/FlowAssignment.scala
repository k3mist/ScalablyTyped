package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowAssignment
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode
  var node: Expression | VariableDeclaration | BindingElement
}

