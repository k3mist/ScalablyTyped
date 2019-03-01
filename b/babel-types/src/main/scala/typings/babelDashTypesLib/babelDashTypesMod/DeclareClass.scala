package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclareClass
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var body: ObjectTypeAnnotation
  var `extends`: js.Array[InterfaceExtends]
  var id: Identifier
  var typeParameters: TypeParameterDeclaration
  @JSName("type")
  var type_DeclareClass: babelDashTypesLib.babelDashTypesLibStrings.DeclareClass
}

object DeclareClass {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation,
    end: scala.Double,
    `extends`: js.Array[InterfaceExtends],
    id: Identifier,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.DeclareClass,
    typeParameters: TypeParameterDeclaration,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareClass = {
    val __obj = js.Dynamic.literal(body = body, end = end, `extends` = `extends`, id = id, loc = loc, start = start, `type` = `type`, typeParameters = typeParameters)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[DeclareClass]
  }
}

