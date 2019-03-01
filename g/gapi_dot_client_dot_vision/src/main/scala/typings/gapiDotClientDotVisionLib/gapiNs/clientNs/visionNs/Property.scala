package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  /** Name of the property. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Value of numeric properties. */
  var uint64Value: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the property. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Property {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    uint64Value: java.lang.String = null,
    value: java.lang.String = null
  ): Property = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (uint64Value != null) __obj.updateDynamic("uint64Value")(uint64Value)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Property]
  }
}

