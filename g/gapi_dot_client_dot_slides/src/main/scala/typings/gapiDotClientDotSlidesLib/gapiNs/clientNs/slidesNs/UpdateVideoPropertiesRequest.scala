package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVideoPropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.
    *
    * At least one field must be specified. The root `videoProperties` is
    * implied and should not be specified. A single `"&#42;"` can be used as
    * short-hand for listing every field.
    *
    * For example to update the video outline color, set `fields` to
    * `"outline.outlineFill.solidFill.color"`.
    *
    * To reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The object ID of the video the updates are applied to. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /** The video properties to update. */
  var videoProperties: js.UndefOr[VideoProperties] = js.undefined
}

object UpdateVideoPropertiesRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    objectId: java.lang.String = null,
    videoProperties: VideoProperties = null
  ): UpdateVideoPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (videoProperties != null) __obj.updateDynamic("videoProperties")(videoProperties)
    __obj.asInstanceOf[UpdateVideoPropertiesRequest]
  }
}

