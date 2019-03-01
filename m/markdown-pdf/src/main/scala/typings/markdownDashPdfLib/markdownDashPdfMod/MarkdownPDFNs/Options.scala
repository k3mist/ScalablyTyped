package typings
package markdownDashPdfLib.markdownDashPdfMod.MarkdownPDFNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration options */
trait Options extends js.Object {
  /** Path to custom CSS file, relative to current directory. */
  var cssPath: js.UndefOr[java.lang.String] = js.undefined
  /** Current working directory. */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /** Path to custorm highlight CSS file (for code highlighting with highlight.js), relative to the current directory. */
  var highlightCssPath: js.UndefOr[java.lang.String] = js.undefined
  /** If renderDelay option isn't set, this is the timeout (in ms) before the page is rendered in case the page.onLoadFinished event doesn't fire. */
  var loadTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Supported dimension units are: 'mm', 'cm', 'in', 'px' */
  var paperBorder: js.UndefOr[java.lang.String] = js.undefined
  var paperFormat: js.UndefOr[PaperFormat] = js.undefined
  var paperOrientation: js.UndefOr[PaperOrientation] = js.undefined
  /** Path to the phantomjs library. */
  var phantomPath: js.UndefOr[java.lang.String] = js.undefined
  /** A function that returns a through2 stream that transforms the HTML before it is converted to PDF. */
  var preProcessHtml: js.UndefOr[js.Function0[_]] = js.undefined
  /** A function that returns a through2 stream that transforms the markdown before it is converted to HTML. */
  var preProcessMd: js.UndefOr[js.Function0[_]] = js.undefined
  /** A config object that is passed to remarkable, the underlying markdown parser */
  var remarkable: js.UndefOr[js.Any] = js.undefined
  /** Delay (in ms) before the PDF is rendered. */
  var renderDelay: js.UndefOr[scala.Double] = js.undefined
  /** Path to CommonJS module which sets the page header and footer (see runnings.js). */
  var runningsPath: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cssPath: java.lang.String = null,
    cwd: java.lang.String = null,
    highlightCssPath: java.lang.String = null,
    loadTimeout: scala.Int | scala.Double = null,
    paperBorder: java.lang.String = null,
    paperFormat: PaperFormat = null,
    paperOrientation: PaperOrientation = null,
    phantomPath: java.lang.String = null,
    preProcessHtml: js.Function0[_] = null,
    preProcessMd: js.Function0[_] = null,
    remarkable: js.Any = null,
    renderDelay: scala.Int | scala.Double = null,
    runningsPath: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cssPath != null) __obj.updateDynamic("cssPath")(cssPath)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (highlightCssPath != null) __obj.updateDynamic("highlightCssPath")(highlightCssPath)
    if (loadTimeout != null) __obj.updateDynamic("loadTimeout")(loadTimeout.asInstanceOf[js.Any])
    if (paperBorder != null) __obj.updateDynamic("paperBorder")(paperBorder)
    if (paperFormat != null) __obj.updateDynamic("paperFormat")(paperFormat)
    if (paperOrientation != null) __obj.updateDynamic("paperOrientation")(paperOrientation)
    if (phantomPath != null) __obj.updateDynamic("phantomPath")(phantomPath)
    if (preProcessHtml != null) __obj.updateDynamic("preProcessHtml")(preProcessHtml)
    if (preProcessMd != null) __obj.updateDynamic("preProcessMd")(preProcessMd)
    if (remarkable != null) __obj.updateDynamic("remarkable")(remarkable)
    if (renderDelay != null) __obj.updateDynamic("renderDelay")(renderDelay.asInstanceOf[js.Any])
    if (runningsPath != null) __obj.updateDynamic("runningsPath")(runningsPath)
    __obj.asInstanceOf[Options]
  }
}

