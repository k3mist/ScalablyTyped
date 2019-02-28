package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryOperation
  extends BaseASTNode
     with ASTNode {
  var left: ASTNode
  var operator: BinOp
  var right: ASTNode
  @JSName("type")
  var type_BinaryOperation: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.BinaryOperation
}

