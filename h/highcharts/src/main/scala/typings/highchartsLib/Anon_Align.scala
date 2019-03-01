package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var verticalAlign: js.UndefOr[java.lang.String] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Align {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    verticalAlign: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Anon_Align = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Align]
  }
}

