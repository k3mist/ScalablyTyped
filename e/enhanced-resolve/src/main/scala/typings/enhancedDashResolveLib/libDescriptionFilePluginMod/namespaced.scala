package typings
package enhancedDashResolveLib.libDescriptionFilePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve/lib/DescriptionFilePlugin", JSImport.Namespace)
@js.native
class namespaced protected () extends DescriptionFilePlugin {
  def this(source: java.lang.String, filenames: java.lang.String, target: java.lang.String) = this()
  def this(source: java.lang.String, filenames: js.Array[java.lang.String], target: java.lang.String) = this()
  /* CompleteClass */
  override var filenames: js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override var source: java.lang.String = js.native
  /* CompleteClass */
  override var target: java.lang.String = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit = js.native
}

