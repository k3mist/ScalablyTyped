package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSDeclareFunction
  extends Declaration
     with BaseNode
     with Statement {
  var async: scala.Boolean
  var declare: scala.Boolean | scala.Null
  var generator: scala.Boolean
  var id: Identifier | scala.Null
  var params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  var returnType: TSTypeAnnotation | Noop | scala.Null
  var typeParameters: TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_TSDeclareFunction: atBabelTypesLib.atBabelTypesLibStrings.TSDeclareFunction
}

