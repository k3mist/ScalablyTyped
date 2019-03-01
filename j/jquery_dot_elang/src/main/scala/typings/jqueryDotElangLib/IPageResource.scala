package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageResource extends js.Object {
  var lang: js.UndefOr[IPageLangItems] = js.undefined
  var selectedLang: js.UndefOr[java.lang.String] = js.undefined
}

object IPageResource {
  @scala.inline
  def apply(lang: IPageLangItems = null, selectedLang: java.lang.String = null): IPageResource = {
    val __obj = js.Dynamic.literal()
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (selectedLang != null) __obj.updateDynamic("selectedLang")(selectedLang)
    __obj.asInstanceOf[IPageResource]
  }
}

