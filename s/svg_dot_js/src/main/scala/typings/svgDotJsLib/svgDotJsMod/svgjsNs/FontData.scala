package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontData extends js.Object {
  var anchor: js.UndefOr[java.lang.String] = js.undefined
  var family: js.UndefOr[java.lang.String] = js.undefined
  var leading: js.UndefOr[NumberAlias] = js.undefined
  var size: js.UndefOr[NumberAlias] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var weight: js.UndefOr[java.lang.String] = js.undefined
}

object FontData {
  @scala.inline
  def apply(
    anchor: java.lang.String = null,
    family: java.lang.String = null,
    leading: NumberAlias = null,
    size: NumberAlias = null,
    style: java.lang.String = null,
    weight: java.lang.String = null
  ): FontData = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (family != null) __obj.updateDynamic("family")(family)
    if (leading != null) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[FontData]
  }
}

