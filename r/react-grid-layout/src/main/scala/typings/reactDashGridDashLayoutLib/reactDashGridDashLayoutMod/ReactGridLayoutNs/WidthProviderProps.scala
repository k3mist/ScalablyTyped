package typings
package reactDashGridDashLayoutLib.reactDashGridDashLayoutMod.ReactGridLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidthProviderProps extends js.Object {
  /**
    * If true, WidthProvider will measure the container's width before mounting children.
    * Use this if you'd like to completely eliminate any resizing animation on
    * application/component mount.
    */
  var measureBeforeMount: js.UndefOr[scala.Boolean] = js.undefined
}

object WidthProviderProps {
  @scala.inline
  def apply(measureBeforeMount: js.UndefOr[scala.Boolean] = js.undefined): WidthProviderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(measureBeforeMount)) __obj.updateDynamic("measureBeforeMount")(measureBeforeMount)
    __obj.asInstanceOf[WidthProviderProps]
  }
}

