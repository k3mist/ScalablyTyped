package typings
package cleanDashCssLib.cleanDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shared options passed when initializing a new instance of CleanCSS that returns either a promise or output
  */
trait OptionsBase extends js.Object {
  /**
    * Controls compatibility mode used; defaults to ie10+ using `'*'`.
    *  Compatibility hash exposes the following properties: `colors`, `properties`, `selectors`, and `units`
    */
  var compatibility: js.UndefOr[
    cleanDashCssLib.cleanDashCssLibStrings.`*` | cleanDashCssLib.cleanDashCssLibStrings.ie9 | cleanDashCssLib.cleanDashCssLibStrings.ie8 | cleanDashCssLib.cleanDashCssLibStrings.ie7 | cleanDashCssLib.cleanDashCssMod.CleanCSSNs.CompatibilityOptions
  ] = js.undefined
  /**
    * Controls a function for handling remote requests; Defaults to the build in `loadRemoteResource` function
    */
  var fetch: js.UndefOr[
    js.Function4[
      /* uri */ java.lang.String, 
      /* inlineRequest */ nodeLib.httpMod.RequestOptions | nodeLib.httpsMod.RequestOptions, 
      /* inlineTimeout */ scala.Double, 
      /* done */ js.Function2[
        /* message */ java.lang.String | scala.Double, 
        /* body */ java.lang.String, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Controls output CSS formatting; defaults to `false`.
    *  Format hash exposes the following properties: `breaks`, `breakWith`, `indentBy`, `indentWith`, `spaces`, and `wrapAt`.
    */
  var format: js.UndefOr[
    cleanDashCssLib.cleanDashCssLibStrings.beautify | cleanDashCssLib.cleanDashCssLibStrings.`keep-breaks` | cleanDashCssLib.cleanDashCssMod.CleanCSSNs.FormatOptions | cleanDashCssLib.cleanDashCssLibNumbers.`false`
  ] = js.undefined
  /**
    * inline option whitelists which @import rules will be processed.  Defaults to `'local'`
    * Accepts the following values:
    *  'local': enables local inlining;
    *  'remote': enables remote inlining;
    *  'none': disables all inlining;
    *  'all': enables all inlining, same as ['local', 'remote'];
    *  '[uri]': enables remote inlining from the specified uri;
    *  '![url]': disables remote inlining from the specified uri;
    */
  var `inline`: js.UndefOr[js.Array[java.lang.String] | cleanDashCssLib.cleanDashCssLibNumbers.`false`] = js.undefined
  /**
    * Controls extra options for inlining remote @import rules
    */
  var inlineRequest: js.UndefOr[nodeLib.httpMod.RequestOptions | nodeLib.httpsMod.RequestOptions] = js.undefined
  /**
    * Controls number of milliseconds after which inlining a remote @import fails; defaults to `5000`;
    */
  var inlineTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Controls optimization level used; defaults to `1`.
    * Level hash exposes `1`, and `2`.
    */
  var level: js.UndefOr[
    cleanDashCssLib.cleanDashCssLibNumbers.`0` | cleanDashCssLib.cleanDashCssLibNumbers.`1` | cleanDashCssLib.cleanDashCssLibNumbers.`2` | cleanDashCssLib.cleanDashCssMod.CleanCSSNs.OptimizationsOptions
  ] = js.undefined
  /**
    * Controls URL rebasing; defaults to `true`;
    */
  var rebase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * controls a directory to which all URLs are rebased, most likely the directory under which the output file
    * will live; defaults to the current directory;
    */
  var rebaseTo: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Controls whether an output source map is built; defaults to `false`
    */
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Controls embedding sources inside a source map's `sourcesContent` field; defaults to `false`
    */
  var sourceMapInlineSources: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionsBase {
  @scala.inline
  def apply(
    compatibility: cleanDashCssLib.cleanDashCssLibStrings.`*` | cleanDashCssLib.cleanDashCssLibStrings.ie9 | cleanDashCssLib.cleanDashCssLibStrings.ie8 | cleanDashCssLib.cleanDashCssLibStrings.ie7 | cleanDashCssLib.cleanDashCssMod.CleanCSSNs.CompatibilityOptions = null,
    fetch: js.Function4[
      /* uri */ java.lang.String, 
      /* inlineRequest */ nodeLib.httpMod.RequestOptions | nodeLib.httpsMod.RequestOptions, 
      /* inlineTimeout */ scala.Double, 
      /* done */ js.Function2[
        /* message */ java.lang.String | scala.Double, 
        /* body */ java.lang.String, 
        scala.Unit
      ], 
      scala.Unit
    ] = null,
    format: cleanDashCssLib.cleanDashCssLibStrings.beautify | cleanDashCssLib.cleanDashCssLibStrings.`keep-breaks` | cleanDashCssLib.cleanDashCssMod.CleanCSSNs.FormatOptions | cleanDashCssLib.cleanDashCssLibNumbers.`false` = null,
    `inline`: js.Array[java.lang.String] | cleanDashCssLib.cleanDashCssLibNumbers.`false` = null,
    inlineRequest: nodeLib.httpMod.RequestOptions | nodeLib.httpsMod.RequestOptions = null,
    inlineTimeout: scala.Int | scala.Double = null,
    level: cleanDashCssLib.cleanDashCssLibNumbers.`0` | cleanDashCssLib.cleanDashCssLibNumbers.`1` | cleanDashCssLib.cleanDashCssLibNumbers.`2` | cleanDashCssLib.cleanDashCssMod.CleanCSSNs.OptimizationsOptions = null,
    rebase: js.UndefOr[scala.Boolean] = js.undefined,
    rebaseTo: java.lang.String = null,
    sourceMap: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMapInlineSources: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionsBase = {
    val __obj = js.Dynamic.literal()
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (inlineRequest != null) __obj.updateDynamic("inlineRequest")(inlineRequest.asInstanceOf[js.Any])
    if (inlineTimeout != null) __obj.updateDynamic("inlineTimeout")(inlineTimeout.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(rebase)) __obj.updateDynamic("rebase")(rebase)
    if (rebaseTo != null) __obj.updateDynamic("rebaseTo")(rebaseTo)
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    if (!js.isUndefined(sourceMapInlineSources)) __obj.updateDynamic("sourceMapInlineSources")(sourceMapInlineSources)
    __obj.asInstanceOf[OptionsBase]
  }
}

