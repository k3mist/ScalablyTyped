package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignedNodesOptions extends js.Object {
  var flatten: js.UndefOr[scala.Boolean] = js.undefined
}

object AssignedNodesOptions {
  @scala.inline
  def apply(flatten: js.UndefOr[scala.Boolean] = js.undefined): AssignedNodesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten)
    __obj.asInstanceOf[AssignedNodesOptions]
  }
}

