package typings
package winrtLib.WindowsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorHelperStatics extends js.Object {
  def fromArgb(a: scala.Double, r: scala.Double, g: scala.Double, b: scala.Double): Color
}

object IColorHelperStatics {
  @scala.inline
  def apply(fromArgb: (scala.Double, scala.Double, scala.Double, scala.Double) => Color): IColorHelperStatics = {
    val __obj = js.Dynamic.literal(fromArgb = js.Any.fromFunction4(fromArgb))
  
    __obj.asInstanceOf[IColorHelperStatics]
  }
}

