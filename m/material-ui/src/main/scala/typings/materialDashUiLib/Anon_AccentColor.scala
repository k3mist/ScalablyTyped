package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccentColor extends js.Object {
  var accentColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccentColor {
  @scala.inline
  def apply(accentColor: java.lang.String = null): Anon_AccentColor = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor)
    __obj.asInstanceOf[Anon_AccentColor]
  }
}

