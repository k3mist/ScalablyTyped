package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/nodes.ModuleSpecifier[P]} */ trait ImportSpecifier
  extends ASTNode
     with astDashTypesLib.genKindsMod.ModuleSpecifierKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.SpecifierKind {
  var imported: astDashTypesLib.genKindsMod.IdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ImportSpecifier
}

