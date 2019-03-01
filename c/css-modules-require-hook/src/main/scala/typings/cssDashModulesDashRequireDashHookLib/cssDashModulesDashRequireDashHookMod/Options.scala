package typings
package cssDashModulesDashRequireDashHookLib.cssDashModulesDashRequireDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Appends custom plugins to the end of the PostCSS pipeline. */
  var append: js.UndefOr[js.Array[_]] = js.undefined
  /** Camelizes exported class names. */
  var camelCase: js.UndefOr[scala.Boolean] = js.undefined
  /** Short alias for the postcss-modules-extract-imports plugin's createImportedName option. */
  var createImportedName: js.UndefOr[js.Function] = js.undefined
  /** Helps you to invalidate cache of all require calls. */
  var devMode: js.UndefOr[scala.Boolean] = js.undefined
  /** Attach the require hook to additional file extensions. */
  var extensions: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Short alias for the postcss-modules-scope plugin's option. */
  var generateScopedName: js.UndefOr[java.lang.String | js.Function] = js.undefined
  /** Short alias for the generic-names helper option. */
  var hashPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Provides possibility to exclude particular files from processing. */
  var ignore: js.UndefOr[
    java.lang.String | stdLib.RegExp | (js.Function1[/* filepath */ java.lang.String, scala.Boolean])
  ] = js.undefined
  /** Short alias for the postcss-modules-local-by-default plugin's option. */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /** Prepends custom plugins to the beginning of the PostCSS pipeline. */
  var prepend: js.UndefOr[js.Array[_]] = js.undefined
  /** In rare cases you may want to precompile styles, before they will be passed to the PostCSS pipeline. */
  var preprocessCss: js.UndefOr[js.Function] = js.undefined
  /** In rare cases you may want to get compiled styles in runtime, so providing this option helps. */
  var processCss: js.UndefOr[js.Function] = js.undefined
  /** Provides possibility to pass custom options to the LazyResult instance. */
  var processorOpts: js.UndefOr[js.Object] = js.undefined
  /** Provides absolute path to the project directory. */
  var rootDir: js.UndefOr[java.lang.String] = js.undefined
  /** Provides the full list of PostCSS plugins to the pipeline. */
  var use: js.UndefOr[js.Array[_]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    append: js.Array[_] = null,
    camelCase: js.UndefOr[scala.Boolean] = js.undefined,
    createImportedName: js.Function = null,
    devMode: js.UndefOr[scala.Boolean] = js.undefined,
    extensions: java.lang.String | js.Array[java.lang.String] = null,
    generateScopedName: java.lang.String | js.Function = null,
    hashPrefix: java.lang.String = null,
    ignore: java.lang.String | stdLib.RegExp | (js.Function1[/* filepath */ java.lang.String, scala.Boolean]) = null,
    mode: java.lang.String = null,
    prepend: js.Array[_] = null,
    preprocessCss: js.Function = null,
    processCss: js.Function = null,
    processorOpts: js.Object = null,
    rootDir: java.lang.String = null,
    use: js.Array[_] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(append)
    if (!js.isUndefined(camelCase)) __obj.updateDynamic("camelCase")(camelCase)
    if (createImportedName != null) __obj.updateDynamic("createImportedName")(createImportedName)
    if (!js.isUndefined(devMode)) __obj.updateDynamic("devMode")(devMode)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (generateScopedName != null) __obj.updateDynamic("generateScopedName")(generateScopedName.asInstanceOf[js.Any])
    if (hashPrefix != null) __obj.updateDynamic("hashPrefix")(hashPrefix)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (prepend != null) __obj.updateDynamic("prepend")(prepend)
    if (preprocessCss != null) __obj.updateDynamic("preprocessCss")(preprocessCss)
    if (processCss != null) __obj.updateDynamic("processCss")(processCss)
    if (processorOpts != null) __obj.updateDynamic("processorOpts")(processorOpts)
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[Options]
  }
}

