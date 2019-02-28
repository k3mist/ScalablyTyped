package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait LogicalExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var left: astDashTypesLib.genKindsMod.ExpressionKind
  var operator: astDashTypesLib.astDashTypesLibStrings.`||` | astDashTypesLib.astDashTypesLibStrings.`&&` | astDashTypesLib.astDashTypesLibStrings.`??`
  var right: astDashTypesLib.genKindsMod.ExpressionKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.LogicalExpression
}

