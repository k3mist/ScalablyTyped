package typings
package francLib.francMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var blacklist: js.UndefOr[js.Array[francLib.ISO6393]] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var whitelist: js.UndefOr[js.Array[francLib.ISO6393]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    blacklist: js.Array[francLib.ISO6393] = null,
    minLength: scala.Int | scala.Double = null,
    whitelist: js.Array[francLib.ISO6393] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[Options]
  }
}

