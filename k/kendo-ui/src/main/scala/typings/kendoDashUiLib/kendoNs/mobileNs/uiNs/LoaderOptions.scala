package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object LoaderOptions {
  @scala.inline
  def apply(name: java.lang.String = null): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LoaderOptions]
  }
}

