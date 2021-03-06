package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Click extends js.Object {
  var click: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var doubleclick: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var frame: js.UndefOr[js.Function1[/* event */ paperLib.paperNs.IFrameEvent, scala.Unit]] = js.undefined
  var mousedown: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var mousedrag: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var mouseenter: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var mouseleave: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var mousemove: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var mouseup: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
}

object Anon_Click {
  @scala.inline
  def apply(
    click: /* event */ paperLib.paperNs.MouseEvent => scala.Unit | scala.Boolean = null,
    doubleclick: /* event */ paperLib.paperNs.MouseEvent => scala.Unit | scala.Boolean = null,
    frame: /* event */ paperLib.paperNs.IFrameEvent => scala.Unit = null,
    mousedown: /* event */ paperLib.paperNs.MouseEvent => scala.Unit | scala.Boolean = null,
    mousedrag: /* event */ paperLib.paperNs.MouseEvent => scala.Unit | scala.Boolean = null,
    mouseenter: /* event */ paperLib.paperNs.MouseEvent => scala.Unit | scala.Boolean = null,
    mouseleave: /* event */ paperLib.paperNs.MouseEvent => scala.Unit | scala.Boolean = null,
    mousemove: /* event */ paperLib.paperNs.MouseEvent => scala.Unit | scala.Boolean = null,
    mouseup: /* event */ paperLib.paperNs.MouseEvent => scala.Unit | scala.Boolean = null
  ): Anon_Click = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (doubleclick != null) __obj.updateDynamic("doubleclick")(js.Any.fromFunction1(doubleclick))
    if (frame != null) __obj.updateDynamic("frame")(js.Any.fromFunction1(frame))
    if (mousedown != null) __obj.updateDynamic("mousedown")(js.Any.fromFunction1(mousedown))
    if (mousedrag != null) __obj.updateDynamic("mousedrag")(js.Any.fromFunction1(mousedrag))
    if (mouseenter != null) __obj.updateDynamic("mouseenter")(js.Any.fromFunction1(mouseenter))
    if (mouseleave != null) __obj.updateDynamic("mouseleave")(js.Any.fromFunction1(mouseleave))
    if (mousemove != null) __obj.updateDynamic("mousemove")(js.Any.fromFunction1(mousemove))
    if (mouseup != null) __obj.updateDynamic("mouseup")(js.Any.fromFunction1(mouseup))
    __obj.asInstanceOf[Anon_Click]
  }
}

