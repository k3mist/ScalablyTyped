package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X
  extends overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs._Coordinates {
  var x: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Position] = js.undefined
  var y: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Position] = js.undefined
}

object Anon_X {
  @scala.inline
  def apply(
    x: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Position = null,
    y: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Position = null
  ): Anon_X = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_X]
  }
}

