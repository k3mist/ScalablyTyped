package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary of options for the <Titanium.UI.Window.titleAttributes> property.
  */
trait titleAttributesParams extends js.Object {
  /**
  	 * Color of the window title, as a color name or hex triplet.
  	 */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Font to use for the window title.
  	 */
  var font: js.UndefOr[Font] = js.undefined
  /**
  	 * Shadow color and offset for the window title.
  	 */
  var shadow: js.UndefOr[shadowDict] = js.undefined
}

object titleAttributesParams {
  @scala.inline
  def apply(color: java.lang.String = null, font: Font = null, shadow: shadowDict = null): titleAttributesParams = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    __obj.asInstanceOf[titleAttributesParams]
  }
}

