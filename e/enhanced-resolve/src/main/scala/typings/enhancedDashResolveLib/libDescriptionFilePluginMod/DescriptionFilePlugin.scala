package typings
package enhancedDashResolveLib.libDescriptionFilePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionFilePlugin extends js.Object {
  var filenames: js.Array[java.lang.String]
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object DescriptionFilePlugin {
  @scala.inline
  def apply(
    apply: js.Function1[enhancedDashResolveLib.libResolverMod.namespaced, scala.Unit],
    filenames: js.Array[java.lang.String],
    source: java.lang.String,
    target: java.lang.String
  ): DescriptionFilePlugin = {
    val __obj = js.Dynamic.literal(apply = apply, filenames = filenames, source = source, target = target)
  
    __obj.asInstanceOf[DescriptionFilePlugin]
  }
}

