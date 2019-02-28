package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSCallSignatureDeclaration
  extends TSTypeElement
     with BaseNode {
  var parameters: (js.Array[Identifier | RestElement]) | scala.Null
  var typeAnnotation: TSTypeAnnotation | scala.Null
  var typeParameters: TSTypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_TSCallSignatureDeclaration: atBabelTypesLib.atBabelTypesLibStrings.TSCallSignatureDeclaration
}

