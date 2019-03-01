package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackButtonOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ BackButtonClickEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object BackButtonOptions {
  @scala.inline
  def apply(
    click: js.Function1[/* e */ BackButtonClickEvent, scala.Unit] = null,
    name: java.lang.String = null
  ): BackButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BackButtonOptions]
  }
}

