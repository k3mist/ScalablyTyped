package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoWhileStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_DoWhileStatement: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.DoWhileStatement
}

object DoWhileStatement {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.DoWhileStatement,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): DoWhileStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[DoWhileStatement]
  }
}

