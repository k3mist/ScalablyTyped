package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait TextProps extends _HeaderSubComponent {
  /**
    * font size 40
    */
  var h1: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * font size 34
    */
  var h2: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * font size 28
    */
  var h3: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * font size 22
    */
  var h4: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Additional styling for Text
    */
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    h1: js.UndefOr[scala.Boolean] = js.undefined,
    h2: js.UndefOr[scala.Boolean] = js.undefined,
    h3: js.UndefOr[scala.Boolean] = js.undefined,
    h4: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(h1)) __obj.updateDynamic("h1")(h1)
    if (!js.isUndefined(h2)) __obj.updateDynamic("h2")(h2)
    if (!js.isUndefined(h3)) __obj.updateDynamic("h3")(h3)
    if (!js.isUndefined(h4)) __obj.updateDynamic("h4")(h4)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProps]
  }
}

