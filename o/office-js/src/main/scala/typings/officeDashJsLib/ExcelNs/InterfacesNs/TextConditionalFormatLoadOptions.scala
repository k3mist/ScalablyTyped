package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a specific text conditional format.
  *
  * [Api set: ExcelApi 1.6]
  */
trait TextConditionalFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatLoadOptions] = js.undefined
  /**
    *
    * The rule of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[scala.Boolean] = js.undefined
}

object TextConditionalFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    format: ConditionalRangeFormatLoadOptions = null,
    rule: js.UndefOr[scala.Boolean] = js.undefined
  ): TextConditionalFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(rule)) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[TextConditionalFormatLoadOptions]
  }
}

