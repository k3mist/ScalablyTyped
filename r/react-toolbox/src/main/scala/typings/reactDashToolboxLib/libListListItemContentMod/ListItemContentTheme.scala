package typings
package reactDashToolboxLib.libListListItemContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemContentTheme extends js.Object {
  /**
    * Added to the content wrapper element if type is "auto".
    */
  var auto: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the content wrapper element in list item.
    */
  var itemContentRoot: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the content wrapper element if type is "large".
    */
  var large: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the content wrapper element if type is "normal".
    */
  var normal: js.UndefOr[java.lang.String] = js.undefined
}

object ListItemContentTheme {
  @scala.inline
  def apply(
    auto: java.lang.String = null,
    itemContentRoot: java.lang.String = null,
    large: java.lang.String = null,
    normal: java.lang.String = null
  ): ListItemContentTheme = {
    val __obj = js.Dynamic.literal()
    if (auto != null) __obj.updateDynamic("auto")(auto)
    if (itemContentRoot != null) __obj.updateDynamic("itemContentRoot")(itemContentRoot)
    if (large != null) __obj.updateDynamic("large")(large)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    __obj.asInstanceOf[ListItemContentTheme]
  }
}

