package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Angle extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Angle {
  @scala.inline
  def apply(angle: scala.Int | scala.Double = null): Anon_Angle = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Angle]
  }
}

