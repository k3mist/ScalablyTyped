package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait FunctionDeclaration
  extends BlockParent
     with BaseNode
     with Declaration
     with Function
     with FunctionParent
     with Pureish
     with Scopable
     with Statement {
  var async: scala.Boolean
  var body: BlockStatement
  var declare: scala.Boolean | scala.Null
  var generator: scala.Boolean
  var id: Identifier | scala.Null
  var params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  var returnType: TypeAnnotation | TSTypeAnnotation | Noop | scala.Null
  var typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_FunctionDeclaration: atBabelTypesLib.atBabelTypesLibStrings.FunctionDeclaration
}

object FunctionDeclaration {
  @scala.inline
  def apply(
    async: scala.Boolean,
    body: BlockStatement,
    generator: scala.Boolean,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.FunctionDeclaration,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    id: Identifier = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop = null
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(async = async, body = body, generator = generator, params = params, `type` = `type`)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeclaration]
  }
}

