package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeValue extends js.Object {
  /** A Boolean value represented by `true` or `false`. */
  var boolValue: js.UndefOr[scala.Boolean] = js.undefined
  /** A 64-bit signed integer. */
  var intValue: js.UndefOr[java.lang.String] = js.undefined
  /** A string up to 256 bytes long. */
  var stringValue: js.UndefOr[TruncatableString] = js.undefined
}

object AttributeValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[scala.Boolean] = js.undefined,
    intValue: java.lang.String = null,
    stringValue: TruncatableString = null
  ): AttributeValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue)
    if (intValue != null) __obj.updateDynamic("intValue")(intValue)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    __obj.asInstanceOf[AttributeValue]
  }
}

