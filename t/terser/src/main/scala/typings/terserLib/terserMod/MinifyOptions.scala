package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinifyOptions extends js.Object {
  var compress: js.UndefOr[scala.Boolean | CompressOptions] = js.undefined
  var ecma: js.UndefOr[ECMA] = js.undefined
  var ie8: js.UndefOr[scala.Boolean] = js.undefined
  var keep_classnames: js.UndefOr[scala.Boolean | stdLib.RegExp] = js.undefined
  var keep_fnames: js.UndefOr[scala.Boolean | stdLib.RegExp] = js.undefined
  var mangle: js.UndefOr[scala.Boolean | MangleOptions] = js.undefined
  var module: js.UndefOr[scala.Boolean] = js.undefined
  var nameCache: js.UndefOr[js.Object] = js.undefined
  var output: js.UndefOr[OutputOptions] = js.undefined
  var parse: js.UndefOr[ParseOptions] = js.undefined
  var safari10: js.UndefOr[scala.Boolean] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean | SourceMapOptions] = js.undefined
  var toplevel: js.UndefOr[scala.Boolean] = js.undefined
  var warnings: js.UndefOr[scala.Boolean | terserLib.terserLibStrings.verbose] = js.undefined
}

object MinifyOptions {
  @scala.inline
  def apply(
    compress: scala.Boolean | CompressOptions = null,
    ecma: ECMA = null,
    ie8: js.UndefOr[scala.Boolean] = js.undefined,
    keep_classnames: scala.Boolean | stdLib.RegExp = null,
    keep_fnames: scala.Boolean | stdLib.RegExp = null,
    mangle: scala.Boolean | MangleOptions = null,
    module: js.UndefOr[scala.Boolean] = js.undefined,
    nameCache: js.Object = null,
    output: OutputOptions = null,
    parse: ParseOptions = null,
    safari10: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMap: scala.Boolean | SourceMapOptions = null,
    toplevel: js.UndefOr[scala.Boolean] = js.undefined,
    warnings: scala.Boolean | terserLib.terserLibStrings.verbose = null
  ): MinifyOptions = {
    val __obj = js.Dynamic.literal()
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (ecma != null) __obj.updateDynamic("ecma")(ecma)
    if (!js.isUndefined(ie8)) __obj.updateDynamic("ie8")(ie8)
    if (keep_classnames != null) __obj.updateDynamic("keep_classnames")(keep_classnames.asInstanceOf[js.Any])
    if (keep_fnames != null) __obj.updateDynamic("keep_fnames")(keep_fnames.asInstanceOf[js.Any])
    if (mangle != null) __obj.updateDynamic("mangle")(mangle.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module)
    if (nameCache != null) __obj.updateDynamic("nameCache")(nameCache)
    if (output != null) __obj.updateDynamic("output")(output)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (!js.isUndefined(safari10)) __obj.updateDynamic("safari10")(safari10)
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(toplevel)) __obj.updateDynamic("toplevel")(toplevel)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinifyOptions]
  }
}

