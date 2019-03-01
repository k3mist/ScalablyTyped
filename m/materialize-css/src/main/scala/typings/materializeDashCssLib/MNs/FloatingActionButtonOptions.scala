package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatingActionButtonOptions extends js.Object {
  /**
    * Direction FAB menu opens
    * @default "top"
    */
  var direction: materializeDashCssLib.materializeDashCssLibStrings.top | materializeDashCssLib.materializeDashCssLibStrings.right | materializeDashCssLib.materializeDashCssLibStrings.buttom | materializeDashCssLib.materializeDashCssLibStrings.left
  /**
    * true: FAB menu appears on hover, false: FAB menu appears on click
    * @default true
    */
  var hoverEnabled: scala.Boolean
  /**
    * Enable transit the FAB into a toolbar on click
    * @default false
    */
  var toolbarEnabled: scala.Boolean
}

object FloatingActionButtonOptions {
  @scala.inline
  def apply(
    direction: materializeDashCssLib.materializeDashCssLibStrings.top | materializeDashCssLib.materializeDashCssLibStrings.right | materializeDashCssLib.materializeDashCssLibStrings.buttom | materializeDashCssLib.materializeDashCssLibStrings.left,
    hoverEnabled: scala.Boolean,
    toolbarEnabled: scala.Boolean
  ): FloatingActionButtonOptions = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], hoverEnabled = hoverEnabled, toolbarEnabled = toolbarEnabled)
  
    __obj.asInstanceOf[FloatingActionButtonOptions]
  }
}

