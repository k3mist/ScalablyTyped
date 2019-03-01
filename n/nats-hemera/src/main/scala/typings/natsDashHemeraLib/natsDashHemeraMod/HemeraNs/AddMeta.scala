package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddMeta extends js.Object {
  var action: js.Any
  var pattern: Pattern
  var plugin: PluginDefinition
  var schema: js.Any
  def end(cb: js.Function0[scala.Unit]): js.UndefOr[scala.Nothing]
  def use(handler: AddMetaMiddleware): AddMeta
}

object AddMeta {
  @scala.inline
  def apply(
    action: js.Any,
    end: js.Function1[js.Function0[scala.Unit], js.UndefOr[scala.Nothing]],
    pattern: Pattern,
    plugin: PluginDefinition,
    schema: js.Any,
    use: js.Function1[AddMetaMiddleware, AddMeta]
  ): AddMeta = {
    val __obj = js.Dynamic.literal(action = action, end = end, pattern = pattern, plugin = plugin, schema = schema, use = use)
  
    __obj.asInstanceOf[AddMeta]
  }
}

