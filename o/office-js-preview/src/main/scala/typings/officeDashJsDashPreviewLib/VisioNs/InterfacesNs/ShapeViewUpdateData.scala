package typings
package officeDashJsDashPreviewLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeView object, for use in "shapeView.set({ ... })". */
trait ShapeViewUpdateData extends js.Object {
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: js.UndefOr[officeDashJsDashPreviewLib.VisioNs.Highlight] = js.undefined
}

object ShapeViewUpdateData {
  @scala.inline
  def apply(highlight: officeDashJsDashPreviewLib.VisioNs.Highlight = null): ShapeViewUpdateData = {
    val __obj = js.Dynamic.literal()
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    __obj.asInstanceOf[ShapeViewUpdateData]
  }
}

