package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyBlock
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyBlock: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyBlock
}

object AssemblyBlock {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyBlock,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): AssemblyBlock = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyBlock]
  }
}

