package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectMethod
  extends Node
     with BlockParent
     with Function
     with FunctionParent
     with Method
     with ObjectMember
     with Scopable
     with UserWhitespacable {
  var async: scala.Boolean
  var body: BlockStatement
  var computed: scala.Boolean
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var generator: scala.Boolean
  var id: Identifier
  var key: Expression
  var kind: babelDashTypesLib.babelDashTypesLibStrings.get | babelDashTypesLib.babelDashTypesLibStrings.set | babelDashTypesLib.babelDashTypesLibStrings.method
  var params: js.Array[LVal]
  var returnType: js.UndefOr[TypeAnnotation] = js.undefined
  var shorthand: scala.Boolean
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_ObjectMethod: babelDashTypesLib.babelDashTypesLibStrings.ObjectMethod
  var value: Expression
}

object ObjectMethod {
  @scala.inline
  def apply(
    async: scala.Boolean,
    body: BlockStatement,
    computed: scala.Boolean,
    end: scala.Double,
    generator: scala.Boolean,
    id: Identifier,
    key: Expression,
    kind: babelDashTypesLib.babelDashTypesLibStrings.get | babelDashTypesLib.babelDashTypesLibStrings.set | babelDashTypesLib.babelDashTypesLibStrings.method,
    loc: SourceLocation,
    params: js.Array[LVal],
    shorthand: scala.Boolean,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ObjectMethod,
    value: Expression,
    decorators: js.Array[Decorator] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    returnType: TypeAnnotation = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration = null
  ): ObjectMethod = {
    val __obj = js.Dynamic.literal(async = async, body = body, computed = computed, end = end, generator = generator, id = id, key = key, kind = kind.asInstanceOf[js.Any], loc = loc, params = params, shorthand = shorthand, start = start, `type` = `type`, value = value)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (returnType != null) __obj.updateDynamic("returnType")(returnType)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[ObjectMethod]
  }
}

