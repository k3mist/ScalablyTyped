package typings
package fastifyDashPluginLib.fastifyDashPluginMod.fastifyPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  /** Decorator dependencies for this plugin */
  var decorators: js.UndefOr[fastifyDashPluginLib.Anon_Fastify] = js.undefined
  /** The plugin dependencies */
  var dependencies: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Bare-minimum version of Fastify for your plugin, just add the semver range that you need. */
  var fastify: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

