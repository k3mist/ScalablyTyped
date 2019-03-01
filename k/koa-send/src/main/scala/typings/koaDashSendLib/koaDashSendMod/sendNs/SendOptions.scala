package typings
package koaDashSendLib.koaDashSendMod.sendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends js.Object {
  /** Try to serve the brotli version of a file automatically when brotli is supported by a client and if the requested file with .br extension exists. (defaults to true). */
  var brotli: js.UndefOr[scala.Boolean] = js.undefined
  /** Try to match extensions from passed array to search for file when no extension is sufficed in URL. First found is served. (defaults to false) */
  var extensions: js.UndefOr[js.Array[java.lang.String] | koaDashSendLib.koaDashSendLibNumbers.`false`] = js.undefined
  /** If not false (defaults to true), format the path to serve static file servers and not require a trailing slash for directories, so that you can do both /directory and /directory/. */
  var format: js.UndefOr[scala.Boolean] = js.undefined
  /** Try to serve the gzipped version of a file automatically when gzip is supported by a client and if the requested file with .gz extension exists. (defaults to true). */
  var gzip: js.UndefOr[scala.Boolean] = js.undefined
  /** Allow transfer of hidden files. (defaults to false) */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Tell the browser the resource is immutable and can be cached indefinitely. (defaults to false) */
  var immutable: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of the index file to serve automatically when visiting the root location. (defaults to none) */
  var index: js.UndefOr[java.lang.String | koaDashSendLib.koaDashSendLibNumbers.`false`] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  /** Browser cache max-age in milliseconds. (defaults to 0) */
  var maxage: js.UndefOr[scala.Double] = js.undefined
  /** Root directory to restrict file access. (defaults to '') */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** Function to set custom headers on response. */
  var setHeaders: js.UndefOr[SetHeaders] = js.undefined
}

object SendOptions {
  @scala.inline
  def apply(
    brotli: js.UndefOr[scala.Boolean] = js.undefined,
    extensions: js.Array[java.lang.String] | koaDashSendLib.koaDashSendLibNumbers.`false` = null,
    format: js.UndefOr[scala.Boolean] = js.undefined,
    gzip: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    immutable: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String | koaDashSendLib.koaDashSendLibNumbers.`false` = null,
    maxAge: scala.Int | scala.Double = null,
    maxage: scala.Int | scala.Double = null,
    root: java.lang.String = null,
    setHeaders: SetHeaders = null
  ): SendOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(brotli)) __obj.updateDynamic("brotli")(brotli)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (maxage != null) __obj.updateDynamic("maxage")(maxage.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root)
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(setHeaders)
    __obj.asInstanceOf[SendOptions]
  }
}

