package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnParameters
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ReturnParameters: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ReturnParameters
}

object ReturnParameters {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ReturnParameters,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ReturnParameters = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ReturnParameters]
  }
}

