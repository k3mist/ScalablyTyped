package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockStatement
  extends Node
     with Block
     with BlockParent
     with Scopable
     with Statement {
  var body: js.Array[Statement]
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  @JSName("type")
  var type_BlockStatement: babelDashTypesLib.babelDashTypesLibStrings.BlockStatement
}

