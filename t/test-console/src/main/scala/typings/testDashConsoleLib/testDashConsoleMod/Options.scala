package typings
package testDashConsoleLib.testDashConsoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var isTTY: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(isTTY: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isTTY)) __obj.updateDynamic("isTTY")(isTTY)
    __obj.asInstanceOf[Options]
  }
}

