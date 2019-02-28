package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDefinition
  extends BaseASTNode
     with ASTNode {
  var body: Block | scala.Null
  var name: java.lang.String
  var parameters: ParameterList
  @JSName("type")
  var type_FunctionDefinition: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.FunctionDefinition
}

