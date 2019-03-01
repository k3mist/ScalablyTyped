package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlAccordionTextProps extends js.Object {
  var backgroundColor: js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty] = js.undefined
  var color: js.UndefOr[csstypeLib.csstypeMod.ColorProperty] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object MjmlAccordionTextProps {
  @scala.inline
  def apply(
    backgroundColor: csstypeLib.csstypeMod.BackgroundColorProperty = null,
    color: csstypeLib.csstypeMod.ColorProperty = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String | scala.Double = null
  ): MjmlAccordionTextProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlAccordionTextProps]
  }
}

