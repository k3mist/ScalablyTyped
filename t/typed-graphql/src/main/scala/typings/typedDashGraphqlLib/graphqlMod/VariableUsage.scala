package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableUsage extends js.Object {
  var node: Variable
  var `type`: GraphQLInputType
}

object VariableUsage {
  @scala.inline
  def apply(node: Variable, `type`: GraphQLInputType): VariableUsage = {
    val __obj = js.Dynamic.literal(node = node, `type` = `type`)
  
    __obj.asInstanceOf[VariableUsage]
  }
}

