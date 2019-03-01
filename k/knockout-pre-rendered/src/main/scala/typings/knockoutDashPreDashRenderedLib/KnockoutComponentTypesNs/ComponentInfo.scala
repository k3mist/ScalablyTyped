package typings
package knockoutDashPreDashRenderedLib.KnockoutComponentTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentInfo extends js.Object {
  var element: stdLib.Node
  var templateNodes: js.Array[stdLib.Node]
}

object ComponentInfo {
  @scala.inline
  def apply(element: stdLib.Node, templateNodes: js.Array[stdLib.Node]): ComponentInfo = {
    val __obj = js.Dynamic.literal(element = element, templateNodes = templateNodes)
  
    __obj.asInstanceOf[ComponentInfo]
  }
}

