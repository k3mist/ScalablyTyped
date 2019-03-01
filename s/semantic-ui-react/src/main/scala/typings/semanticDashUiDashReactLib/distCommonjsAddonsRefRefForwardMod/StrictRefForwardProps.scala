package typings
package semanticDashUiDashReactLib.distCommonjsAddonsRefRefForwardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictRefForwardProps extends js.Object {
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * Called when a child component will be mounted or updated.
    *
    * @param {HTMLElement} node - Referred node.
    */
  var innerRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_]] = js.undefined
}

object StrictRefForwardProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] = null
  ): StrictRefForwardProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictRefForwardProps]
  }
}

