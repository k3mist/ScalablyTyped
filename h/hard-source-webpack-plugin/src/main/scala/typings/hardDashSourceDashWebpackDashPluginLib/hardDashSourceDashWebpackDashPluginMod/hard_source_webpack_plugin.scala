package typings
package hardDashSourceDashWebpackDashPluginLib.hardDashSourceDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hard_source_webpack_plugin extends js.Object {
  @JSName("apply")
  def apply(args: js.Any*): scala.Unit
}

object hard_source_webpack_plugin {
  @scala.inline
  def apply(apply: /* repeated */ js.Any => scala.Unit): hard_source_webpack_plugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
  
    __obj.asInstanceOf[hard_source_webpack_plugin]
  }
}

