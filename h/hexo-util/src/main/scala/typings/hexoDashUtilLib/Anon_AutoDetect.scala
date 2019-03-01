package typings
package hexoDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoDetect extends js.Object {
  var autoDetect: js.UndefOr[scala.Boolean] = js.undefined
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var firstLine: js.UndefOr[scala.Double] = js.undefined
  var gutter: js.UndefOr[scala.Boolean] = js.undefined
  var hljs: js.UndefOr[scala.Boolean] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var mark: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var tab: js.UndefOr[java.lang.String] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AutoDetect {
  @scala.inline
  def apply(
    autoDetect: js.UndefOr[scala.Boolean] = js.undefined,
    caption: java.lang.String = null,
    firstLine: scala.Int | scala.Double = null,
    gutter: js.UndefOr[scala.Boolean] = js.undefined,
    hljs: js.UndefOr[scala.Boolean] = js.undefined,
    lang: java.lang.String = null,
    mark: js.Array[scala.Double] = null,
    tab: java.lang.String = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AutoDetect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDetect)) __obj.updateDynamic("autoDetect")(autoDetect)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (firstLine != null) __obj.updateDynamic("firstLine")(firstLine.asInstanceOf[js.Any])
    if (!js.isUndefined(gutter)) __obj.updateDynamic("gutter")(gutter)
    if (!js.isUndefined(hljs)) __obj.updateDynamic("hljs")(hljs)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (mark != null) __obj.updateDynamic("mark")(mark)
    if (tab != null) __obj.updateDynamic("tab")(tab)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[Anon_AutoDetect]
  }
}

