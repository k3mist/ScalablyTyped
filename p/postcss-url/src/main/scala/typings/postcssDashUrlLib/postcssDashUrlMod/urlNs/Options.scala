package typings
package postcssDashUrlLib.postcssDashUrlMod.urlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The assets files will be copied in that destination.
    *
    * @default false
    */
  var assetsPath: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * Specify the base path or list of base paths where to search images from.
    */
  var basePath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The fallback method to use if the maximum size is exceeded or the URL contains a hash.
    */
  var fallback: js.UndefOr[CustomTransformFunction] = js.undefined
  /**
    * Determine wether a file should be inlined.
    */
  var filter: js.UndefOr[stdLib.RegExp | CustomFilterFunction | java.lang.String] = js.undefined
  /**
    * Hash options
    */
  var hashOptions: js.UndefOr[postcssDashUrlLib.Anon_Append] = js.undefined
  /**
    * Do not warn when an SVG URL with a fragment is inlined.
    * PostCSS-URL does not support partial inlining.
    * The entire SVG file will be inlined.
    * By default a warning will be issued when this occurs.
    *
    * @default false
    */
  var ignoreFragmentWarning: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies whether the URL's fragment identifer value, if present, will be added to the inlined data URI.
    *
    * @default false
    */
  var includeUriFragment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the maximum file size to inline (in kilobytes).
    */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Reduce size of inlined svg (IE9+, Android 3+)
    *
    * @default false
    */
  var optimizeSvgEncode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * URL rewriting mechanism.
    *
    * @default 'rebase'
    */
  var url: js.UndefOr[
    postcssDashUrlLib.postcssDashUrlLibStrings.copy | postcssDashUrlLib.postcssDashUrlLibStrings.`inline` | postcssDashUrlLib.postcssDashUrlLibStrings.rebase | CustomTransformFunction
  ] = js.undefined
  /**
    * Rename the path of the files by a hash name.
    *
    * @default false
    */
  var useHash: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    assetsPath: scala.Boolean | java.lang.String = null,
    basePath: java.lang.String | js.Array[java.lang.String] = null,
    fallback: CustomTransformFunction = null,
    filter: stdLib.RegExp | CustomFilterFunction | java.lang.String = null,
    hashOptions: postcssDashUrlLib.Anon_Append = null,
    ignoreFragmentWarning: js.UndefOr[scala.Boolean] = js.undefined,
    includeUriFragment: js.UndefOr[scala.Boolean] = js.undefined,
    maxSize: scala.Int | scala.Double = null,
    optimizeSvgEncode: js.UndefOr[scala.Boolean] = js.undefined,
    url: postcssDashUrlLib.postcssDashUrlLibStrings.copy | postcssDashUrlLib.postcssDashUrlLibStrings.`inline` | postcssDashUrlLib.postcssDashUrlLibStrings.rebase | CustomTransformFunction = null,
    useHash: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (assetsPath != null) __obj.updateDynamic("assetsPath")(assetsPath.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (hashOptions != null) __obj.updateDynamic("hashOptions")(hashOptions)
    if (!js.isUndefined(ignoreFragmentWarning)) __obj.updateDynamic("ignoreFragmentWarning")(ignoreFragmentWarning)
    if (!js.isUndefined(includeUriFragment)) __obj.updateDynamic("includeUriFragment")(includeUriFragment)
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeSvgEncode)) __obj.updateDynamic("optimizeSvgEncode")(optimizeSvgEncode)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useHash)) __obj.updateDynamic("useHash")(useHash)
    __obj.asInstanceOf[Options]
  }
}

