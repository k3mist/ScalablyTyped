package typings
package adoneLib.adoneNs.fastNs.INs.pluginNs.chmodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Access extends js.Object {
  /**
    * Whether to ahve execute access
    */
  var execute: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to have read access
    */
  var read: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to have write access
    */
  var write: js.UndefOr[scala.Boolean] = js.undefined
}

object Access {
  @scala.inline
  def apply(
    execute: js.UndefOr[scala.Boolean] = js.undefined,
    read: js.UndefOr[scala.Boolean] = js.undefined,
    write: js.UndefOr[scala.Boolean] = js.undefined
  ): Access = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(execute)) __obj.updateDynamic("execute")(execute)
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read)
    if (!js.isUndefined(write)) __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[Access]
  }
}

