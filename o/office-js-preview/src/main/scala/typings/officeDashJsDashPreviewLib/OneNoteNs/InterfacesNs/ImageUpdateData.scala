package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Image object, for use in "image.set({ ... })". */
trait ImageUpdateData extends js.Object {
  /**
    *
    * Gets or sets the description of the Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the height of the Image layout.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the hyperlink of the Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var hyperlink: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the width of the Image layout.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ImageUpdateData {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    hyperlink: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): ImageUpdateData = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUpdateData]
  }
}

