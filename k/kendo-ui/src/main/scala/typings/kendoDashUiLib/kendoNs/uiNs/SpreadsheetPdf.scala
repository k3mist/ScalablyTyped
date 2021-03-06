package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetPdf extends js.Object {
  var area: js.UndefOr[java.lang.String] = js.undefined
  var author: js.UndefOr[java.lang.String] = js.undefined
  var creator: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var fitWidth: js.UndefOr[scala.Boolean] = js.undefined
  var forceProxy: js.UndefOr[scala.Boolean] = js.undefined
  var guidelines: js.UndefOr[scala.Boolean] = js.undefined
  var hCenter: js.UndefOr[scala.Boolean] = js.undefined
  var keywords: js.UndefOr[java.lang.String] = js.undefined
  var landscape: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[SpreadsheetPdfMargin] = js.undefined
  var paperSize: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var proxyTarget: js.UndefOr[java.lang.String] = js.undefined
  var proxyURL: js.UndefOr[java.lang.String] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var vCenter: js.UndefOr[scala.Boolean] = js.undefined
}

object SpreadsheetPdf {
  @scala.inline
  def apply(
    area: java.lang.String = null,
    author: java.lang.String = null,
    creator: java.lang.String = null,
    date: stdLib.Date = null,
    fileName: java.lang.String = null,
    fitWidth: js.UndefOr[scala.Boolean] = js.undefined,
    forceProxy: js.UndefOr[scala.Boolean] = js.undefined,
    guidelines: js.UndefOr[scala.Boolean] = js.undefined,
    hCenter: js.UndefOr[scala.Boolean] = js.undefined,
    keywords: java.lang.String = null,
    landscape: js.UndefOr[scala.Boolean] = js.undefined,
    margin: SpreadsheetPdfMargin = null,
    paperSize: java.lang.String | js.Any = null,
    proxyTarget: java.lang.String = null,
    proxyURL: java.lang.String = null,
    subject: java.lang.String = null,
    title: java.lang.String = null,
    vCenter: js.UndefOr[scala.Boolean] = js.undefined
  ): SpreadsheetPdf = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area)
    if (author != null) __obj.updateDynamic("author")(author)
    if (creator != null) __obj.updateDynamic("creator")(creator)
    if (date != null) __obj.updateDynamic("date")(date)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (!js.isUndefined(fitWidth)) __obj.updateDynamic("fitWidth")(fitWidth)
    if (!js.isUndefined(forceProxy)) __obj.updateDynamic("forceProxy")(forceProxy)
    if (!js.isUndefined(guidelines)) __obj.updateDynamic("guidelines")(guidelines)
    if (!js.isUndefined(hCenter)) __obj.updateDynamic("hCenter")(hCenter)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (!js.isUndefined(landscape)) __obj.updateDynamic("landscape")(landscape)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (paperSize != null) __obj.updateDynamic("paperSize")(paperSize.asInstanceOf[js.Any])
    if (proxyTarget != null) __obj.updateDynamic("proxyTarget")(proxyTarget)
    if (proxyURL != null) __obj.updateDynamic("proxyURL")(proxyURL)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(vCenter)) __obj.updateDynamic("vCenter")(vCenter)
    __obj.asInstanceOf[SpreadsheetPdf]
  }
}

