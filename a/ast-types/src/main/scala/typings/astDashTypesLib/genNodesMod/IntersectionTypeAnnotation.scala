package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait IntersectionTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.IntersectionTypeAnnotation
  var types: js.Array[astDashTypesLib.genKindsMod.FlowTypeKind]
}

object IntersectionTypeAnnotation {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.IntersectionTypeAnnotation,
    types: js.Array[astDashTypesLib.genKindsMod.FlowTypeKind]
  ): IntersectionTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`, types = types)
  
    __obj.asInstanceOf[IntersectionTypeAnnotation]
  }
}

