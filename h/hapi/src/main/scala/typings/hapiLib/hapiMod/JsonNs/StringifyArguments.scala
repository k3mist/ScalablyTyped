package typings
package hapiLib.hapiMod.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For context [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsjson)
  */
trait StringifyArguments extends js.Object {
  /* calls Hoek.jsonEscape() after conversion to JSON string. Defaults to false. */
  var escape: js.UndefOr[scala.Boolean] = js.undefined
  /** the replacer function or array. Defaults to no action. */
  var replacer: js.UndefOr[StringifyReplacer] = js.undefined
  /** number of spaces to indent nested object keys. Defaults to no indentation. */
  var space: js.UndefOr[StringifySpace] = js.undefined
  /* string suffix added after conversion to JSON string. Defaults to no suffix. */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object StringifyArguments {
  @scala.inline
  def apply(
    escape: js.UndefOr[scala.Boolean] = js.undefined,
    replacer: StringifyReplacer = null,
    space: StringifySpace = null,
    suffix: java.lang.String = null
  ): StringifyArguments = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(escape)) __obj.updateDynamic("escape")(escape)
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[StringifyArguments]
  }
}

