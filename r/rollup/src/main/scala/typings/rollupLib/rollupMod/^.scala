package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val VERSION: java.lang.String = js.native
  def rollup(options: RollupOptions): js.Promise[RollupBuild] = js.native
  def watch(configs: js.Array[RollupWatchOptions]): RollupWatcher = js.native
}

