package typings
package easyDashXapiDashSupertestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowHalfOpenBoolean extends js.Object {
  var allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AllowHalfOpenBoolean {
  @scala.inline
  def apply(allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined): Anon_AllowHalfOpenBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    __obj.asInstanceOf[Anon_AllowHalfOpenBoolean]
  }
}

