package typings
package reactDashI18nextLib.reactDashI18nextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseTranslationOptions extends js.Object {
  var i18n: js.UndefOr[i18nextLib.i18nextMod.i18nextNs.i18n] = js.undefined
}

object UseTranslationOptions {
  @scala.inline
  def apply(i18n: i18nextLib.i18nextMod.i18nextNs.i18n = null): UseTranslationOptions = {
    val __obj = js.Dynamic.literal()
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    __obj.asInstanceOf[UseTranslationOptions]
  }
}

