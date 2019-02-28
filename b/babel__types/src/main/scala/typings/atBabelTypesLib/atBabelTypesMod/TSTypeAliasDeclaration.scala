package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSTypeAliasDeclaration
  extends Declaration
     with BaseNode
     with Statement {
  var declare: scala.Boolean | scala.Null
  var id: Identifier
  var typeAnnotation: TSType
  var typeParameters: TSTypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_TSTypeAliasDeclaration: atBabelTypesLib.atBabelTypesLibStrings.TSTypeAliasDeclaration
}

