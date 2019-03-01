package typings
package ansiDashRegexLib.ansiDashRegexMod.ansiRegexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Match only the first ANSI escape. */
  var onlyFirst: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(onlyFirst: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onlyFirst)) __obj.updateDynamic("onlyFirst")(onlyFirst)
    __obj.asInstanceOf[Options]
  }
}

