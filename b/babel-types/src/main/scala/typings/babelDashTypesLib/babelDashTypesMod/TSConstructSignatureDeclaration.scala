package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSConstructSignatureDeclaration
  extends Node
     with TSTypeElement {
  var parameters: (js.Array[Identifier | RestElement]) | scala.Null
  var typeAnnotation: TSTypeAnnotation | scala.Null
  var typeParameters: TypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_TSConstructSignatureDeclaration: babelDashTypesLib.babelDashTypesLibStrings.TSConstructSignatureDeclaration
}

object TSConstructSignatureDeclaration {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSConstructSignatureDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    parameters: js.Array[Identifier | RestElement] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null,
    typeParameters: TypeParameterDeclaration = null
  ): TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSConstructSignatureDeclaration]
  }
}

