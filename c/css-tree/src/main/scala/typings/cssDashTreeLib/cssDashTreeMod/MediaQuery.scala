package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQuery
  extends CssNodeCommon
     with CssNode {
  var children: List[CssNode]
  @JSName("type")
  var type_MediaQuery: cssDashTreeLib.cssDashTreeLibStrings.MediaQuery
}

object MediaQuery {
  @scala.inline
  def apply(
    children: List[CssNode],
    `type`: cssDashTreeLib.cssDashTreeLibStrings.MediaQuery,
    loc: CssLocation = null
  ): MediaQuery = {
    val __obj = js.Dynamic.literal(children = children, `type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[MediaQuery]
  }
}

