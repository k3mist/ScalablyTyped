package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Function, 'type' | 'id' | 'body' | 'generator'> ]: ast-types.ast-types/gen/nodes.Function[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait ArrowFunctionExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.FunctionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var body: astDashTypesLib.genKindsMod.BlockStatementKind | astDashTypesLib.genKindsMod.ExpressionKind
  var generator: astDashTypesLib.astDashTypesLibNumbers.`false`
  var id: scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.ArrowFunctionExpression
}

