package typings
package reactDashBootstrapLib.libPaginationFirstMod.PaginationFirstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationFirstProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPaginationFirstMod.PaginationFirst]

object PaginationFirstProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPaginationFirstMod.PaginationFirst] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): PaginationFirstProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[PaginationFirstProps]
  }
}

