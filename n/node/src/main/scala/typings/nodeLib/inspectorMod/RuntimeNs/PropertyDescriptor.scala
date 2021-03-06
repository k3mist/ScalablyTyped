package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object property descriptor.
  */
trait PropertyDescriptor extends js.Object {
  /**
    * True if the type of this property descriptor may be changed and if the property may be
    * deleted from the corresponding object.
    */
  var configurable: scala.Boolean
  /**
    * True if this property shows up during enumeration of the properties on the corresponding
    * object.
    */
  var enumerable: scala.Boolean
  /**
    * A function which serves as a getter for the property, or `undefined` if there is no getter
    * (accessor descriptors only).
    */
  var get: js.UndefOr[RemoteObject] = js.undefined
  /**
    * True if the property is owned for the object.
    */
  var isOwn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Property name or symbol description.
    */
  var name: java.lang.String
  /**
    * A function which serves as a setter for the property, or `undefined` if there is no setter
    * (accessor descriptors only).
    */
  var set: js.UndefOr[RemoteObject] = js.undefined
  /**
    * Property symbol object, if the property is of the `symbol` type.
    */
  var symbol: js.UndefOr[RemoteObject] = js.undefined
  /**
    * The value associated with the property.
    */
  var value: js.UndefOr[RemoteObject] = js.undefined
  /**
    * True if the result was thrown during the evaluation.
    */
  var wasThrown: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * True if the value associated with the property may be changed (data descriptors only).
    */
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object PropertyDescriptor {
  @scala.inline
  def apply(
    configurable: scala.Boolean,
    enumerable: scala.Boolean,
    name: java.lang.String,
    get: RemoteObject = null,
    isOwn: js.UndefOr[scala.Boolean] = js.undefined,
    set: RemoteObject = null,
    symbol: RemoteObject = null,
    value: RemoteObject = null,
    wasThrown: js.UndefOr[scala.Boolean] = js.undefined,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): PropertyDescriptor = {
    val __obj = js.Dynamic.literal(configurable = configurable, enumerable = enumerable, name = name)
    if (get != null) __obj.updateDynamic("get")(get)
    if (!js.isUndefined(isOwn)) __obj.updateDynamic("isOwn")(isOwn)
    if (set != null) __obj.updateDynamic("set")(set)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(wasThrown)) __obj.updateDynamic("wasThrown")(wasThrown)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[PropertyDescriptor]
  }
}

