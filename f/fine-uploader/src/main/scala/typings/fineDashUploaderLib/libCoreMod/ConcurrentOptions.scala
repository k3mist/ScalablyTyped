package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcurrentOptions extends js.Object {
  /**
    * Allow multiple chunks to be uploaded simultaneously per file
    *
    * @default `false`
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
}

object ConcurrentOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[scala.Boolean] = js.undefined): ConcurrentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[ConcurrentOptions]
  }
}

