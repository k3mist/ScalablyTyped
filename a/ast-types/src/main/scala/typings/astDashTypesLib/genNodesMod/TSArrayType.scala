package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSArrayType
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var elementType: astDashTypesLib.genKindsMod.TSTypeKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSArrayType
}

object TSArrayType {
  @scala.inline
  def apply(
    elementType: astDashTypesLib.genKindsMod.TSTypeKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSArrayType
  ): TSArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TSArrayType]
  }
}

