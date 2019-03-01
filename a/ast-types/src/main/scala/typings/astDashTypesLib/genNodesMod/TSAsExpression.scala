package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait TSAsExpression
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var expression: astDashTypesLib.genKindsMod.ExpressionKind
  var extra: astDashTypesLib.Anon_Parenthesized | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSAsExpression
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
}

object TSAsExpression {
  @scala.inline
  def apply(
    expression: astDashTypesLib.genKindsMod.ExpressionKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSAsExpression,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind,
    extra: astDashTypesLib.Anon_Parenthesized = null
  ): TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression, `type` = `type`, typeAnnotation = typeAnnotation)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    __obj.asInstanceOf[TSAsExpression]
  }
}

