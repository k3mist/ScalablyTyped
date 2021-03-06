package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait DirectiveLiteral
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.DirectiveLiteral
  var value: java.lang.String
}

object DirectiveLiteral {
  @scala.inline
  def apply(`type`: astDashTypesLib.astDashTypesLibStrings.DirectiveLiteral, value: java.lang.String): DirectiveLiteral = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DirectiveLiteral]
  }
}

