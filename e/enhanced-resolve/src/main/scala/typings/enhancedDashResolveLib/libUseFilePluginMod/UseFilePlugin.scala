package typings
package enhancedDashResolveLib.libUseFilePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseFilePlugin extends js.Object {
  var filename: java.lang.String
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object UseFilePlugin {
  @scala.inline
  def apply(
    apply: js.Function1[enhancedDashResolveLib.libResolverMod.namespaced, scala.Unit],
    filename: java.lang.String,
    source: java.lang.String,
    target: java.lang.String
  ): UseFilePlugin = {
    val __obj = js.Dynamic.literal(apply = apply, filename = filename, source = source, target = target)
  
    __obj.asInstanceOf[UseFilePlugin]
  }
}

