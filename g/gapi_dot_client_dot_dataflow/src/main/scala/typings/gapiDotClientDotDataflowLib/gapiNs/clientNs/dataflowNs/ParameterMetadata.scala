package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterMetadata extends js.Object {
  /** Required. The help text to display for the parameter. */
  var helpText: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Whether the parameter is optional. Defaults to false. */
  var isOptional: js.UndefOr[scala.Boolean] = js.undefined
  /** Required. The label to display for the parameter. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The name of the parameter. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Regexes that the parameter must match. */
  var regexes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ParameterMetadata {
  @scala.inline
  def apply(
    helpText: java.lang.String = null,
    isOptional: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    name: java.lang.String = null,
    regexes: js.Array[java.lang.String] = null
  ): ParameterMetadata = {
    val __obj = js.Dynamic.literal()
    if (helpText != null) __obj.updateDynamic("helpText")(helpText)
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional)
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (regexes != null) __obj.updateDynamic("regexes")(regexes)
    __obj.asInstanceOf[ParameterMetadata]
  }
}

