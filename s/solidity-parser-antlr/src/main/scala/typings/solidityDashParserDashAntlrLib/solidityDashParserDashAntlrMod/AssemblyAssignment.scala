package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyAssignment
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyAssignment: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyAssignment
}

object AssemblyAssignment {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyAssignment,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): AssemblyAssignment = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyAssignment]
  }
}

