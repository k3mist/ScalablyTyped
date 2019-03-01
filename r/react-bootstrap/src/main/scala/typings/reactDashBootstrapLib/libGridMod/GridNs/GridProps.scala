package typings
package reactDashBootstrapLib.libGridMod.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libGridMod.Grid] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libGridMod.Grid] = null,
    bsClass: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    __obj.asInstanceOf[GridProps]
  }
}

