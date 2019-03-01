package typings
package ejDotWebDotAllLib.ejNs.DroppableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Used to accept the specified draggable items.
    * @Default {null}
    */
  var accept: js.UndefOr[js.Any] = js.undefined
  /** This event is triggered when the mouse up is moved during the dragging.
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, scala.Unit]] = js.undefined
  /** This event is triggered when the mouse is moved out.
    */
  var out: js.UndefOr[js.Function1[/* e */ OutEventArgs, scala.Unit]] = js.undefined
  /** This event is triggered when the mouse is moved over.
    */
  var over: js.UndefOr[js.Function1[/* e */ OverEventArgs, scala.Unit]] = js.undefined
  /** Used to group sets of droppable items, in addition to droppable's accept option. A draggable with the same scope value as a droppable will be accepted by the droppable.
    * @Default {'default'}
    */
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    accept: js.Any = null,
    drop: js.Function1[/* e */ DropEventArgs, scala.Unit] = null,
    out: js.Function1[/* e */ OutEventArgs, scala.Unit] = null,
    over: js.Function1[/* e */ OverEventArgs, scala.Unit] = null,
    scope: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (out != null) __obj.updateDynamic("out")(out)
    if (over != null) __obj.updateDynamic("over")(over)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Model]
  }
}

