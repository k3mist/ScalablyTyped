package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSCallSignatureDeclaration
  extends Node
     with TSTypeElement {
  var parameters: (js.Array[Identifier | RestElement]) | scala.Null
  var typeAnnotation: TSTypeAnnotation | scala.Null
  var typeParameters: TypeParameterDeclaration | scala.Null
  @JSName("type")
  var type_TSCallSignatureDeclaration: babelDashTypesLib.babelDashTypesLibStrings.TSCallSignatureDeclaration
}

