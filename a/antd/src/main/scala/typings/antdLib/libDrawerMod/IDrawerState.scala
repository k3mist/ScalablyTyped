package typings
package antdLib.libDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrawerState extends js.Object {
  var push: js.UndefOr[scala.Boolean] = js.undefined
}

object IDrawerState {
  @scala.inline
  def apply(push: js.UndefOr[scala.Boolean] = js.undefined): IDrawerState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    __obj.asInstanceOf[IDrawerState]
  }
}

