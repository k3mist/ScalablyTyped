package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ExportNamedDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var declaration: astDashTypesLib.genKindsMod.DeclarationKind | scala.Null
  var source: astDashTypesLib.genKindsMod.LiteralKind | scala.Null
  var specifiers: js.Array[astDashTypesLib.genKindsMod.ExportSpecifierKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.ExportNamedDeclaration
}

