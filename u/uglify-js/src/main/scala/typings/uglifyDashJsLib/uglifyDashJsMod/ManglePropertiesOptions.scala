package typings
package uglifyDashJsLib.uglifyDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManglePropertiesOptions extends js.Object {
  /** Use true to allow the mangling of builtin DOM properties. Not recommended to override this setting. */
  var builtins: js.UndefOr[scala.Boolean] = js.undefined
  /** Mangle names with the original name still present. Pass an empty string "" to enable, or a non-empty string to set the debug suffix. */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /** Only mangle unquoted property names */
  var keep_quoted: js.UndefOr[scala.Boolean] = js.undefined
  /** Pass a RegExp literal to only mangle property names matching the regular expression. */
  var regex: js.UndefOr[stdLib.RegExp] = js.undefined
  /** Do not mangle property names listed in the reserved array */
  var reserved: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ManglePropertiesOptions {
  @scala.inline
  def apply(
    builtins: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    keep_quoted: js.UndefOr[scala.Boolean] = js.undefined,
    regex: stdLib.RegExp = null,
    reserved: js.Array[java.lang.String] = null
  ): ManglePropertiesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(builtins)) __obj.updateDynamic("builtins")(builtins)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(keep_quoted)) __obj.updateDynamic("keep_quoted")(keep_quoted)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (reserved != null) __obj.updateDynamic("reserved")(reserved)
    __obj.asInstanceOf[ManglePropertiesOptions]
  }
}

