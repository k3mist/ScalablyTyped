package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of InkStroke objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait InkStrokeCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the InkStroke object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var floatingInk: js.UndefOr[FloatingInkLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the InkStroke object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
}

object InkStrokeCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    floatingInk: FloatingInkLoadOptions = null,
    id: js.UndefOr[scala.Boolean] = js.undefined
  ): InkStrokeCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (floatingInk != null) __obj.updateDynamic("floatingInk")(floatingInk)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[InkStrokeCollectionLoadOptions]
  }
}

