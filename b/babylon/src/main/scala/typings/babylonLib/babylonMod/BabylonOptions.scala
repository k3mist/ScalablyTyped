package typings
package babylonLib.babylonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabylonOptions extends js.Object {
  /**
    * By default, import and export declarations can only appear at a program's top level.
    * Setting this option to true allows them anywhere where a statement is allowed.
    */
  var allowImportExportEverywhere: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, a return statement at the top level raises an error. Set this to true to accept such code.
    */
  var allowReturnOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined
  var allowSuperOutsideMethod: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Array containing the plugins that you want to enable.
    */
  var plugins: js.UndefOr[js.Array[PluginName]] = js.undefined
  /**
    * Correlate output AST nodes with their source filename. Useful when
    * generating code and source maps from the ASTs of multiple input files.
    */
  var sourceFilename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicate the mode the code should be parsed in. Can be either "script" or "module".
    */
  var sourceType: js.UndefOr[babylonLib.babylonLibStrings.script | babylonLib.babylonLibStrings.module] = js.undefined
}

object BabylonOptions {
  @scala.inline
  def apply(
    allowImportExportEverywhere: js.UndefOr[scala.Boolean] = js.undefined,
    allowReturnOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined,
    allowSuperOutsideMethod: js.UndefOr[scala.Boolean] = js.undefined,
    plugins: js.Array[PluginName] = null,
    sourceFilename: java.lang.String = null,
    sourceType: babylonLib.babylonLibStrings.script | babylonLib.babylonLibStrings.module = null
  ): BabylonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowImportExportEverywhere)) __obj.updateDynamic("allowImportExportEverywhere")(allowImportExportEverywhere)
    if (!js.isUndefined(allowReturnOutsideFunction)) __obj.updateDynamic("allowReturnOutsideFunction")(allowReturnOutsideFunction)
    if (!js.isUndefined(allowSuperOutsideMethod)) __obj.updateDynamic("allowSuperOutsideMethod")(allowSuperOutsideMethod)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (sourceFilename != null) __obj.updateDynamic("sourceFilename")(sourceFilename)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabylonOptions]
  }
}

