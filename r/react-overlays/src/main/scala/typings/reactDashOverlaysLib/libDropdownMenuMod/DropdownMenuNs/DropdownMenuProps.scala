package typings
package reactDashOverlaysLib.libDropdownMenuMod.DropdownMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenuProps extends js.Object {
  /**
    * Aligns the dropdown menu to the 'end' of it's placement position.
    * Generally this is provided by the parent `Dropdown` component,
    * but may also be specified as a prop directly.
    */
  var alignEnd: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables the Popper.js `flip` modifier, allowing the Dropdown to
    * automatically adjust it's placement in case of overlap with the viewport or toggle.
    */
  var flip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A set of popper options and props passed directly to react-popper's Popper component.
    */
  var popperConfig: js.UndefOr[js.Object] = js.undefined
  /**
    * Override the default event used by RootCloseWrapper.
    */
  var rootCloseEvent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Controls the visible state of the menu, generally this is
    * provided by the parent `Dropdown` component,
    * but may also be specified as a prop directly.
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var usePopper: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A render prop that returns a Menu element. The `props`
    * argument should spread through to **a component that can accept a ref**.
    */
  def children(renderProps: DropdownMenuRenderProps): reactLib.reactMod.ReactNs.ReactElement[_]
}

object DropdownMenuProps {
  @scala.inline
  def apply(
    children: js.Function1[DropdownMenuRenderProps, reactLib.reactMod.ReactNs.ReactElement[_]],
    alignEnd: js.UndefOr[scala.Boolean] = js.undefined,
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    popperConfig: js.Object = null,
    rootCloseEvent: java.lang.String = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    usePopper: js.UndefOr[scala.Boolean] = js.undefined
  ): DropdownMenuProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (!js.isUndefined(alignEnd)) __obj.updateDynamic("alignEnd")(alignEnd)
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (popperConfig != null) __obj.updateDynamic("popperConfig")(popperConfig)
    if (rootCloseEvent != null) __obj.updateDynamic("rootCloseEvent")(rootCloseEvent)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(usePopper)) __obj.updateDynamic("usePopper")(usePopper)
    __obj.asInstanceOf[DropdownMenuProps]
  }
}

