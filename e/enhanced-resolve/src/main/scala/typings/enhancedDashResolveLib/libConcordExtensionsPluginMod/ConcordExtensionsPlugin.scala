package typings
package enhancedDashResolveLib.libConcordExtensionsPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcordExtensionsPlugin extends js.Object {
  var options: enhancedDashResolveLib.libConcordMod.Dictionary[_]
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object ConcordExtensionsPlugin {
  @scala.inline
  def apply(
    apply: js.Function1[enhancedDashResolveLib.libResolverMod.namespaced, scala.Unit],
    options: enhancedDashResolveLib.libConcordMod.Dictionary[_],
    source: java.lang.String,
    target: java.lang.String
  ): ConcordExtensionsPlugin = {
    val __obj = js.Dynamic.literal(apply = apply, options = options, source = source, target = target)
  
    __obj.asInstanceOf[ConcordExtensionsPlugin]
  }
}

