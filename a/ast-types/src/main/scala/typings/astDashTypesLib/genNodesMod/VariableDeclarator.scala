package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait VariableDeclarator
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var id: astDashTypesLib.genKindsMod.PatternKind
  var init: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.VariableDeclarator
}

object VariableDeclarator {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.PatternKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.VariableDeclarator,
    init: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id, `type` = `type`)
    if (init != null) __obj.updateDynamic("init")(init)
    __obj.asInstanceOf[VariableDeclarator]
  }
}

