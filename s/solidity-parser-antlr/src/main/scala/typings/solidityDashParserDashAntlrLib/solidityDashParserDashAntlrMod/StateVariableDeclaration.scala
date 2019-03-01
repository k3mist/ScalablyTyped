package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateVariableDeclaration
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_StateVariableDeclaration: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.StateVariableDeclaration
  var variables: js.Array[VariableDeclaration]
}

object StateVariableDeclaration {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.StateVariableDeclaration,
    variables: js.Array[VariableDeclaration],
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): StateVariableDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`, variables = variables)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[StateVariableDeclaration]
  }
}

