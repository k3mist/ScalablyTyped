package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorString extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ColorString {
  @scala.inline
  def apply(color: java.lang.String = null): Anon_ColorString = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Anon_ColorString]
  }
}

