package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDeclaration
  extends Node
     with BlockParent
     with Declaration
     with Function
     with FunctionParent
     with Pureish
     with Scopable
     with Statement {
  var async: scala.Boolean
  var body: BlockStatement
  var generator: scala.Boolean
  var id: Identifier
  var params: js.Array[LVal]
  var returnType: js.UndefOr[TypeAnnotation] = js.undefined
  var typeParameters: js.UndefOr[TypeParameterDeclaration] = js.undefined
  @JSName("type")
  var type_FunctionDeclaration: babelDashTypesLib.babelDashTypesLibStrings.FunctionDeclaration
}

