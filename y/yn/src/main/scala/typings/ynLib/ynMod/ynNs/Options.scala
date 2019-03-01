package typings
package ynLib.ynMod.ynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Default value if no match was found.
    * @default null
    */
  var default: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * Use a key distance-based score to leniently accept typos of `yes` and `no`.
    * @default false
    */
  var lenient: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    default: js.UndefOr[scala.Boolean] = js.undefined,
    lenient: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient)
    __obj.asInstanceOf[Options]
  }
}

