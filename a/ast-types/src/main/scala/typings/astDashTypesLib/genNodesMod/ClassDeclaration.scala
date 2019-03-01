package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ClassDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var body: astDashTypesLib.genKindsMod.ClassBodyKind
  var id: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null
  var implements: js.Array[astDashTypesLib.genKindsMod.ClassImplementsKind] | js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind]
  var superClass: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var superTypeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.ClassDeclaration
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null
}

object ClassDeclaration {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.ClassBodyKind,
    implements: js.Array[astDashTypesLib.genKindsMod.ClassImplementsKind] | js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind],
    `type`: astDashTypesLib.astDashTypesLibStrings.ClassDeclaration,
    id: astDashTypesLib.genKindsMod.IdentifierKind = null,
    superClass: astDashTypesLib.genKindsMod.ExpressionKind = null,
    superTypeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body, implements = implements.asInstanceOf[js.Any], `type` = `type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (superTypeParameters != null) __obj.updateDynamic("superTypeParameters")(superTypeParameters.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassDeclaration]
  }
}

