package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TypeAlias, 'type'> ]: ast-types.ast-types/gen/nodes.TypeAlias[P]} */ trait DeclareTypeAlias
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind
     with astDashTypesLib.genKindsMod.TypeAliasKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareTypeAlias
}

