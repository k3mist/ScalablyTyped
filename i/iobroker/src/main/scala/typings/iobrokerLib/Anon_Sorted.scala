package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sorted extends js.Object {
  var sorted: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Sorted {
  @scala.inline
  def apply(sorted: js.UndefOr[scala.Boolean] = js.undefined): Anon_Sorted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted)
    __obj.asInstanceOf[Anon_Sorted]
  }
}

