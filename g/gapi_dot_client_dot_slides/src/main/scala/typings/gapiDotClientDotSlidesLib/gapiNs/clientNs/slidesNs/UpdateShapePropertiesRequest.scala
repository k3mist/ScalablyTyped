package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateShapePropertiesRequest extends js.Object {
  /**
    * The fields that should be updated.
    *
    * At least one field must be specified. The root `shapeProperties` is
    * implied and should not be specified. A single `"&#42;"` can be used as
    * short-hand for listing every field.
    *
    * For example to update the shape background solid fill color, set `fields`
    * to `"shapeBackgroundFill.solidFill.color"`.
    *
    * To reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The object ID of the shape the updates are applied to. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /** The shape properties to update. */
  var shapeProperties: js.UndefOr[ShapeProperties] = js.undefined
}

object UpdateShapePropertiesRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    objectId: java.lang.String = null,
    shapeProperties: ShapeProperties = null
  ): UpdateShapePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (shapeProperties != null) __obj.updateDynamic("shapeProperties")(shapeProperties)
    __obj.asInstanceOf[UpdateShapePropertiesRequest]
  }
}

