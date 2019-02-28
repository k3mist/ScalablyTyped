package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait Property
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var computed: scala.Boolean
  var decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null
  var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
  var kind: astDashTypesLib.astDashTypesLibStrings.init | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set
  var method: scala.Boolean
  var shorthand: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.Property
  var value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
}

