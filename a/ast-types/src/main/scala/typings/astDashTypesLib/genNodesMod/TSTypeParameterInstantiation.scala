package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait TSTypeParameterInstantiation
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var params: js.Array[astDashTypesLib.genKindsMod.TSTypeKind]
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeParameterInstantiation
}

