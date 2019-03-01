package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mirror object referencing original JavaScript object.
  */
trait RemoteObject extends js.Object {
  /**
    * Object class (constructor) name. Specified for `object` type values only.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @experimental
    */
  var customPreview: js.UndefOr[CustomPreview] = js.undefined
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Unique object identifier (for non-primitive values).
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  /**
    * Preview containing abbreviated property values. Specified for `object` type values only.
    * @experimental
    */
  var preview: js.UndefOr[ObjectPreview] = js.undefined
  /**
    * Object subtype hint. Specified for `object` type values only.
    */
  var subtype: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Object type.
    */
  var `type`: java.lang.String
  /**
    * Primitive value which can not be JSON-stringified does not have `value`, but gets this
    * property.
    */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.undefined
  /**
    * Remote object value in case of primitive values or JSON values (if it was requested).
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object RemoteObject {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    className: java.lang.String = null,
    customPreview: CustomPreview = null,
    description: java.lang.String = null,
    objectId: RemoteObjectId = null,
    preview: ObjectPreview = null,
    subtype: java.lang.String = null,
    unserializableValue: UnserializableValue = null,
    value: js.Any = null
  ): RemoteObject = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (className != null) __obj.updateDynamic("className")(className)
    if (customPreview != null) __obj.updateDynamic("customPreview")(customPreview)
    if (description != null) __obj.updateDynamic("description")(description)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (preview != null) __obj.updateDynamic("preview")(preview)
    if (subtype != null) __obj.updateDynamic("subtype")(subtype)
    if (unserializableValue != null) __obj.updateDynamic("unserializableValue")(unserializableValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RemoteObject]
  }
}

