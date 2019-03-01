package typings
package rollupDashPluginDashJsonLib.rollupDashPluginDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var exclude: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    *  All JSON files will be parsed by default, but you can also specifically include/exclude files
    */
  var include: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * specify indentation for the generated default export — defaults to '\t'
    * @default '\t'
    */
  var indent: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  for tree-shaking, properties will be declared as variables, using either `var` or `const`
    *  @default false
    */
  var preferConst: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exclude: java.lang.String | js.Array[java.lang.String] = null,
    include: java.lang.String | js.Array[java.lang.String] = null,
    indent: java.lang.String = null,
    preferConst: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (!js.isUndefined(preferConst)) __obj.updateDynamic("preferConst")(preferConst)
    __obj.asInstanceOf[Options]
  }
}

