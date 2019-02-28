package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Identifier, 'type' | 'name'> ]: ast-types.ast-types/gen/nodes.Identifier[P]} */ trait TSTypeParameter
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.IdentifierKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var constraint: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeKind]
  var default: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeKind]
  var name: java.lang.String
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeParameter
}

