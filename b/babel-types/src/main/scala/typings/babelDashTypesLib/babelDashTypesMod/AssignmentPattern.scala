package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentPattern
  extends Node
     with LVal
     with Pattern {
  var left: Identifier
  var right: Expression
  @JSName("type")
  var type_AssignmentPattern: babelDashTypesLib.babelDashTypesLibStrings.AssignmentPattern
}

