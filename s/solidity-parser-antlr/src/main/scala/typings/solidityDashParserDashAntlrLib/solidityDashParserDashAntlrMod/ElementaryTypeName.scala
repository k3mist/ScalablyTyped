package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementaryTypeName
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ElementaryTypeName: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ElementaryTypeName
}

object ElementaryTypeName {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ElementaryTypeName = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ElementaryTypeName]
  }
}

