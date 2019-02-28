package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSMethodSignature
  extends TSTypeElement
     with BaseNode {
  var computed: scala.Boolean | scala.Null
  var key: Expression
  var optional: scala.Boolean | scala.Null
  var parameters: (js.Array[Identifier | RestElement]) | scala.Null
  var typeAnnotation: TSTypeAnnotation | scala.Null
  var typeParameters: TSTypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_TSMethodSignature: atBabelTypesLib.atBabelTypesLibStrings.TSMethodSignature
}

