package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends Node
     with Conditional
     with Statement {
  var alternate: Statement
  var consequent: Statement
  var test: Expression
  @JSName("type")
  var type_IfStatement: babelDashTypesLib.babelDashTypesLibStrings.IfStatement
}

