package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait file extends js.Object {
  var validate: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object file {
  @scala.inline
  def apply(validate: js.Function0[scala.Boolean] = null): file = {
    val __obj = js.Dynamic.literal()
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[file]
  }
}

