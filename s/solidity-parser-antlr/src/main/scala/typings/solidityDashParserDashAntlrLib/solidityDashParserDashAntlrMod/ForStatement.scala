package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ForStatement: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ForStatement
}

object ForStatement {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ForStatement,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ForStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ForStatement]
  }
}

