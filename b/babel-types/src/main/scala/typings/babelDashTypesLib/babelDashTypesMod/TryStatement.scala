package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryStatement
  extends Node
     with Statement {
  var block: BlockStatement
  var finalizer: BlockStatement
  var handler: CatchClause
  @JSName("type")
  var type_TryStatement: babelDashTypesLib.babelDashTypesLibStrings.TryStatement
}

