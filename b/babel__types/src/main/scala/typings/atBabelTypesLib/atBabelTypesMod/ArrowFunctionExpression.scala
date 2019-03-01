package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ArrowFunctionExpression
  extends BlockParent
     with BaseNode
     with Expression
     with Function
     with FunctionParent
     with Pureish
     with Scopable {
  var async: scala.Boolean
  var body: BlockStatement | Expression
  var expression: scala.Boolean | scala.Null
  var generator: scala.Boolean
  var params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_ArrowFunctionExpression: atBabelTypesLib.atBabelTypesLibStrings.ArrowFunctionExpression
}

object ArrowFunctionExpression {
  @scala.inline
  def apply(
    async: scala.Boolean,
    body: BlockStatement | Expression,
    generator: scala.Boolean,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ArrowFunctionExpression,
    end: scala.Int | scala.Double = null,
    expression: js.UndefOr[scala.Boolean] = js.undefined,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop = null
  ): ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(async = async, body = body.asInstanceOf[js.Any], generator = generator, params = params, `type` = `type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(expression)) __obj.updateDynamic("expression")(expression)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowFunctionExpression]
  }
}

