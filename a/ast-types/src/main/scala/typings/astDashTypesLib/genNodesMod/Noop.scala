package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait Noop
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.Noop
}

object Noop {
  @scala.inline
  def apply(`type`: astDashTypesLib.astDashTypesLibStrings.Noop): Noop = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[Noop]
  }
}

