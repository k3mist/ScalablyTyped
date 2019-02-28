package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeCastExpression
  extends Node
     with Expression
     with ExpressionWrapper
     with Flow {
  var expression: Expression
  var typeAnnotation: FlowTypeAnnotation
  @JSName("type")
  var type_TypeCastExpression: babelDashTypesLib.babelDashTypesLibStrings.TypeCastExpression
}

