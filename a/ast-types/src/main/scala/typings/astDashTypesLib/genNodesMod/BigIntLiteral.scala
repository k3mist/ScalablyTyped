package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/nodes.Literal[P]} */ trait BigIntLiteral
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.LiteralKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var extra: astDashTypesLib.Anon_RawRawValue
  var `type`: astDashTypesLib.astDashTypesLibStrings.BigIntLiteral
  var value: java.lang.String | scala.Double
}

