package typings
package nodeDashSassLib.nodeDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncContext extends Context {
  @JSName("callback")
  var callback_SyncContext: js.UndefOr[scala.Nothing]
}

object SyncContext {
  @scala.inline
  def apply(options: Options, callback: js.UndefOr[scala.Nothing] = js.undefined): SyncContext = {
    val __obj = js.Dynamic.literal(options = options)
    if (!js.isUndefined(callback)) __obj.updateDynamic("callback")(callback)
    __obj.asInstanceOf[SyncContext]
  }
}

